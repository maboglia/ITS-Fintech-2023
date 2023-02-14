package test;

import model.Cliente;
import model.Conto;

public class BancaDemo {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("pippo");
		Cliente c2 = new Cliente("giggi");
		
		Conto conto1 = new Conto();
		Conto conto2 = new Conto();
		
		conto1.setTitolare(c1);
		conto2.setTitolare(c2);
		
		conto1.versamento(1000);
		conto2.versamento(500);

		conto1.versamento(1000);
		conto2.versamento(500);
		
		conto1.versamento(1000);
		conto2.versamento(500);

		System.out.println(conto1);
		System.out.println(conto2);
		
		
	}

}
