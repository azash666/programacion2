package practica1;

import java.util.Scanner;


public class Ejercicio04 {

	public static void main(String[] args) {
		int n;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.print("Los números primos menores de "+n+" son:");
		for (int j=2;j<n; j++) {
			boolean salida = true;
			for (int i=2; i<j; i++) {
				if(j%i==0)
					salida=false;
			}
			if(salida) {
				System.out.print(" "+j);
			}
		}
	}

}