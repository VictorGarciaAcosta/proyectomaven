package proyecto_geometrico;

public class Vector {
	private double coordenadaX;
	private double coordenadaY;
	
	
	public Vector(double u,double v) {
		this.coordenadaX=u;
		this.coordenadaY=v;
	}
	
	public Vector(Punto p) {
		this.coordenadaX=p.getCoordenadaX();
		this.coordenadaY=p.getCoordenadaY();
	}
	
	public Vector(Punto p,Punto q) {
		this.coordenadaX=p.getCoordenadaX()-q.getCoordenadaX();
		this.coordenadaY=p.getCoordenadaY()-q.getCoordenadaY();
		
	}
	public Vector() {
		
	}
	
	public static final Vector Ov =new Vector();
	
	public double extremoX() {
		return coordenadaX;
	}
	public void extremoX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public double extremoY() {
		return coordenadaY;
	}
	public void extremoY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public boolean igual(Vector u,Vector v) {
		return (u.coordenadaX==v.coordenadaX)&&(u.coordenadaY==v.coordenadaY);
	}
	public double longitud() {
		return Math.sqrt(coordenadaX*coordenadaX+coordenadaY*coordenadaY);
	}
	public boolean proporcional(Vector v) {
		if((coordenadaX==0&&coordenadaY==0)||(v.coordenadaX==0&&v.coordenadaY==0)) {
			return true;
		}
		if(coordenadaX==0&&v.coordenadaX==0) {
			return true;
		}
		if(coordenadaY==0&&v.coordenadaY==0) {
			return true;
		}
		try {
			return (coordenadaX/v.coordenadaX)==(coordenadaY/v.coordenadaY);
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean perpendicular(Vector v) {
		return 0==coordenadaX*v.coordenadaX+coordenadaY*v.coordenadaY;
	}
	
	public Punto traslada(Punto p) {
		return new Punto(p.getCoordenadaX()+coordenadaX,p.getCoordenadaY()+coordenadaY);	
	}
	
	
}
