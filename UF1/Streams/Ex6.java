package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex6 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			File fichero = new File("p.txt");
			FileWriter fic = new FileWriter (fichero);
			
			String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen",
					"Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};

			
			
			
			//char [] cad = cadena.toCharArray () ;
			for ( int i=0; i < prov.length-1 ; i++){
				fic.write ((prov[i]+"  ").toCharArray ());
			} // se va escribiendo carácter a carácter
			
			fic.append (prov[prov.length-1]); 
			fic.close (); // cerramos fichero
		
		
		
		
	}

}
