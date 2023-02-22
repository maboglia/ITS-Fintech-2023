package array;

public class DemoArray {

	public static void main(String[] args) {

		//int[] voti = new int[10];
		//           [0] [1]
		int[] voti = {27,25,29,30,22,18,15,28};
		
		double totale = 0;
		
		for (int i = 0; i < voti.length; i++) {
			//totale = totale + voti[i];
			totale += voti[i];
		}
		System.out.println(totale);
		System.out.println("media " + (totale / voti.length));
		System.out.println("voto di laurea " + (totale / voti.length)/3*11);
		
	}

}
