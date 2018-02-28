package practica1;

import java.util.Random;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vector = aletoriza(100);
		System.out.println("vector, 5 --> "+ contarOlasDeFrio(vector, 5));
	}

	public static int contarOlasDeFrio(double[] vector, int i) {
		// TODO Auto-generated method stub
		int nOlas = 0;
		int contar=0;
		boolean positivo = true;
		for (int j=0; j<vector.length; j++) {
			if(vector[j]<0 && positivo) {
				positivo = false;
			}
			if(vector[j]<0 && !positivo) {
				contar++;
			}
			if(vector[j]>0 && !positivo) {
				positivo=true;
				if(contar>=i) nOlas++;
				contar = 0;
			}
		}
		if(contar>=i) nOlas++;
		return nOlas;
	}

	public static double[] aletoriza(int n) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		double[] devolver = new double[n];
		int i=0;
		while(i<n) {
			int j = rand.nextInt(10);
			for(int k=0; k<j && i<n; k++) {
				devolver[i]=rand.nextDouble()*20;
				//System.out.println(i+" -> "+ devolver[i]);
				i++;
			}
			j = rand.nextInt(10);
			for(int k=0; k<j && i<n; k++) {
				devolver[i]=rand.nextDouble()*(-20);
				//System.out.println("         "+i+" -> "+ devolver[i]);
				i++;
			}
		}
		return devolver;
	}
}
