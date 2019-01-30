package ejercicios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {
	public static void main ( String [] args) throws IOException {
		String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres"};
		int[] edades = {2,3,4,2};
		
		File fichero = new File("FicherosDatos.dat");
		
		DataOutputStream dataOS = new DataOutputStream ( new FileOutputStream (fichero));
		 for ( int i=0; i < prov.length ; i++){
			 dataOS.writeUTF(prov[i]);
			 dataOS.writeInt(edades[i]);
		 }
	}
}
