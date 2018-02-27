package practica1;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'Mi mama me mima', 3 ('me') --> " +obtenerPalabra("Mi mama me mima", 3));
		System.out.println("'Mi mama me mima', 5 (null) --> " +obtenerPalabra("Mi mama me mima", 5));
		System.out.println("'Mi mama me mima', 0 (null) --> " +obtenerPalabra("Mi mama me mima", 0));
		System.out.println("'Mi  mama  me  mima', 3 ('me') --> " +obtenerPalabra("Mi  mama  me  mima", 3));
		System.out.println("'Mi mama me mima', 1 ('Mi') --> " +obtenerPalabra("Mi mama me mima", 1));
		System.out.println("'Mi mama me mima', 4 ('mima') --> " +obtenerPalabra("Mi mama me mima", 4));
	}

	private static String obtenerPalabra(String frase, int numero) {
		if(numero>Ejercicio12.contarPalabras(frase) || numero <=0) 
			return null;
		boolean estamosEnPalabra = false;
		int posicion = 0,inicio=0, fin=0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)==' ' && estamosEnPalabra) {
				estamosEnPalabra=false;
				posicion++;
				fin=i;
				if(posicion==numero) {
					return frase.substring(inicio, fin);
				}
			}else {
				if(frase.charAt(i)!=' ' && !estamosEnPalabra) {
					estamosEnPalabra=true;
					inicio=i;
				}
			}
			
		}
		if (estamosEnPalabra) {
			posicion++;
			if(posicion==numero) {
				return frase.substring(inicio, frase.length());
			}
		}
		return null;
	}

}
