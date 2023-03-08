package test;

import model.Trattore;
import model.Veicolo;

public class TrattoreTest {

	public static void main(String[] args) {
		Veicolo t1 = new Trattore();
		
		t1.setMarca("Lamborghini");
		t1.setModello("Super cingolato");
		t1.setPrezzo(150000);
		System.out.println(t1);
		

	}

}
