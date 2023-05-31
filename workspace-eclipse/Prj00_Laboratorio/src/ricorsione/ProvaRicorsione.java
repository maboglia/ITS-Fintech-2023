package ricorsione;

public class ProvaRicorsione {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.println(fattoriale(5));

	}

	private static int fattoriale(int i) {

		if (i == 0)
			return 1;
		else
			return i * fattoriale(i - 1);
	}

}
