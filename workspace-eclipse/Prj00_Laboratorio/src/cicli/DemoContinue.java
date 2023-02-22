package cicli;

public class DemoContinue {

	public static void main(String[] args) {

		boolean gira = true;
		
		while(gira) {
			
			double casuale = Math.random();
			
			if (casuale < 0.5) {
				continue;
			}
			
			System.out.println(casuale);
			
			if(casuale > 0.95) {
				gira = false;
				//break;
			}
			
		}
		

	}

}
