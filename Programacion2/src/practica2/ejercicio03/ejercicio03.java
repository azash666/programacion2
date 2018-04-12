package practica2.ejercicio03;

import java.util.Scanner;

import practica2.ejercicio01.Punto;
import practica2.ejercicio02.Restaurante;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double x, y;
		System.out.print("Indique su posición actual:\nCoordenada X: ");
		x = teclado.nextDouble();
		System.out.print("Coordenada Y: ");
		y = teclado.nextDouble();
		teclado.close();
		Restaurante aux = restauranteMásPróximo(Restaurante.leeRestaurantes("restaurantes.txt"), new Punto(x,y));
		System.out.println("El restaurante más cercano a su posición es "+aux.getNombre()+", situado en el punto "+aux.getPosición());
	}
	
	public static Restaurante restauranteMásPróximo(Restaurante[] v, Punto p) {
		Restaurante min=v[0];
		for(int i=1; i<v.length; i++) {
			if(v[i].distancia(p)<min.distancia(p))
				min=v[i];
		}
		return min;
	}

}
