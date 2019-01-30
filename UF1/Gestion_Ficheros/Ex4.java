import java.io.File;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lector=new Scanner(System.in);
		
		System.out.printf("Introduce el directorio a mostrar");
		
		String dir = lector.nextLine(); // directorio actual
		File f = new File(dir);
		if (f.exists())
			   System.out.println("El fichero " + f + " existe");
			else
			   System.out.println("Pues va a ser que no existe");
		
		
		String[] archivos = f.list();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		for (int i=0; i<archivos.length; i++){
		File f2 = new File(f, archivos[i]);
		System.out.printf("Nombre: %s, es fichero?: %b, es directorio?:%b %n", archivos[i],
		 f2.isFile(), f2.isDirectory());
		
		
		}	
		
		
		
		
		
		
	}

}
