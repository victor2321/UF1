import java.io.File;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
		String dir = "C:\\Users\\victor\\Desktop"; // directorio actual
		File f = new File(dir);
		String[] archivos = f.list();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);; // directorio actual
		for (int i=0; i<archivos.length; i++){
		File f2 = new File(f, archivos[i]);
		System.out.printf("Nombre: %s, es fichero?: %b, es directorio?:%b %n", archivos[i],
		f2.isFile(), f2.isDirectory());
		
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
