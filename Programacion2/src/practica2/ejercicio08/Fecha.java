package practica2.ejercicio08;

import java.util.Calendar;

import practica2.ejercicio01.Punto;

public class Fecha {
	private int día;
	private int mes;
	private int año;
	
	public Fecha(int día, int mes, int año) throws ExcepcionFechaInvalida {
		// TODO Auto-generated constructor stub
		if( mes<1 || mes>12 || día<1 || día>Fecha.díasMes(mes, año)) throw new ExcepcionFechaInvalida();
		this.día = día;
		this.mes = mes;
		this.año = año;
		
	}

	public Fecha(Fecha fecha) {
		// TODO Auto-generated constructor stub
		this.día = fecha.getDía();
		this.mes = fecha.getMes();
		this.año = fecha.getAño();
	}

	private int getAño() {
		// TODO Auto-generated method stub
		return this.año;
	}

	private int getMes() {
		// TODO Auto-generated method stub
		return this.mes;
	}

	private int getDía() {
		// TODO Auto-generated method stub
		return this.día;
	}
	
	public String toString() {
		String devolver;
		if(mes<10) {
			devolver=this.día+"/0"+this.mes+"/"+this.año;
		}else {
			devolver=this.día+"/"+this.mes+"/"+this.año;
		}
		return devolver;
	}
	
	public boolean equals(Object otro) {
		if (this == otro)
			return true;
		if (!(otro instanceof Fecha))
			return false;
		Fecha otraFecha = (Fecha) otro;
		if (
				this.día == otraFecha.getDía() &&
				this.mes == otraFecha.getMes() &&
				this.año == otraFecha.getAño()
				) {
			return true;
		}
		return false;
	}

	public int compareTo(Fecha fecha1) {
		// TODO Auto-generated method stub
		int devolver = año-fecha1.getAño();
		if(devolver==0) devolver = mes-fecha1.getMes();
		if(devolver==0) devolver = día-fecha1.getDía();
		return devolver;
		
	}

	public static boolean añoBisiesto(int año) {
		// TODO Auto-generated method stub
		if(año%4==0 && año%100 !=0 || año%400==0) {
			return true;
		}
		return false;
	}

	public static int díasMes(int mes, int año) throws ExcepcionFechaInvalida {
		// TODO Auto-generated method stub
		if( mes<1 || mes>12) throw new ExcepcionFechaInvalida();
		switch(mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if(Fecha.añoBisiesto(año))
				return 29;
			return 28;
		}
		return 31;
	}

	public static Fecha hoy() {
		// TODO Auto-generated method stub
		Calendar calendario = Calendar.getInstance();
		int día = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH) + 1;
		int año = calendario.get(Calendar.YEAR);
		Fecha salida = null;
		try {
			salida = new Fecha(día, mes, año);
		} catch (ExcepcionFechaInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salida;
	}

	public Fecha díaSiguiente() throws ExcepcionFechaInvalida {
		// TODO Auto-generated method stub
		int día= this.día, mes = this.mes, año=this.año;
		if (this.día<Fecha.díasMes(this.mes, this.año)) {
			día++;
		}else {
			if (this.mes<12) {
				día=1;
				mes++;
			}else {
				día=1;
				mes=1;
				año++;
			}
		}
		return new Fecha(día, mes, año);
	}
}
