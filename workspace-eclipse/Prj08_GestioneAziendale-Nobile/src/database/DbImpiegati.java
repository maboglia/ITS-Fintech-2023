package database;

import java.util.ArrayList;
import java.util.Arrays;

import model.Impiegato;

public class DbImpiegati {
	
	static Impiegato[] arrayimpiegati= { 
			new Impiegato("Alessandro","Bastianoni",1998),
			new Impiegato("Marco","Bausola",2004),
			new Impiegato("Marco","Bioletto",2003),
			new Impiegato("Paolo (Pietro)","Bruna",2000),
			new Impiegato("Sebastiano","Callà",2000),
			new Impiegato("Lorenzo","Cazzuola",2000),
			new Impiegato("Filippo","Congiu",2001),
			new Impiegato("Matteo","Costamagna",2001),
			new Impiegato("Leonardo","Diana",1995),
			new Impiegato("Umberto","Fiore",1993),
			new Impiegato("Andrea","Gavassa",2004),
			new Impiegato("Matteo","Guerra",2003),
			new Impiegato("Ioan Petrisor","Imbrea",2000),
			new Impiegato("gabriele ","inglese",2003),
			new Impiegato("Andrea","Maniscalco",2004),
			new Impiegato("Francesco","Messana",2003),
			new Impiegato("Federico","Molinari",2004),
			new Impiegato("Davide","Negri",2002),
			new Impiegato("Gianluca","Nobile",1999),
			new Impiegato("Dario","Olivo",2001),
			new Impiegato("Luca","Onnis",2001),
			new Impiegato("Daniel","Paliuc",2003),
			new Impiegato("stefano","prato",2004),
			new Impiegato("Alberto","Puggioni",1993),
			new Impiegato("Valentina","Putzu",1990),
			new Impiegato("Silvia","Roberto",2003),
			new Impiegato("Alvise","Spadea",1999),
			new Impiegato("Gabriele","Velonà",2002),
	};	
	
	public static ArrayList<Impiegato> impiegati=new ArrayList<>(Arrays.asList(arrayimpiegati));
}//end class
