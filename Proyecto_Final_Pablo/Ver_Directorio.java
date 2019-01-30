import java.io.*;
import java.util.Scanner;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;  
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class Ver_Directorio{
	public static void main (String[] args) throws IOException {
		int user;
		do{
		Scanner lector=new Scanner(System.in);
		System.out.println("-------Proyecto UF1-------");
		System.out.println(" ");
		System.out.println("-1. Ver Directorio-------");
		System.out.println("-2. Crear Fichero--------");
		System.out.println("-3. Modificar Fichero----");
		System.out.println("-4. Leer Fichero---------");
		System.out.println("-5. Generar XML----------");
		System.out.println("-0. EXIT-----------------");
		System.out.println(" ");
		System.out.println("-------------------------");
		user = lector.nextInt();
		
		if (user==1){
			System.out.println("Vemos el directorio donde se guardan los archivos.");
			String dir = ".";
			File f = new File(dir);
			String[] archivos = f.list();
			System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
			for (int i=0; i<archivos.length; i++){
				File f2 = new File(f, archivos[i]);
				System.out.printf("Nombre del Fichero: %s %n", archivos[i]);
			}
		}
		
		if (user==2){
			System.out.println("Creamos el fichero.");
			File fichero = new File ("AleatorioEmpleado.dat");
			RandomAccessFile file = new RandomAccessFile (fichero , "rw");
			
			String apellido[] = {"Fernández", "Gil", "López", "Ramos"};
			int dep[] =  {10,20,10,10};
			Double salario[] = {1000.45,2400.60,3000.0,1500.56};
			StringBuffer buffer = null; 
			int n = apellido.length;
			
			for (int i = 0; i<n; i++) { 
				file.writeInt (i+1);
				buffer = new StringBuffer (apellido[i]);
				buffer.setLength(10);
				file.writeChars (buffer.toString());
				file.writeInt(dep[i]);
				file.writeDouble (salario[i]);
			}
			file.close();
		}
		
		if(user==3){
			
			File fichero = new File ("AleatorioEmpleado.dat");
			RandomAccessFile file = new RandomAccessFile (fichero , "rw");
			int id, dep ,posicion;
			Double salario;
			char apellido[]= new char[10], aux;
		
			StringBuffer buffer = null; //Buffer para almacenar apellido
			int n = apellido.length; //Número de elementos en el array
			int j =0;
			posicion =0;
			System.out.println("Inserta el Identificador a modificar:");
			int iden = lector.nextInt();

			System.out.println("Inserta el importe:");
			Double impor = lector.nextDouble();
			for ( ; ; ){
				file.seek (posicion); // Nos posicionamos en posicion
				id = file.readInt(); // Obtengo identificar de Empleado
				for ( int i =0; i<apellido.length; i++) {
					aux = file.readChar(); // Voy leyendo carácter a carácter el apellido y lo guardo
					apellido[i]=aux; // en el array apellido
				}
				String apellidos = new String (apellido);
				dep = file.readInt(); //Lectura de departamento y salario
				salario = file.readDouble();
						
				if (id==iden) {
					file.seek (posicion+28);
					Double suma = salario+impor;
					file.writeDouble (suma);
					System.out.println("Salario nuevo: "+suma+ " Salario antigo: "+ salario);break;
				}
				posicion = posicion + 36;
				if (file.getFilePointer() ==file.length()) break; // Si he recorrido todo el fichero, salgo
			} 
				file.close(); // No olvidarse de cerrar el fichero
		
		}
		
		if(user==4){
			System.out.println("Leemos el fichero.");
			File fichero = new File ("AleatorioEmpleado.dat");
			RandomAccessFile file = new RandomAccessFile (fichero, "r");

			int id, dep ,posicion;
			Double salario;
			char apellido[]= new char[10], aux;
			posicion = 0;

			for ( ; ; ){
				file.seek (posicion); 
				id = file.readInt(); 
				for ( int i =0; i<apellido.length; i++) {
					aux = file.readChar(); 
					apellido[i]=aux; 
				}

				String apellidos = new String (apellido);
				dep = file.readInt(); 
				salario = file.readDouble();

				if (id > 0)
					System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario);
				posicion = posicion + 36;

				if (file.getFilePointer() ==file.length()) break; 
			}                  
			file.close();
		}
		if(user==5){
			System.out.println("Generamos el XML");
			
			File fichero = new File ("AleatorioEmpleado.dat");
			RandomAccessFile file = new RandomAccessFile(fichero, "r");
			
			int id, dep, posicion=0;
			Double salario;
			char apellido[] = new char[10], aux;
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			
			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				DOMImplementation implementation = builder.getDOMImplementation();
				Document document = implementation.createDocument (null,"Empleados", null);
				document.setXmlVersion("1.0");
				
				for ( ; ;) {
					file.seek(posicion);
					id = file.readInt();
					for (int i = 0; i < apellido.length ; i++) {
						aux =file.readChar();
						apellido[i] = aux;
					}
					
					String apellidos = new String (apellido);
					dep = file.readInt();
					salario = file.readDouble();
					
					if (id>0) {
						Element raiz = document.createElement ("empleado");
						document.getDocumentElement().appendChild(raiz);
						CrearElemento ("id", Integer.toString(id), raiz, document);
						CrearElemento ("apellido",apellidos.trim(), raiz, document);
						CrearElemento ("dep", Integer.toString(dep), raiz, document);
						CrearElemento ("salario", Double.toString(salario),raiz, document);
					}
					
					posicion = posicion + 36;
					if (file.getFilePointer() == file.length()) break;
				}
				
				Source source = new DOMSource (document);
				Result result = new StreamResult (new java.io.File ("Empleados.xml"));
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				transformer.transform (source, result);
				
			} catch (Exception e ) { 
				System.err.println ("Error: " + e);
			}
			
			file.close();
		}
		}while(user!=0);
		System.out.println ("¡¡¡Fin del Programa!!!");
	}
	static void CrearElemento (String datoEmpleado, String valor, Element raiz, Document document) {
		Element elem = document.createElement (datoEmpleado);
		Text text = document.createTextNode(valor);
		raiz.appendChild (elem);
		elem.appendChild (text);
	}
	
	
	
	

}