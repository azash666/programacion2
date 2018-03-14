package practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		//char[][] solucion = crearMatrizResultados(equipos, fichero)
		for(int i=0; i<3;i++) {
			
		}
	}
	
	public static char[][] crearMatrizResultados(String[] equipos, String fichero){
		int cantidad = equipos.length, partidos;
		char[][] devolver = new char[cantidad][cantidad];
		String[][] sacado = new String[cantidad*cantidad][4];
		Scanner entrada = null;
		try {
			entrada = new Scanner(new File("lib/"+fichero));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		int i=0;
		while(entrada.hasNextLine()) {
			sacado[i++] = entrada.nextLine().split(" ");
		}
		partidos=i;
		for(i=0; i<cantidad;i++)
			for(int j=0; j<cantidad; j++)
				devolver[i][j]='-';
		for(i=0; i<partidos; i++) {
			int equipoA=-1, equipoB=-1;
			for(int j=0; j<cantidad; j++) {
				if(sacado[i][0].equals(equipos[j])) equipoA=j;
				if(sacado[i][2].equals(equipos[j])) equipoB=j;
			}
			if (Integer.parseInt(sacado[i][1])>Integer.parseInt(sacado[i][3])) 
				devolver[equipoA][equipoB]='1';

			else if (Integer.parseInt(sacado[i][1])<Integer.parseInt(sacado[i][3])) 
				devolver[equipoA][equipoB]='2';

			else
				devolver[equipoA][equipoB]='X';
		}
		return devolver;
	}
}