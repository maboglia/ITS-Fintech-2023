package view;

import controller.Rubrica;
import controller.Rubrica2;
import model.Contatto;

public class RubricaDemo2 {

	public static void main(String[] args) {
		
		Rubrica2 rubrica1 = new Rubrica2("Agenda rossa");

		Rubrica2 rubrica2 = new Rubrica2("Agenda blu");
		
		System.out.println(rubrica1); 
		
		rubrica1.addContatto("umberto", "0123456");
		rubrica1.addContatto("marco", "1234567");
		Contatto c1 = new Contatto("andrea");
		rubrica1.addContatto(c1);
		
		System.out.println(rubrica1);
	}

}
