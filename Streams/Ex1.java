package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			File fichero = new File ("p.txt"); // declaraci�n fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			int i;
			while ((i=flu.read())!=-1) //Vamos leyendo car�cter a car�cter
			System.out.println ((char) i); //hacemos cast a char del entero le�do
			flu.close();
		
		
		
		
		
		
	}

}
