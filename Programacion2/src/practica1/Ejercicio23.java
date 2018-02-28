package practica1;

import java.util.Random;

public class Ejercicio23 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = aletorizaMatriz(10, 6,10);
		System.out.println("matriz 10 x 6, 5 --> "+ estaEnTodasLasColumnas(matriz, 5));
		System.out.println();
		matriz = aletorizaMatriz(6, 10,10);
		System.out.println("matriz 6 x 10, 5 --> "+ estaEnTodasLasColumnas(matriz, 5));
	}

	private static boolean estaEnTodasLasColumnas(int[][] matriz, int numero) {
		// TODO Auto-generated method stub
		boolean devolver = true;
		int filas = matriz.length;
		int columnas = matriz[0].length;
		for ( int j=0; j<columnas && devolver; j++) {
			boolean esta = false;
			for(int i=0; i<filas && !esta; i++) {
				if(matriz[i][j]==numero) esta=true;
			}
			if(!esta) {
				devolver=false;
			}
		}
		return devolver;
	}

	public static int[][] aletorizaMatriz(int filas, int columnas, int rango){
		int[][] devolver = new int[filas][columnas];
		Random rand = new Random();
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				devolver[i][j]=rand.nextInt(rango);
				System.out.print(devolver[i][j]+"  ");
			}
			System.out.println();
		}
		return devolver;
	}
	
}
