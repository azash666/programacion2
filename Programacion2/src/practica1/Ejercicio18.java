package practica1;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = {1, 2, 3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5}, 4  ({1, 2, 3, 4})  --> " +cadeniza(eliminarPosicion(vector, 4)));
		System.out.println("{1, 2, 3, 4, 5}, 3  ({1, 2, 3, 5})  --> " +cadeniza(eliminarPosicion(vector, 3)));
		System.out.println("{1, 2, 3, 4, 5}, 1  ({1, 3, 4, 5})  --> " +cadeniza(eliminarPosicion(vector, 1)));
		System.out.println("{1, 2, 3, 4, 5}, 0  ({2, 3, 4, 5})  --> " +cadeniza(eliminarPosicion(vector, 0)));
		System.out.println("{1, 2, 3, 4, 5}, -1 ({1, 2, 3, 4, 5})  --> " +cadeniza(eliminarPosicion(vector, -1)));
		System.out.println("{1, 2, 3, 4, 5}, 5  ({1, 2, 3, 4, 5})  --> " +cadeniza(eliminarPosicion(vector, 5)));
		System.out.println("{1, 2, 3, 4, 5}, 8  ({1, 2, 3, 4, 5})  --> " +cadeniza(eliminarPosicion(vector, 8)));
	}
	
	public static int[] eliminarPosicion(int[] vector, int i) {
		// TODO Auto-generated method stub
		if(i>=vector.length || i<0) return vector;
		int[] devolver = new int[vector.length-1];
		for (int j=0; j<i; j++) {
			devolver[j]= vector[j];
		}
		for (int j=i; j<devolver.length; j++) {
			devolver[j]= vector[j+1];
		}
		return devolver;
	}

	
	
	public static String cadeniza(int[] vector) {
		String devolver="{";
		for(int i=0; i<vector.length; i++) {
			devolver = devolver + vector[i];
			if(i<vector.length-1) devolver=devolver+", ";
		}
		devolver=devolver+"}";
		return devolver;
	}
}
