package adapter;

public class TestMapAdapter {

	public static void main(String[] args) {

		Integer[][] quadrati = { {2, 4}, {3, 9}, {4, 16}}; 
		MapAdapter adattatore = new MapAdapter(quadrati); 
		System.out.println("L'adattatore contiene: " + adattatore);

		
	}

}
