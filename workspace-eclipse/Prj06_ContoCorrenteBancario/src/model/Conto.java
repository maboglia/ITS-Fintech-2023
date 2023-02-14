package model;

public class Conto {

	private static int contatore=1;
	
	private int nConto;
	private double saldo;
	private Cliente titolare;
	
	public Conto() {
		this.saldo = 0;
		this.nConto = contatore++;
	}
	
	public void versamento(double ammontare) {
		this.saldo += ammontare;
	}

	public void prelievo(double ammontare) {
		if (this.saldo >= ammontare)
		this.saldo -= ammontare;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitolare() {
		return titolare;
	}

	public void setTitolare(Cliente titolare) {
		this.titolare = titolare;
	}

	@Override
	public String toString() {
		return "Conto [nConto=" + nConto + ", saldo=" + saldo + ", titolare=" + titolare + "]";
	}
	
	
	
	
}
