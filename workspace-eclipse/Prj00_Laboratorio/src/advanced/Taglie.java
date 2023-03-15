package advanced;

public enum Taglie {

	S(40), M(44), L(48);
	
	double misuraReale;

	private Taglie(double misuraReale) {
		this.misuraReale = misuraReale;
	}

	public double getMisuraReale() {
		return misuraReale;
	}
	
	
	
}
