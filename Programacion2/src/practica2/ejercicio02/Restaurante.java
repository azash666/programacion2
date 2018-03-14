package practica2.ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import practica2.ejercicio01.Punto;

public class Restaurante {

	private String nombre;
	private Punto punto;
	private int puntuacion;

	public Restaurante(String string, Punto punto, int i) {
		// TODO Auto-generated constructor stub
		this.nombre = string;
		this.punto = punto;
		this.puntuacion=i;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public Punto getPunto() {
		// TODO Auto-generated method stub
		return punto;
	}

	public int getValoracion() {
		// TODO Auto-generated method stub
		return puntuacion;
	}

	public double distancia(Punto punto2) {
		// TODO Auto-generated method stub
		return punto.distancia(punto2);
	}

	public static Restaurante[] leeRestaurantes(String string) {
		// TODO Auto-generated method stub
		Scanner entrada = null;
		try {
			entrada = new Scanner(new File("lib/"+string));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Restaurante[] rest = new Restaurante[Integer.parseInt(entrada.nextLine())];
		return null;
	}
	
	

}
