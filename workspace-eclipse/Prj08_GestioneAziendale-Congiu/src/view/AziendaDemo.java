package view;

import java.util.Random;
import java.util.Scanner;

import database.Connessione;
import database.DBImpiegati;
import model.Azienda;
import model.Impiegato;

/*
 * MAIN
Crea uno Scanner per prendere input da tastiera;
Crea un oggetto azienda;
Crea un tot di Impiegati chiedendo l'input da tastiera (usare un for);
Aggiunge man mano questi impiegati all'azienda;
Calcola e stampa lo stipendio totale.
 * */

public class AziendaDemo {

	public static void main(String[] args) {
		Azienda a = new Azienda();
		
		Random rand = new Random();
		
		for (Impiegato i : DBImpiegati.arrayImpiegati) {
			i.setStipendio(rand.nextInt(1000,1500));
			a.addImpiegato(i);
		}
		
		System.out.println(a.stipendioTOT());
		
		Connessione conn= new Connessione();
		
		conn.connetti();
	}

	private static String leggiStringa(String messaggio) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(messaggio);
		
		return scan.nextLine();
	}
	
	private static Integer leggiIntero(String messaggio) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(messaggio);
		
		return scan.nextInt();
	}

}
