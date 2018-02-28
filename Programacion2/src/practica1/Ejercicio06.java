package practica1;

import java.util.Scanner;


public class Ejercicio06 {

	public static void main(String[] args) {
		int n,numero, cantidad;
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		numero=1;
		cantidad=1;
		for (int j=1;j<=n; j++) {
			int auxiliar=1;
			for (int i=1; i<j; i++) {
				if(j%i==0)
					auxiliar++;
			}
			if(auxiliar>=cantidad) {
				cantidad=auxiliar;
				numero = j;
			}
		}
		System.out.println("El número conmás divisores es "+numero+" ("+cantidad+" divisores)");
	}

}