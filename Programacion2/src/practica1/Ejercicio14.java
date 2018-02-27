package practica1;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = {1, 2, 3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5}, 4 (3)  --> " +ultimaPosicion(vector, 4));
		System.out.println("{1, 2, 3, 4, 5}, 5 (4)  --> " +ultimaPosicion(vector, 5));
		System.out.println("{1, 2, 3, 4, 5}, 1 (0)  --> " +ultimaPosicion(vector, 1));
		System.out.println("{1, 2, 3, 4, 5}, 0 (-1) --> " +ultimaPosicion(vector, 0));
		System.out.println("{1, 2, 3, 4, 5}, 6 (-1) --> " +ultimaPosicion(vector, 6));
	}

	private static int ultimaPosicion(int[] vector, int j) {
		for (int i=vector.length-1; i>=0; i--) {
			if(vector[i]==j) return i;
		}
		return -1;
	}

}
