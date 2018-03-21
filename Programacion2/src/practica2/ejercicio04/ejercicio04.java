package practica2.ejercicio04;

import java.util.Scanner;

import practica2.ejercicio01.Punto;
import practica2.ejercicio02.Restaurante;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double x, y, dist;
		System.out.print("Indique su posición actual:\nCoordenada X: ");
		x = teclado.nextDouble();
		System.out.print("Coordenada Y: ");
		y = teclado.nextDouble();
		System.out.print("Distancia Máxima: ");
		dist = teclado.nextDouble();
		teclado.close();
		Restaurante aux = restauranteMejorValorado(Restaurante.leeRestaurantes("restaurantes.txt"), new Punto(x,y), dist);
		System.out.println("El restaurante más cercano y mejor valorado a su posición es "+aux.getNombre()+", situado en el punto "+aux.getPosición()+", con Valoración de "+aux.getValoración());
	}
	
	public static Restaurante restauranteMejorValorado(Restaurante[] v, Punto p, Double distanciaMaxima) {
		boolean ningunoCerca = true;
		Restaurante aux = null;
		for(int i=0; i<v.length; i++) {
			if(v[i].distancia(p)<=distanciaMaxima) {
				if(ningunoCerca) {
					aux=v[i];
					ningunoCerca=false;
				}else {
					if(v[i].getValoración()>aux.getValoración())
						aux=v[i];
				}
			}
			
		}
		return aux;
	}

}
