package studenti;

public class RegistroDemo {

	public static void main(String[] args) {

		Registro registro1 = new Registro("Corso fintech");
		
		registro1.addStudente(1, "Marco", "Bioletto");
		registro1.addStudente(2, "Paolo (Pietro)", "Bruna");
		registro1.addStudente(3, "Sebastiano", "Callà");
		registro1.addStudente(4, "Lorenzo", "Cazzuola");
		registro1.addStudente(5, "Filippo", "Congiu");
		registro1.addStudente(6, "Matteo", "Costamagna");
		registro1.addStudente(7, "Leonardo", "Diana");
		registro1.addStudente(8, "Umberto", "Fiore");
		registro1.addStudente(9, "Andrea", "Gavassa");
		registro1.addStudente(10, "Matteo", "Guerra");
		registro1.addStudente(11, "Ioan Petrisor", "Imbrea");
		registro1.addStudente(12, "gabriele ", "inglese");
		registro1.addStudente(13, "Andrea", "Maniscalco");
		registro1.addStudente(14, "Davide", "Negri");
		registro1.addStudente(15, "Gianluca", "Nobile");
		registro1.addStudente(16, "Dario", "Olivo");
		registro1.addStudente(17, "Luca", "Onnis");
		registro1.addStudente(18, "Daniel", "Paliuc");
		registro1.addStudente(19, "stefano", "prato");
		registro1.addStudente(20, "Alberto", "Puggioni");
		registro1.addStudente(21, "Valentina", "Putzu");
		registro1.addStudente(22, "Silvia", "Roberto");
		registro1.addStudente(23, "Alvise", "Spadea");
		registro1.addStudente(24, "Gabriele", "Velonà");
		registro1.addStudente(25, "Federico", "Molinari");
		registro1.addStudente(26, "Francesco", "Messana");
		registro1.addStudente(27, "Alessandro", "Bastianoni");
		
		registro1.faiAppello();

	}

}
