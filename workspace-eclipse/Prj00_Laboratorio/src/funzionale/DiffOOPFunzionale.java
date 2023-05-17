package funzionale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DiffOOPFunzionale {

	public static void main(String[] args) {
		
		//int[] voti = new int[8];
		int[] voti = new int[] {12,24,23};
		//int[] voti = {12,24,23};
		
		//JCF Java Collection Framework
		
		List<Integer> listaVoti = new ArrayList<>();
		
		for (int voto : voti) {
			listaVoti.add(voto);
		}
		
		Stream<Integer> of = Stream.of(12,24,23); 
		
		of.toList();
		
		double totale = 0;
		
		for (int voto : voti) {
			totale += voto;
		}
		
		double media = totale / voti.length;
		
		Integer reduce = of.reduce(0, Integer::sum);//static method reference
		
		
	}
	
	
	
}
