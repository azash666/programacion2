package practica1;

import java.util.Scanner;


public class Ejercicio03 {

	public static void main(String[] args) {
		int n;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		boolean salida = true;
		for (int i=2; i<n; i++) {
			if(n%i==0)
				salida=false;
		}
		if(salida) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}

}