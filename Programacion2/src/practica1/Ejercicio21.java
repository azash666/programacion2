package practica1;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector =  new int[]{10, 20, 30, 40, 50};
		System.out.println("{10, 20, 30, 40, 50}, 25  (2)  --> " +posicionInsercion(vector, 25));
		System.out.println("{10, 20, 30, 40, 50}, 5  (0)  --> " +posicionInsercion(vector, 5));
		System.out.println("{10, 20, 30, 40, 50}, 225  (5)  --> " +posicionInsercion(vector, 225));
		System.out.println("{10, 20, 30, 40, 50}, 30  (2)  --> " +posicionInsercion(vector, 30));
	}

	private static int posicionInsercion(int[] vector, int i) {
		for (int j=0; j<vector.length; j++) {
			if(i<=vector[j]) return j;
		}
		return vector.length;
	}

	
	

}
