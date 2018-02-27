package practica1;

import java.util.Scanner;


public class Ejercicio08 {

	public static void main(String[] args) {
		int n;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.print("Los números primos menores de "+n+" son:");
		for (int j=2;j<n; j++) {
			
			if(Ejercicio07.esPrimo(j)) {
				System.out.print(" "+j);
			}
		}
	}
	
	

}