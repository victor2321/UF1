package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			char[] buf = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			Scanner lector=new Scanner(System.in);
			
			System.out.printf("Introduce el fichero a mostrar");
			
			String dir = lector.nextLine(); // directorio actual
			File fichero = new File(dir);
			
			
			
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			int i;
			while ((i=flu.read(buf))!=-1){ //Vamos leyendo carácter a carácter
			for(char c : buf)
				System.out.print (c); //hacemos cast a char del entero leído
			System.out.println("");}
			flu.close();
		
		
		
		
		
		
	}

}
