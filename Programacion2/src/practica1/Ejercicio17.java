package practica1;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[]{1, 2, 3, 4, 5};
		System.out.println("{1, 2, 3, 4, 5} (false)  --> " +hayRepetidos(vector));
		
		vector = new int[]{1, 2, 3, 4, 4};
		System.out.println("{1, 2, 3, 4, 4} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2, 2, 3, 4, 5};
		System.out.println("{2, 2, 3, 4, 5} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{1, 2, 3, 4, 3};
		System.out.println("{1, 2, 3, 4, 3} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2, 1, 3, 4, 2};
		System.out.println("{2, 1, 3, 4, 2} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2, 1, 2, 4, 3};
		System.out.println("{2, 1, 2, 4, 3} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2, 2};
		System.out.println("{2, 2} (true)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2, 1};
		System.out.println("{2, 1} (false)  --> " +hayRepetidos(vector));
		
		vector = new int[]{2};
		System.out.println("{2} (false)  --> " +hayRepetidos(vector));
		
		vector = new int[]{};
		System.out.println("{} (false)  --> " +hayRepetidos(vector));
		
	}

	private static boolean hayRepetidos(int[] vector) {
		// TODO Auto-generated method stub
		if(vector.length<2) return false;
		for(int i=0; i<vector.length-1; i++) {
			for(int j=i+1; j<vector.length; j++) {
				if(vector[i]==vector[j]) return true;
			}
		}
		return false;
	}


}
