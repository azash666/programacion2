package practica2.ejercicio02;

import practica2.ejercicio01.Punto;

public class RestauranteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pruebas del constructor");
		Restaurante[] restaurantes = new Restaurante[9];
		restaurantes[0] = new Restaurante("Restaurante 1", new Punto(0, 0), 5);
		restaurantes[1] = new Restaurante("Restaurante 2", new Punto(0, 2), 4);
		restaurantes[2] = new Restaurante("Restaurante 3", new Punto(2, 0), 3);
		restaurantes[3] = new Restaurante("Restaurante 4", new Punto(5, 5), 2);
		restaurantes[4] = new Restaurante("Restaurante 5", new Punto(-3, 0), 1);
		restaurantes[5] = new Restaurante("Restaurante 6", new Punto(0, -5), 0);
		restaurantes[6] = new Restaurante("Restaurante 7", new Punto(3, -5), 6);
		restaurantes[7] = new Restaurante("Restaurante 8", new Punto(2, 8), 9);
		restaurantes[8] = new Restaurante("Restaurante de Sanji", new Punto(100, 100), 10);
		
		System.out.println("\nProbando getNombre");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" se llama "+restaurantes[i].getNombre());
		}

		System.out.println("\nProbando getPunto");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" se encuentra en "+restaurantes[i].getPosición());
		}

		System.out.println("\nProbando getValoracion");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" esta valorado como "+restaurantes[i].getValoración());
		}

		System.out.println("\nProbando distancia");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" está a "+restaurantes[i].distancia(new Punto(1,1))+" del punto (1, 1)");
		}
		
		System.out.println("\nProbando leeRestaurantes");
		restaurantes = Restaurante.leeRestaurantes("restaurantes.txt");
		System.out.println("Creado un vector de longitud "+restaurantes.length);

		System.out.println("\nProbando getNombre del leeRestaurantes");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" se llama "+restaurantes[i].getNombre());
		}

		System.out.println("\nProbando getPunto del leeRestaurantes");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" se encuentra en "+restaurantes[i].getPosición());
		}

		System.out.println("\nProbando getValoracion del leeRestaurantes");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" esta valorado como "+restaurantes[i].getValoración());
		}

		System.out.println("\nProbando distancia del leeRestaurantes");
		for(int i=0; i<restaurantes.length; i++) {
			System.out.println("Restaurante nº "+i+" está a "+restaurantes[i].distancia(new Punto(1,1))+" del punto (1, 1)");
		}
	}

}
