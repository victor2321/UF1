package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "FicheroTexto.txt";
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(path));
		
			for (int i = 0; i < 11; i++){
				bw.write("aaaaaaaaaa");
				bw.newLine();
			}		
			bw.close(); //
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
