import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
			
			File d=new File("NuevoDir");
			File f1= new File(d,"Fichero1.txt");
			File f2= new File (d,"Fichero2.txt");
			
			if (f1.delete())
				System.out.println("Fichero1 eliminado correctamente");
			else
				System.out.println("No se ha podido eliminar Fichero1");
			if (f2.delete())
				System.out.println("Fichero2 eliminado correctamente");
			else
				System.out.println("No se ha podido eliminar Fichero2");

			if (d.delete())
				System.out.println("NuevoDir eliminado correctamente");
			else
				System.out.println("No se ha podido eliminar NuevoDir");
			
			
	
		
		}

}
