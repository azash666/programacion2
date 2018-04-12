package practica2.ejercicio09;

import java.util.Arrays;

import practica2.ejercicio05.Fecha;

public class Agenda {
	private Tarea[] agenda;
	
	public Agenda() {
		agenda= new Tarea[0];
	}
	
	public void añadir(Tarea tarea) {
		Tarea[] aux = new Tarea[agenda.length+1];
		boolean primero = true;
		if(agenda.length==0) aux[0] = tarea;
		else {
			for (int i =0; i<aux.length; i++) {
				if(i<agenda.length && agenda[i].getFecha().compareTo(tarea.getFecha())<0) {
					aux[i]=agenda[i];
				}else {
					if(primero) {
						primero=false;
						aux[i]=tarea;
					}else {
						aux[i]=agenda[i-1];
					}
				}
			}
		}
		agenda = aux;
	}

	public int cantidad() {
		// TODO Auto-generated method stub
		return agenda.length;
	}
	
	public Tarea[] consultar(Fecha fecha) {
		int inicio = 0, cantidad=0;
		boolean primero = true;
		for(int i=0; i<agenda.length && agenda[i].getFecha().compareTo(fecha)<=0;i++) {
			if(agenda[i].getFecha().compareTo(fecha)==0) {
				if(primero) {
					primero=false;
					inicio=i;
				}
				cantidad++;
			}
		}
		Tarea[] devolver= new Tarea[cantidad];
		for(int i=0; i<cantidad; i++) {
			devolver[i] = agenda[i+inicio];
		}
		return devolver;
	}

	public void borrarPasadas(Fecha fecha) {
		Tarea[] aux = new Tarea[0];
		int cantidad = 0;
		boolean primera = true;
		for(int i=0; i<agenda.length; i++) {
			if(agenda[i].getFecha().compareTo(fecha)<0) {
				cantidad++;
			}else {
				if(primera) { aux= new Tarea[agenda.length-cantidad]; primera = false;}
				aux[i-cantidad] = agenda[i];
			}
		}
		agenda=aux;
	}
	
	public void borrar() {
		borrarPasadas(Fecha.hoy());
	}

	@Override
	public String toString() {
		String cadena="";
		for(int i=0; i<agenda.length; i++)
			cadena+=agenda[i]+"\n";
		return cadena;
	}
	
	
}
