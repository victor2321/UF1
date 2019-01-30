import java.io.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		File d=new File("NuevoDir");
		File f1= new File(d,"Fichero1.txt");
		File f2= new File (d,"Fichero2.txt");
		d.mkdir();
		try {
			
			if (f1.createNewFile())
				System.out.println("Fichero1 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero1");
			if (f2.createNewFile())
				System.out.println("Fichero2 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero2");
		
		} 
		catch (IOException ioe) {ioe.printStackTrace();}
		
		
		
		
		
		
		
		
		
		
		
	}

}
