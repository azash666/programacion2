package practica2.ejercicio05;

public class FechaTest {
	public static void main(String[] args) {
		System.out.println("TEST DE FECHA.JAVA");
		System.out.println("Probando el constructor");
		Fecha fecha1 = new Fecha(21,3,2018);
		Fecha fecha2 = new Fecha(31,01,2000);
		Fecha fechaBisiesta = new Fecha(29,01,2016);
		
		Fecha fecha3 = new Fecha(fecha1);
		Fecha fecha4 = new Fecha(fecha2);
		Fecha fechaBisiesta2 = new Fecha(fechaBisiesta);
	}
}
