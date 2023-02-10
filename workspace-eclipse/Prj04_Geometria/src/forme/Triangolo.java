package forme;

public class Triangolo {

	Punto a,b,c;
	Segmento ab, ac, bc;
	double superficie;
	double perimetro;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie();
	}

	public double calcolaSuperficie() {
		
		double sp = this.perimetro / 2;
		
		return Math.sqrt(  
			sp 
			* (sp - ab.lunghezza) 
			* (sp - ac.lunghezza)
			* (sp - bc.lunghezza) 
		);
	}

	public double calcolaPerimetro() {
		return ab.lunghezza + ac.lunghezza + bc.lunghezza;
	}

	@Override
	public String toString() {
		return "Triangolo [superficie=" + superficie + ", perimetro=" + perimetro + "]";
	}
	
	
	
}
