package practica1;

import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String[] args) {
		int n,numero, cantidad;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		numero=1;
		cantidad=1;
		for (int j=1;j<=n; j++) {
			int auxiliar = contarDivisores(j);
			if(auxiliar>=cantidad) {
				cantidad=auxiliar;
				numero = j;
			}
		}
		System.out.println("El número conmás divisores es "+numero+" ("+cantidad+" divisores)");
	}

	private static int contarDivisores(int j) {
		int auxiliar=1;
		for (int i=1; i<j; i++) {
			if(j%i==0)
				auxiliar++;
		}
		return auxiliar;
	}

}