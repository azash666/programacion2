package practica2.ejercicio05;

public class Fecha {
	private int día;
	private int mes;
	private int año;
	
	public Fecha(int día, int mes, int año) {
		// TODO Auto-generated constructor stub
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
	}

}
