package practica2.ejercicio08;

public class FechaTest {
	public static void main(String[] args) {
		System.out.println("TEST DE FECHA.JAVA");
		System.out.println("Probando el constructor");
		Fecha fecha1 = null;
		Fecha fecha2 = null;
		Fecha fecha2menos1día = null;
		Fecha fecha1mas1mes = null;
		Fecha fechaBisiesta = null;
		try {
			fecha1 = new Fecha(21,3,2018);
			fecha2 = new Fecha(31,01,2000);
			fecha2menos1día = new Fecha(30,01,2000);
			fecha1mas1mes = new Fecha(21,04,2018);
			fechaBisiesta = new Fecha(29,01,2016);

		} catch (ExcepcionFechaInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Fecha fecha3 = new Fecha(fecha1);
		Fecha fecha4 = new Fecha(fecha2);
		Fecha fechaBisiesta2 = new Fecha(fechaBisiesta);

		Fecha fecha4bis = new Fecha(fecha4);
		System.out.println("fecha4.equals(fecha4) = "+fecha4.equals(fecha4)+" (true)");
		System.out.println("fecha4bis.equals(fecha4) = "+fecha4bis.equals(fecha4)+" (true)");
		System.out.println("fecha3.equals(fecha4) = "+fecha3.equals(fecha4)+" (false)");
		System.out.println();
		System.out.println("fecha4.compareTo(fecha4bis) = "+fecha4.compareTo(fecha4bis)+" (=0)");
		System.out.println("fecha1.compareTo(fecha2) = "+fecha1.compareTo(fecha2)+" (>0)");
		System.out.println("fecha2.compareTo(fecha1) = "+fecha2.compareTo(fecha1)+" (<0)");
		System.out.println("fecha2.compareTo(fecha2menos1día) = "+fecha2.compareTo(fecha2menos1día)+" (>0)");
		System.out.println("fecha1.compareTo(fecha1mas1mes) = "+fecha1.compareTo(fecha1mas1mes)+" (<0)");
		System.out.println();
		System.out.println("Fecha.añoBisiesto(1987) = "+Fecha.añoBisiesto(1987)+" (false)");
		System.out.println("Fecha.añoBisiesto(2004) = "+Fecha.añoBisiesto(2004)+" (true)");
		System.out.println("Fecha.añoBisiesto(2100) = "+Fecha.añoBisiesto(2100)+" (false)");
		System.out.println("Fecha.añoBisiesto(2400) = "+Fecha.añoBisiesto(2400)+" (true)");
		System.out.println();
		try {
			System.out.println("Fecha.díasMes(1,2004) = "+Fecha.díasMes(1,2004)+" (31)");
			System.out.println("Fecha.díasMes(2,2004) = "+Fecha.díasMes(2,2004)+" (29)");
			System.out.println("Fecha.díasMes(3,2004) = "+Fecha.díasMes(3,2004)+" (31)");
			System.out.println("Fecha.díasMes(4,2004) = "+Fecha.díasMes(4,2004)+" (30)");
			System.out.println("Fecha.díasMes(5,2004) = "+Fecha.díasMes(5,2004)+" (31)");
			System.out.println("Fecha.díasMes(6,2004) = "+Fecha.díasMes(6,2004)+" (30)");
			System.out.println("Fecha.díasMes(7,2004) = "+Fecha.díasMes(7,2004)+" (31)");
			System.out.println("Fecha.díasMes(8,2004) = "+Fecha.díasMes(8,2004)+" (31)");
			System.out.println("Fecha.díasMes(9,2004) = "+Fecha.díasMes(9,2004)+" (30)");
			System.out.println("Fecha.díasMes(10,2004) = "+Fecha.díasMes(10,2004)+" (31)");
			System.out.println("Fecha.díasMes(11,2004) = "+Fecha.díasMes(11,2004)+" (30)");
			System.out.println("Fecha.díasMes(12,2004) = "+Fecha.díasMes(12,2004)+" (31)");
			System.out.println("Fecha.díasMes(1,2003) = "+Fecha.díasMes(1,2003)+" (31)");
			System.out.println("Fecha.díasMes(2,2003) = "+Fecha.díasMes(2,2003)+" (28)");
			System.out.println("Fecha.díasMes(3,2003) = "+Fecha.díasMes(3,2003)+" (31)");
			System.out.println("Fecha.díasMes(4,2003) = "+Fecha.díasMes(4,2003)+" (30)");
			System.out.println("Fecha.díasMes(5,2003) = "+Fecha.díasMes(5,2003)+" (31)");
			System.out.println("Fecha.díasMes(6,2003) = "+Fecha.díasMes(6,2003)+" (30)");
			System.out.println("Fecha.díasMes(7,2003) = "+Fecha.díasMes(7,2003)+" (31)");
			System.out.println("Fecha.díasMes(8,2003) = "+Fecha.díasMes(8,2003)+" (31)");
			System.out.println("Fecha.díasMes(9,2003) = "+Fecha.díasMes(9,2003)+" (30)");
			System.out.println("Fecha.díasMes(10,2003) = "+Fecha.díasMes(10,2003)+" (31)");
			System.out.println("Fecha.díasMes(11,2003) = "+Fecha.díasMes(11,2003)+" (30)");
			System.out.println("Fecha.díasMes(12,2003) = "+Fecha.díasMes(12,2003)+" (31)");
		} catch (ExcepcionFechaInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Hoy: "+Fecha.hoy());
		System.out.println();
		try {
			System.out.println("Mañana: "+Fecha.hoy().díaSiguiente());
		} catch (ExcepcionFechaInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Fecha prueba = new Fecha(fecha2);
		for(int i=0; i<10; i++)
			try {
				System.out.println("prueba.díaSiguiente(): "+(prueba.díaSiguiente()));
			} catch (ExcepcionFechaInvalida e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for(int i=0; i<1000; i++)
			try {
				System.out.println(i+" prueba=prueba.díaSiguiente(): "+(prueba=prueba.díaSiguiente()));
			} catch (ExcepcionFechaInvalida e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
