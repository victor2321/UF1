package ejercicios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tres_raya {

	public final static String FILE_NAME = "3enraya.state";

	public static void guardarEstado(Estado_partida partida) {
		try {
			FileOutputStream fis = new FileOutputStream(FILE_NAME);
			ObjectOutputStream dis = new ObjectOutputStream(fis);
			/*
			 * file structure boolean player int x int y
			 */
			dis.writeObject(partida);
			dis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

	public static Estado_partida recuperarEstado() {
		Estado_partida partida;
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ObjectInputStream dis = new ObjectInputStream(fis);
			/*
			 * file structure boolean player int x int y
			 */

			partida = (Estado_partida) dis.readObject();
			dis.close();
			fis.close();
			return partida;
		} catch (EOFException e) {
			System.out.println("\nENd of file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("mal formed file");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
