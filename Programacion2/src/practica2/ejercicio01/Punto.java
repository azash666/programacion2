package practica2.ejercicio01;

public class Punto {
	private double x;
	private double y;
	
	public Punto() {
		this(0.0,0.0);
	}

	public Punto(double d, double e) {
		// TODO Auto-generated constructor stub
		x=d;
		y=e;
	}

	public String toString() {
		return "("+getX()+", "+getY()+")";
	}

	public double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public Punto desplazar(double d, double e) {
		// TODO Auto-generated method stub
		return new Punto(x+d, y+e);
	}

	public double distancia(Punto punto) {
		// TODO Auto-generated method stub
		return (Math.sqrt(Math.pow(this.x - punto.getX(), 2)+Math.pow(this.y - punto.getY(), 2)));
	}

	public boolean equals(Object otroObjeto) {
		if (this == otroObjeto)
			return true;
		if (!(otroObjeto instanceof Punto))
			return false;
		Punto punto = (Punto) otroObjeto;
		return x == punto.getX() && y == punto.getY();

	}
}
