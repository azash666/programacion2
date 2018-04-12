package practica2.ejercicio09;

import java.util.Random;

import practica2.ejercicio05.Fecha;

public class AgendaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crear una nueva agenda:");
		Agenda agenda= new Agenda();
		System.out.println("Añado datos");
		Random rand = new Random();
		int jj=0;
		for(int i=0; i<2000; i++) {
			jj++;
			Fecha fecha = new Fecha(rand.nextInt(27)+1, rand.nextInt(11)+1, rand.nextInt(20)+2000);
			Tarea tarea = new Tarea(fecha, "Tarea número "+i);
			System.out.print("Añadiendo "+tarea+"\t\t");
			agenda.añadir(tarea);
			if(jj==10) {
				System.out.println();
				jj=0;
			}
		}
		System.out.println("agenda.cantidad() = "+agenda.cantidad()+ " (2000)");
	
		System.out.println("\nComprobando metodo consultar()\n");
		for(int i=0; i<100; i++) {
			Fecha f2;
			System.out.println("Fecha: "+(f2 = new Fecha(rand.nextInt(27)+1, rand.nextInt(11)+1, rand.nextInt(20)+2000))+" --> ");
			Tarea[] tareas = agenda.consultar(f2);
			for(int j=0; j<tareas.length; j++) System.out.println("    "+tareas[j]);
		}

		agenda.borrarPasadas(new Fecha(rand.nextInt(27)+1, rand.nextInt(11)+1, rand.nextInt(20)+2000));
		System.out.println(agenda.cantidad());
		
		System.out.println(agenda);
		agenda.borrar();
		System.out.println(agenda);
	}

}
