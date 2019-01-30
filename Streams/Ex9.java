package ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "FicheroTexto.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(path));
		
			for (int i = 0; i < 11; i++){
				pw.print("bbbbbbbbbb");
				pw.println();
			}		
			pw.close(); //
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
