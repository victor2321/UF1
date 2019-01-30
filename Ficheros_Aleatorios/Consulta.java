import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Consulta {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.print("Introduce el id del empleado: ");
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		String intro = leer.readLine();
		int id = Integer.parseInt(intro);

		leerFicheroAleatorio(id);
	}

	public static void leerFicheroAleatorio(int inputId) throws IOException {
		File fichero = new File ("AleatorioEmpleado.dat");
		RandomAccessFile file = new RandomAccessFile (fichero, "r");

		int id, dep, posicion;
		Double salario;
		char apellido[]= new char[10], aux;
		posicion = 0;

		for ( ; ; ) {
			file.seek (posicion); // Nos posicionamos en posicion
			id = file.readInt(); // Obtengo identificar de Empleado
			if (id == inputId) {
				for ( int i = 0; i < apellido.length; i++) {
					aux = file.readChar(); // Voy leyendo carácter a carácter el apellido y lo guardo
					apellido[i]=aux; // en el array apellido
				}

				String apellidos = new String (apellido);
				dep = file.readInt(); //Lectura de departamento y salario
				salario = file.readDouble();

				if (id > 0) {
					System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario);
					break;
				} else {
					System.out.printf("El ir no es valido!!");
					break;
				}
	
			} else {
				posicion += 36;
				if (posicion == file.length()) {
					System.out.println("No existe el empleado");
					break; // Si he recorrido todo el fichero, salgo del for
				}
			}
		}
		file.close();
		
		
		
	}

}
