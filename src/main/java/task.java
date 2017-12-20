package proyecto_geometrico;



public class Punto {

	private double coordenadaX;

	private double coordenadaY;

	

	public Punto(double a,double b) {

		coordenadaX=a;

		coordenadaY=b;

	}

	

	public Punto() {

		

	}

	

	public double getCoordenadaX() {

		return coordenadaX;

	}



	public void setCoordenadaX(int coordenadaX) {

		this.coordenadaX = coordenadaX;

	}



	public double getCoordenadaY() {

		return coordenadaY;

	}



	public void setCoordenadaY(int coordenadaY) {

		this.coordenadaY = coordenadaY;

	}

	public boolean igual(Punto q) {

		return (coordenadaX==q.coordenadaX)&&(coordenadaY==q.coordenadaY);

	}

	

	public double distancia() { 

		return Math.sqrt(Math.pow(coordenadaX, 2)+Math.pow(coordenadaY, 2));

	}

	public double pendiente(Punto p) {

		return (this.coordenadaX-p.coordenadaX)/(this.coordenadaY-p.coordenadaY);

	}

}
