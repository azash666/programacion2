package practica1;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector =  new int[]{1, 2, 3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5}, 5  ({1, 2, 3, 4})  --> " +Ejercicio18.cadeniza(eliminarValor(vector, 5)));
		System.out.println("{1, 2, 3, 4, 5}, 4  ({1, 2, 3, 5})  --> " +Ejercicio18.cadeniza(eliminarValor(vector, 4)));
		System.out.println("{1, 2, 3, 4, 5}, 1  ({2, 3, 4, 5})  --> " +Ejercicio18.cadeniza(eliminarValor(vector, 1)));
		System.out.println("{1, 2, 3, 4, 5}, 0  ({1, 2, 3, 4, 5})  --> " +Ejercicio18.cadeniza(eliminarValor(vector, 0)));
		
		vector =  new int[]{1, 2, 3, 3, 5};
		System.out.println("{1, 2, 3, 3, 5}, 3  ({1, 2, 5})  --> " +Ejercicio18.cadeniza(eliminarValor(vector, 3)));
	}

	private static int[] eliminarValor(int[] vector, int i) {
		// TODO Auto-generated method stub
		int[] auxiliar = vector;
		for(int j=vector.length-1; j>=0; j--) {
			if(vector[j] == i) {
				auxiliar = Ejercicio18.eliminarPosicion(auxiliar, j);
			}
		}
		
		return auxiliar;
	}
}
