package practica2.ejercicio09;

import practica2.ejercicio05.Fecha;

public class Tarea {
	private Fecha fecha;
	private String descripción;
	
	public Tarea(Fecha fecha, String descripción) {
		this.fecha=fecha;
		this.descripción=descripción;
	}

	@Override
	public String toString() {
		return fecha + ": " + descripción;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public String getDescripción() {
		return descripción;
	}
}
