package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			char[] buf = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			File fichero = new File ("p.txt"); // declaraci�n fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
			int i;
			while ((i=flu.read(buf))!=-1){ //Vamos leyendo car�cter a car�cter
			for(char c : buf)
				System.out.print (c); //hacemos cast a char del entero le�do
			System.out.println("");}
			flu.close();
		
		
		
		
		
		
	}

}
