package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			File fichero = new File ("p.txt"); // declaración fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			int i;
			while ((i=flu.read())!=-1) //Vamos leyendo carácter a carácter
			System.out.println ((char) i); //hacemos cast a char del entero leído
			flu.close();
		
		
		
		
		
		
	}

}
