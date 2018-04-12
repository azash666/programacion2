package practica2.ejercicio07;

import java.util.Scanner;

import practica2.ejercicio05.Fecha;

public class Nacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha nacimiento= new Fecha(18,02,1987);
		Fecha fecha, mínimaFechaPosterior=Fecha.hoy(), máximaFechaAnterior=new Fecha(1,1,0);
		int intentos=1, comparacion;
		System.out.println("Bienvenido al programa de adivina cuando nació Daniel Delgado Gomis.\nPor favor, itroduzca una fecha:");
		fecha = leeFecha(intentos);
		while((comparacion=nacimiento.compareTo(fecha))!=0) {
			intentos++;
			if(comparacion<0) {
				System.out.println("La fecha de nacimiento es anterior.");
			}else {
				System.out.println("La fecha de nacimiento es posterior.");
			}
			fecha = leeFecha(intentos);
		}
		System.out.println("¡Has acertado!¡Nací el "+nacimiento+"! Has necesitado "+intentos+" intentos.");
	}
	
	private static Fecha leeFecha(int intentos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intento número "+intentos+":");
		System.out.print("DÍA: ");
		int dia = teclado.nextInt();
		System.out.print("MES: ");
		int mes = teclado.nextInt();
		System.out.print("AÑO: ");
		int año = teclado.nextInt();
		return new Fecha(dia, mes, año);
	}
}
