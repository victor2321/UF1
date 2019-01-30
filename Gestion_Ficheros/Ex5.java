import java.io.File;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner lector=new Scanner(System.in);
		
		System.out.printf("Introduce el directorio a mostrar");
		
		String dir = lector.nextLine(); // directorio actual
		File f = new File(dir);
		
		System.out.println("el nombre del fichero es "+f.getName());
		System.out.println("la ruta absoluta del fichero es "+f.getAbsolutePath());
		System.out.println("la ruta relativa del fichero es "+f.getPath());
		System.out.println("la longitud del fichero es  "+f.length());
		System.out.println("los permisos del fichero  "+f.length());
		
		
		
	}

}
