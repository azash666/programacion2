package practica2.ejercicio01;

public class PuntoTest {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Probar constructores");
		Punto punto1 = new Punto();
		System.out.println("punto1="+punto1);
		Punto punto2 = new Punto(0,1);
		System.out.println("punto2="+punto2);
		Punto punto3 = new Punto(1,0);
		System.out.println("punto3="+punto3);
		Punto punto4 = new Punto(1,1);
		System.out.println("punto4="+punto4);
		Punto punto5 = punto4;
		
		System.out.println("\nProbar getters");
		System.out.println("punto1.getX()="+punto1.getX());
		System.out.println("punto1.getY()="+punto1.getY());
		System.out.println("punto2.getX()="+punto2.getX());
		System.out.println("punto2.getY()="+punto2.getY());
		System.out.println("punto3.getX()="+punto3.getX());
		System.out.println("punto3.getY()="+punto3.getY());

		System.out.println("\nProbar desplazar");
		System.out.println("punto1.desplazar(0.0, 0.0)= "+punto1.desplazar(0.0, 0.0));
		System.out.println("punto1.desplazar(0.0, 1.0)= "+punto1.desplazar(0.0, 1.0));
		System.out.println("punto1.desplazar(1.0, 1.0)= "+punto1.desplazar(1.0, 1.0));
		System.out.println("punto1.desplazar(1.0, 0.0)= "+punto1.desplazar(1.0, 0.0));
		System.out.println("punto1.desplazar(1.0, -1.0)= "+punto1.desplazar(0.0, 0.0));
		System.out.println("punto1.desplazar(0.0, -1.0)= "+punto1.desplazar(0.0, -1.0));
		System.out.println("punto1.desplazar(-1.0, -1.0)= "+punto1.desplazar(-1.0, -1.0));
		System.out.println("punto1.desplazar(-1.0, 0.0)= "+punto1.desplazar(-1.0, 0.0));
		System.out.println("punto1.desplazar(-1.0, 1.0)= "+punto1.desplazar(-1.0, 0.0));
		System.out.println("punto4.desplazar(0.0, 0.0)= "+  punto4.desplazar(0.0, 0.0));
		System.out.println("punto4.desplazar(0.0, 1.0)= "+  punto4.desplazar(0.0, 1.0));
		System.out.println("punto4.desplazar(1.0, 1.0)= "+  punto4.desplazar(1.0, 1.0));
		System.out.println("punto4.desplazar(1.0, 0.0)= "+  punto4.desplazar(1.0, 0.0));
		System.out.println("punto4.desplazar(1.0, -1.0)= "+ punto4.desplazar(0.0, 0.0));
		System.out.println("punto4.desplazar(0.0, -1.0)= "+ punto4.desplazar(0.0, -1.0));
		System.out.println("punto4.desplazar(-1.0, -1.0)= "+punto4.desplazar(-1.0, -1.0));
		System.out.println("punto4.desplazar(-1.0, 0.0)= "+ punto4.desplazar(-1.0, 0.0));
		System.out.println("punto4.desplazar(-1.0, 1.0)= "+ punto4.desplazar(-1.0, 0.0));
	
		System.out.println("\nProbar distancia");
		System.out.println("punto1.distancia(punto1) = 0 --> "+punto1.distancia(punto1));
		System.out.println("punto1.distancia(punto1) = 0 --> "+punto1.distancia(punto1));
		System.out.println("punto1.distancia(punto2) = 1 --> "+punto1.distancia(punto2));
		System.out.println("punto2.distancia(punto1) = 1 --> "+punto2.distancia(punto1));
		System.out.println("punto1.distancia(punto3) = 1 --> "+punto1.distancia(punto3));
		System.out.println("punto3.distancia(punto1) = 1 --> "+punto3.distancia(punto1));
		System.out.println("punto1.distancia(punto4) = 1.41421356 --> "+punto1.distancia(punto4));
		System.out.println("punto4.distancia(punto1) = 1.41421356 --> "+punto4.distancia(punto1));
		
		System.out.println("\nProbar equals");
		System.out.println("punto1.equals(punto2) = false --> "+punto1.equals(punto2));
		System.out.println("punto1.equals(punto3) = false --> "+punto1.equals(punto3));
		System.out.println("punto1.equals(punto4) = false --> "+punto1.equals(punto4));
		System.out.println("punto1.equals(punto1) = true --> "+punto1.equals(punto1));
		System.out.println("punto5.equals(punto4) = true --> "+punto5.equals(punto4));
		System.out.println("punto4.equals(punto5) = true --> "+punto4.equals(punto5));
		System.out.println("punto5.equals(punto3) = false --> "+punto5.equals(punto3));
		System.out.println("punto5.equals(\"Hola\") = false --> "+punto5.equals("Hola"));
	}

}
