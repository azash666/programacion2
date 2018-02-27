package practica1;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'Hola' | 'ola' (true) --> "+esSufijo("Hola","ola"));
		System.out.println("'Hola' | 'Sola' (false) --> "+esSufijo("Hola", "Sola"));
		System.out.println("'Hola' | 'Holm' (false) --> "+esSufijo("Hola","Holm"));
		System.out.println("'ola' | 'Hola' (false) --> "+esSufijo("ola", "Hola"));
		System.out.println("'' | 'Hola' (false) --> "+esSufijo("", "Hola"));
		System.out.println("'Hola' | '' (true) --> "+esSufijo("Hola", ""));
		
	}

	public static boolean esSufijo(String palabra, String sufijo) {
		// TODO Auto-generated method stub
		int longitudPalabra=palabra.length();
		int longitudSufijo = sufijo.length();
		boolean devolver = true;
		if (longitudPalabra<longitudSufijo)
			return false;
		
		for(int i=0; i<longitudSufijo; i++) {
			if(sufijo.charAt(longitudSufijo-i-1)!=palabra.charAt(longitudPalabra-i-1)) {
				devolver=false;
			}
		}
		return devolver;
	}

	
	
}
