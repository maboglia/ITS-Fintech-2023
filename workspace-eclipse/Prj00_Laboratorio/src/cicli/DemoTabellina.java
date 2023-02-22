package cicli;

public class DemoTabellina {

	public static void main(String[] args) {

		final int RIGHE = 15;
		final int COLONNE = 15;
		
		
		for (int i = 1; i <= RIGHE; i++) {
			
			for (int j = 1; j <= COLONNE; j++) {
				
				System.out.print(i * j + "\t");
				
				
			}//fine colonne
			//stampo un a capo
			System.out.println();
		}
		
	}

}
