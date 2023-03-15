package advanced;

public class Maglia {

	private double prezzo;
	private Taglie taglia;
	private Colori colore;

	public Maglia(double prezzo, Taglie taglia, Colori colore) {
		this.prezzo = prezzo;
		this.taglia = taglia;
		this.colore = colore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maglia [prezzo=");
		builder.append(prezzo);
		builder.append(", taglia=");
		builder.append(taglia.getMisuraReale());
		builder.append(", colore=");
		builder.append(colore.getEsadecimale());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
