package practica1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int n;
		long solucion = 1;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i=n; i>0; i-=2) {
			solucion=solucion*i;
		}
		System.out.println(n+"!! = "+solucion);
	}

}
