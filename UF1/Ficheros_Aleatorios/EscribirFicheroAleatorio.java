import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroAleatorio {

	
		// TODO Auto-generated method stub

		public static void main (String [] args) throws IOException {
			File fichero = new File ("AleatorioEmpleado.dat");
			RandomAccessFile file = new RandomAccessFile (fichero , "rw");
			String apellido[] = {"Fern�ndez", "Gil", "L�pez", "Ramos"};
			int dep[] = {10,20,10,10};
			Double salario[] = {1000.45,2400.60,3000.0,1500.56};
			StringBuffer buffer = null; //Buffer para almacenar apellidohfhfhf
			int n = apellido.length; //N�mero de elementos en el array
			for (int i = 0; i<n; i++) { //Recorro los arrays
			file.writeInt (i+1);
			buffer = new StringBuffer (apellido[i]);
			buffer.setLength(10); // Fijo en 10 caracteres la longitud del apellido
			file.writeChars (buffer.toString());
			file.writeInt(dep[i]);
			file.writeDouble (salario[i]);
			}
			file.close(); // No olvidarse de cerrar el fichero
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


