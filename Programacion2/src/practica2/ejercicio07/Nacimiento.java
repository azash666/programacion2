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
		fecha = leeFecha(intentos, mínimaFechaPosterior, máximaFechaAnterior);
		while((comparacion=nacimiento.compareTo(fecha))!=0) {
			intentos++;
			if(comparacion<0) {
				System.out.println("La fecha de nacimiento es anterior.");
				mínimaFechaPosterior=fecha;
			}else {
				System.out.println("La fecha de nacimiento es posterior.");
				máximaFechaAnterior=fecha;
			}
			fecha = leeFecha(intentos, mínimaFechaPosterior, máximaFechaAnterior);
		}
		System.out.println("¡Has acertado!¡Nací el "+nacimiento+"! Has necesitado "+intentos+" intentos.");
	}
	
	private static Fecha leeFecha(int intentos, Fecha mínimaFechaPosterior, Fecha máximaFechaAnterior) {
		Scanner teclado = new Scanner(System.in);
		boolean bien = true;
		Fecha devolver = null;
		System.out.println("Intento número "+intentos+":");
		while(bien) {
			System.out.print("DÍA: ");
			int dia = teclado.nextInt();
			System.out.print("MES: ");
			int mes = teclado.nextInt();
			System.out.print("AÑO: ");
			int año = teclado.nextInt();
			devolver = new Fecha(dia, mes, año);
			if(devolver.compareTo(máximaFechaAnterior)<=0) {
				System.out.println("Introduzca una fecha posterior a "+máximaFechaAnterior);
				bien=true;
			}else {
				if(devolver.compareTo(mínimaFechaPosterior)>=0) {
					System.out.println("Introduzca una fecha anterior a "+mínimaFechaPosterior);
					bien=true;
				}else {
					bien=false;
				}
			}
		}
		return devolver;
	}
}
