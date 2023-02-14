package model;

public class Cliente {

	private String nome;
	
	public Cliente(String nome) {//new Cliente("giovanni");
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	
}
