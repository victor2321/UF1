package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex7 {

	
		// TODO Auto-generated method stub

		
		public static void main (String [] args) {
			System.out.println("Escribe nombre de fichero: ");
			Scanner read = new Scanner(System.in);
			String filePath = read.nextLine();

			// comprovar si existeix
			File f = new File(filePath);
			while (!f.isFile()) {
				System.out.println("Fichero no existe");
				filePath = read.nextLine();
				f = new File(filePath);
			}
			BufferedReader bf;
			try {
				bf = new BufferedReader(new FileReader(filePath));
				System.out.println("leyendo fichero:  "+ filePath);
				String in;
				while((in= bf.readLine())!=null){
					System.out.println(in);
				}			
				bf.close(); //
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
