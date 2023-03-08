package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Automobile;
import model.Trattore;
import model.Veicolo;

public class Autosalone {

	public static void main(String[] args) {
		List<Veicolo> veicoli = new ArrayList<>(); 
		
		File f = new File("files/vehicles-list.csv");
		
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				
				String riga  = sc.nextLine();
				
				String[] split = riga.split(";");
				
				String tipoMezzo = split[1];
				String marca = split[2];
				String modello = split[3];
				
				switch (tipoMezzo) {
				case "Car":
					veicoli.add(new Automobile(marca));
					break;

				default:
					veicoli.add(new Veicolo(marca));
					break;
				}
				
				
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
//		veicoli.add(new Automobile("Ferrari"));
//		veicoli.add(new Trattore());
//		veicoli.add(new Automobile("Porsche"));
		
		System.out.println(veicoli.size());
		
		for (Veicolo veicolo : veicoli) {
			System.out.println(veicolo);
		}
		
		
		
		
		

	}

}
