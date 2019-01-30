package ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		File fichero = new File("FicherosDatos.dat");
		
		
		FileInputStream filein= new FileInputStream (fichero);
		DataInputStream dataIS = new DataInputStream (filein);
		
		try{
			
			while(true){
				
				String var=dataIS.readUTF();
				
				int i=dataIS.readInt();
				
				System.out.println(var+" "+i+" ");
				
			}
			
		}catch(EOFException e){
			
			System.out.println("fin");
			
			
		}
		
		dataIS.close();
		
		
		
		
		
		
		
	}

}
