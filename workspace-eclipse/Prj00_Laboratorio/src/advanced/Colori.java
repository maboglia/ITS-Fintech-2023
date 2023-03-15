package advanced;

public enum Colori {

	RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
	
	String esadecimale;
	
	private Colori(String valore) {
		esadecimale = valore;
	}

	public String getEsadecimale() {
		return esadecimale;
	}

	
	
}
