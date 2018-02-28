package practica1;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		int n;
		long solucion = 1;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i=1; i<=n; i++) {
			solucion=solucion*i;
		}
		System.out.println("El factorial de "+n+" es "+solucion);
	}
}