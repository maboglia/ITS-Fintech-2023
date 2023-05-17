package funzionale;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//class Consumatore implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//		
//	}
//	
//}
//


public class DemoStringhe {

	public static void main(String[] args) {

		String[] frutti = {"banane", "mele", "pere", "limoni"};
		
		List<String> fruttiList = Arrays.asList(frutti);
		
		for (int i = 0; i < fruttiList.size(); i++) {
			if (fruttiList.get(i).length() == 4) {
				System.out.println(fruttiList.get(i));
			}
		}
		
		
		
		List<String> fruttida4 = fruttiList
			.stream()
			.filter(f -> f.length() == 4)
			.sorted()
			.toList();

	}

}
