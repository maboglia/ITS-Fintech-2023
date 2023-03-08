package model;

public class Segreteria {
	
	//METODI
	
	public static String CreaID(String nome,String cognome,int anno_nascita)
	{
		return String.format("%s%s%d",nome.substring(0, 2),cognome.substring(0, 2),anno_nascita);
	}//end CreaID()
}//end class
