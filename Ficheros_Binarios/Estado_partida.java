package ejercicios;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Estado_partida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3649629845346565086L;
	public boolean turno;// A
	public Pieza[] piezas;

	public Estado_partida() {
		this.piezas = new Pieza[6];
		this.piezas[0] = new Pieza(0, 0, false);
		this.piezas[1] = new Pieza(0, 1, false);
		this.piezas[2] = new Pieza(0, 2, false);

		this.piezas[3] = new Pieza(2, 0, true);
		this.piezas[4] = new Pieza(2, 1, true);
		this.piezas[5] = new Pieza(2, 2, true);
		
		this.turno=false;
	}

	public String toString(){
		String out="Estado partida actual:\n";
		for (Pieza z : this.piezas) {
			out+="pieza ";
			if(z.jugador){
				out+="del jugador A ";
			}else{
				out+="del jugador B ";
			}
			out+="en posicion x="+z.x+" y="+z.y+"\n";
		}
		return out;
	}

}
 class Pieza implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5276075804404002042L;
	public int x;
	public int y;
	public boolean jugador;// false jugador A, true jugador B

	public Pieza(int x, int y, boolean jugador) {
		this.x = x;
		this.y = y;
		this.jugador = jugador;
	}
	public Pieza() {
	}
}
