package view;

import java.util.Random;
import java.util.Scanner;

import database.Connessione;
import database.DbImpiegati;
import model.Azienda;
import model.Impiegato;

public class AziendaDemo {

	public static void main(String[] args) {
		
		Azienda a=new Azienda();
		
	/*	for(int c=0;c<5;c++)
		{
			String nome=leggiStringa("inserisci il nome dell'impiegato: ");
			String cognome=leggiStringa("inserisci il cognome dell'impiegato: ");
			int eta=leggiIntero("inserisci l'anno di nascita dell'impiegato: ");
			
			Impiegato i1=new Impiegato(nome,cognome,eta);
			i1.setStipendio(1000);
			a.addImpiegato(i1);
		}//end for
		*/
		for(Impiegato i: DbImpiegati.impiegati)
		{
			Random r=new Random();
			i.setStipendio(r.nextInt(1000,1500));
			a.addImpiegato(i);
		}//end for
			
		//a.addImpiegato("Mario", "Rossi", 1997);
		
		
	//	System.out.println("stipendio: "+a.stipendioTot());
	//	System.out.println(i1);
		
		for(Impiegato i:a.getImpiegati())
			System.out.println(i);
		
	/*	Impiegato  i2=a.getImpiegatobyID("MaRo1997");
		i2.setStipendio(2000);*/
		System.out.println(a.stipendioTot());
		
		Connessione conn=new Connessione();
		
		conn.connetti();
	}//end main()

	private static int leggiIntero(String messaggio) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(messaggio);
		
		return scanner.nextInt();
	}//end leggiIntero()

	private static String leggiStringa(String messaggio) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(messaggio);
		
		return scanner.nextLine();
	}//end leggiStringa()
}//end class