package practica1;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vector = new String[]{"a", "b", "c", "d", "e"};
		System.out.println("{\"a\", \"b\", \"c\", \"d\", \"e\"} (true)  --> " +estaOrdenado(vector));
		vector = new String[]{"a", "b", "z", "d", "e"};
		System.out.println("{\"a\", \"b\", \"z\", \"d\", \"e\"} (false)  --> " +estaOrdenado(vector));
		vector = new String[]{"a", "b", "z", "z", "e"};
		System.out.println("{\"a\", \"b\", \"z\", \"z\", \"e\"} (false)  --> " +estaOrdenado(vector));
		vector = new String[]{"a", "b", "c", "c", "e"};
		System.out.println("{\"a\", \"b\", \"c\", \"c\", \"e\"} (true)  --> " +estaOrdenado(vector));
		vector = new String[]{"a", "b", "c", "d", "a"};
		System.out.println("{\"a\", \"b\", \"c\", \"d\", \"a\"} (false)  --> " +estaOrdenado(vector));
		vector = new String[]{"z", "b", "c", "d", "e"};
		System.out.println("{\"z\", \"b\", \"c\", \"d\", \"e\"} (false)  --> " +estaOrdenado(vector));
		vector = new String[]{"z"};
		System.out.println("{\"z\"} (true)  --> " +estaOrdenado(vector));
		vector = new String[]{};
		System.out.println("{} (true)  --> " +estaOrdenado(vector));
	}

	private static boolean estaOrdenado(String[] vector) {
		// TODO Auto-generated method stub
		if(vector.length<2) return true;
		for(int i=1; i<vector.length; i++) {
			if(vector[i].compareTo(vector[i-1])<0) {
				return false;
			}
		}
		return true;
	}

	

}
