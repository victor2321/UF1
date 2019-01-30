package ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex5 {

	
		// TODO Auto-generated method stub

		
		public static void main ( String [] args) throws IOException {
			File fichero = new File("p.txt");
			FileWriter fic = new FileWriter (fichero);
			String cadena = " Esto es una prueba con FileW......";
			//char [] cad = cadena.toCharArray () ;
			//for ( int i=0; i < cad.length ; i++)
			fic.write (cadena.toCharArray ()); // se va escribiendo carácter a carácter
			fic.append ('*'); // añadimos un asterisco al final
			fic.close (); // cerramos fichero
		
		
		
		
	}

}
