package proyecto_geometrico;

public class PruebaGeometrica {

	public static void main(String[] args) {
		Punto p= new Punto(2, 3);
		Punto q=new Punto(5,7);
		Segmento raya=new Segmento(p, q);
		System.out.println(raya.recta());
		System.out.println(raya.mediatriz());
		System.out.println();

	}

}
