package proyecto_geometrico;

public class Recta {
	private Punto p;
	private Vector v;
	
	public Recta () {
		
	}
	
	public Recta(Punto p,Vector v) {
		this.p=p;
		this.v=v;
	}
	
	public Recta(Vector v) {
		this.p=new Punto();
		this.v=v;
	}
	
	public Recta(Punto p,Punto q) {
		this.p=p;
		this.v=new Vector(p, q);
	}

	public Punto getP() {
		return p;
	}

	public void setP(Punto p) {
		this.p = p;
	}

	public Vector getV() {
		return v;
	}

	public void setV(Vector v) {
		this.v = v;
	}
	
	public boolean igual(Recta s) {
		return v.proporcional(s.getV())&&v.proporcional(new Vector(p,s.getP()));
	}
	
	public boolean perperdiculares(Recta s) {
		return 0==(v.extremoX()*s.getV().extremoX()+v.extremoY()*s.getV().extremoY());
	}
	
	public boolean paralela(Recta s) {
		if(v.proporcional(new Vector(p,s.getP()))) {
			return false;
		}
		return v.proporcional(s.getV());
	}
	
	public boolean pertenece(Punto p) {
		return (new Recta(p,v).igual(new Recta(this.p,v)));
	}
	
	public Recta paralelaPunto(Punto p) {
		return new Recta(this.p, v);
	}
	
	public Recta perpendicularPunto(Punto p) {
		return new Recta(p,new Vector(-this.v.extremoY(), this.v.extremoX()));
	}
	
	public double pendiente() {
		return (p.getCoordenadaX()- v.traslada(p).getCoordenadaX())/(p.getCoordenadaY()-v.traslada(p).getCoordenadaY());
	}
}