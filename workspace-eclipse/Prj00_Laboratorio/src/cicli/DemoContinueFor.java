package cicli;

public class DemoContinueFor {

	public static void main(String[] args) {


		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
				
			if(i > 5)
				break;
			
				System.out.println(i);
		}
		

	}

}
