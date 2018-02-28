package practica1;

import java.util.Random;

public class Ejercicio22 {
	private static int annoActual = 2018;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz = aletorizaMatriz(1900, 100);
		System.out.println("matriz, 5 --> "+ masOlasDeFrio(matriz, 5));
	}

	private static int masOlasDeFrio(double[][] vector, int diasSeguidos) {
		// TODO Auto-generated method stub
		int anno = annoActual-1, annoFrio, olasFrioMaximo;
		annoFrio = annoActual-1;
		olasFrioMaximo=Ejercicio16.contarOlasDeFrio(vector[vector.length-1], diasSeguidos);
		for (int j=vector.length-2; j>=0; j--) {
			anno--;
			if(olasFrioMaximo<Ejercicio16.contarOlasDeFrio(vector[j], diasSeguidos)) {
				olasFrioMaximo=Ejercicio16.contarOlasDeFrio(vector[j], diasSeguidos);
				annoFrio=anno;
			}
			
		}
		return annoFrio;
	}

	public static double[][] aletorizaMatriz(int annoInicial, int numDias){
		double[][] devolver = new double[annoActual-annoInicial][numDias];
		for (int i=annoInicial; i<annoActual; i++) {
			System.out.println("\t\t --> Año: "+i);
			devolver[i-annoInicial]=Ejercicio16.aletoriza(numDias);
			System.out.println(Ejercicio16.contarOlasDeFrio(devolver[i-annoInicial], 5)+"\n");
		}
		return devolver;
	}
	
}
