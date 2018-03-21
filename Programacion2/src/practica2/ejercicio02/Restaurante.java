package practica2.ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import practica2.ejercicio01.Punto;

public class Restaurante {

	private String nombre;
	private Punto punto;
	private int puntuacion;

	public Restaurante(String nombre, Punto posicion, int valoracion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.punto = posicion;
		this.puntuacion=valoracion;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public Punto getPosición() {
		// TODO Auto-generated method stub
		return punto;
	}

	public int getValoración() {
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
		int i=0;
		while(entrada.hasNextDouble()) {
			Punto puntoAux = new Punto(entrada.nextDouble(),entrada.nextDouble());
			int puntuacionAux = entrada.nextInt();
			String nombreAux = entrada.next();
			rest[i]=new Restaurante(nombreAux, puntoAux, puntuacionAux);
			i++;
		}
		return rest;
	}
	
	

}
