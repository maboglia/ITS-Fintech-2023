package view;

import controller.Rubrica;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		
		Rubrica rubrica1 = new Rubrica("Agenda rossa", 4);

		Rubrica rubrica2 = new Rubrica("Agenda blu", 6);
		
		System.out.println(rubrica1); 
		
		rubrica1.addContatto("umberto", "0123456", 0);
		rubrica1.addContatto("marco", "1234567", 1);
		Contatto c1 = new Contatto("andrea");
		rubrica1.addContatto(c1, 2);
		
		System.out.println(rubrica1);
	}

}
