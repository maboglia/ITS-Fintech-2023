package forme;

public class Rettangolo {

	Segmento base, altezza;
	double perimetro;
	double superficie;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		this.perimetro = calcolaPerimetro();
		this.superficie = calcolaSuperficie();
	}

	private double calcolaSuperficie() {
		return base.lunghezza * altezza.lunghezza;
	}

	private double calcolaPerimetro() {
		return 2 * (base.lunghezza + altezza.lunghezza);
	}
	
	private double calcolaPerimetro(boolean b) {
		return (base.lunghezza + altezza.lunghezza)+
				(base.lunghezza + altezza.lunghezza);
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", superficie="
				+ superficie + "]";
	}
	
	
	
}
