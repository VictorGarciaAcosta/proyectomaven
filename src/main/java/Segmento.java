package proyecto_geometrico;

public class Segmento {
	private Punto p;
	private Punto q;
	
	public Segmento() {
		
	}

	public Segmento(Punto p, Punto q) {
		super();
		this.p = p;
		this.q = q;
	}

	public Punto getExtremoA() {
		return p;
	}

	public void setExtremoA(Punto p) {
		this.p = p;
	}

	public Punto getExtremoB() {
		return q;
	}

	public void setExtremoB(Punto q) {
		this.q = q;
	}
	
	public boolean igual(Segmento r) {
		if(!this.p.igual(r.getExtremoA())&&this.p.igual(r.getExtremoB())) {
			return false;
		}
		if(this.p.igual(r.getExtremoA())){
			if(this.q.igual(r.getExtremoB())) {
				return true;
			}
		}
		return false;
	}
	
	public double longitud() {
		return Math.sqrt(Math.pow(this.p.getCoordenadaX()-this.q.getCoordenadaX(), 2))+Math.pow(this.p.getCoordenadaY()-this.q.getCoordenadaY(), 2);
	}
	
	public boolean proporcional(Segmento r) {
		return new Vector(this.p, this.q).proporcional(new Vector(r.getExtremoA(), r.getExtremoB()));
	}
	public boolean perpendicular(Segmento r) {
		return this.p.pendiente(this.q)*r.getExtremoA().pendiente(r.getExtremoB())==-1;
	}
	public boolean paralelo(Segmento r) {
		return p.pendiente(q)==r.getExtremoA().pendiente(r.getExtremoB());
	}
	public Punto puntoMedio() {
		return new Punto((this.p.getCoordenadaX()-this.q.getCoordenadaX())/2, (this.p.getCoordenadaY()-this.q.getCoordenadaY())/2);
	}
	public boolean pertenece(Punto p) {
		return (this.p.getCoordenadaX()<=p.getCoordenadaX()&&p.getCoordenadaX()<=this.q.getCoordenadaX())&&(this.p.getCoordenadaY()<=p.getCoordenadaY()&& p.getCoordenadaY()<=this.q.getCoordenadaY())
				&& new Vector(this.p, p).perpendicular(new Vector(this.p, this.q));
	}
	
	public Recta recta() {
		return new Recta(p, q);
	}
	
	public Recta mediatriz() {
		return new Recta(p, new Vector(p, q)).perpendicularPunto(new Segmento(p, q).puntoMedio());
	}
}
