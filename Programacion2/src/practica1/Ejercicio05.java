package practica1;

import java.util.Scanner;


public class Ejercicio05 {

	public static void main(String[] args) {
		int n;
		long resultado = 1;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int j=2;j<=n; j++) {
			boolean esPrimo = true;
			for (int i=2; i<j; i++) {
				if(j%i==0)
					esPrimo=false;
			}
			if(esPrimo) {
				resultado=resultado*j;
			}
		}
		System.out.println(n+"# = "+resultado);
	
	}

}