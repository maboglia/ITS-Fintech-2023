package forme;

public class Segmento {

	Punto a, b;
	double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.lunghezza = calcolaLunghezza();
	
	}

	public double calcolaLunghezza() {

		//double l = 0;
		//radice di x2 -x1 al q + y2-y1 al q
		//l = Math.sqrt(  Math.pow(b.x - a.x, 2) +  Math.pow(b.y - a.y, 2) );
		
		return Math.sqrt(  Math.pow(b.x - a.x, 2) +  Math.pow(b.y - a.y, 2) );
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
}
