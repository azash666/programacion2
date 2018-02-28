package practica1;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector =  new int[]{1, 2, 3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5}, 5  (true)  --> " +contiene(vector, 5));
		System.out.println("{1, 2, 3, 4, 5}, 1  (true)  --> " +contiene(vector, 1));
		System.out.println("{1, 2, 3, 4, 5}, 3  (true)  --> " +contiene(vector, 3));
		System.out.println("{1, 2, 3, 4, 5}, 0  (false)  --> " +contiene(vector, 0));
		System.out.println("{1, 2, 3, 4, 5}, 8  (false)  --> " +contiene(vector, 8));


		int[] vector2 =  new int[]{3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5}, {3, 4, 5}  (true)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{1, 4, 3};
		System.out.println("{1, 2, 3, 4, 5}, {1, 4, 3}  (true)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{3, 4, 6};
		System.out.println("{1, 2, 3, 4, 5}, {3, 4, 6}  (false)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{3, 4, 6};
		System.out.println("{1, 2, 3, 4, 5}, {9, 4, 3}  (false)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{3};
		System.out.println("{1, 2, 3, 4, 5}, {3}  (true)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{1};
		System.out.println("{1, 2, 3, 4, 5}, {1}  (true)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{5};
		System.out.println("{1, 2, 3, 4, 5}, {5}  (true)  --> " +contiene(vector, vector2));
		vector2 =  new int[]{};
		System.out.println("{1, 2, 3, 4, 5}, {}  (true)  --> " +contiene(vector, vector2));
	}

	
	public static boolean contiene(int[] vector, int i) {
		// TODO Auto-generated method stub
		for(int j=0; j<vector.length; j++) {
			if(vector[j]== i) return true;
		}
		return false;
	}

	
	private static boolean contiene(int[] vector, int[] vector2) {
		// TODO Auto-generated method stub
		for (int j=0; j<vector2.length; j++) {
			if(!contiene(vector, vector2[j])) return false;
		}
		return true;
	}

}
