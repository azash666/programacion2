package practica1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'Mi mama me mima' (4) --> " +contarPalabras("Mi mama me mima"));
		System.out.println("'Mi    mama  me       mima' (4) --> " +contarPalabras("Mi    mama  me       mima"));
		System.out.println("' Mi mama me mima ' (4) --> " +contarPalabras(" Mi mama me mima "));
		System.out.println("'    Mi mama me mima    ' (4) --> " +contarPalabras("    Mi mama me mima    "));
		System.out.println("'' (0) --> " +contarPalabras(""));
		System.out.println("' ' (0) --> " +contarPalabras(" "));
	}

	public static int contarPalabras(String frase) {
		// TODO Auto-generated method stub
		if(frase.length()==0) return 0;
		boolean estamosEnPalabra = false;
		int cantidad = 0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)==' ' && estamosEnPalabra) {
				estamosEnPalabra=false;
				cantidad++;
			}else {
				if(frase.charAt(i)!=' ' && !estamosEnPalabra) {
					estamosEnPalabra=true;
				}
			}
		}
		if(estamosEnPalabra) {
			cantidad++;
		}
		return cantidad;
	}

}
