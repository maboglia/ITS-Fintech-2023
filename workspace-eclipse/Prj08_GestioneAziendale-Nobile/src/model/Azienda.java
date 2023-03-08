package model;

import java.util.ArrayList;

public class Azienda {

	//ATTRIBUTI
	
	private ArrayList<Impiegato> impiegato;
	
	//PROPRIETA'
	
	public Azienda()
	{
		impiegato=new ArrayList<>();
	}//end Azienda()
	
	//METODI
	
	public void addImpiegato(Impiegato imp)
	{
		impiegato.add(imp);
	}//end addImpiegato()
	
	public void addImpiegato(String nome,String cognome,int anno_Nascita)
	{
		Impiegato imp=new Impiegato(nome, cognome, anno_Nascita);
		impiegato.add(imp);
	}//end addImpiegato()
	
	
	public int stipendioTot()
	{
		int tot=0;
		
		for(Impiegato imp :impiegato)
			tot+=imp.getStipendio();
		
		return tot;
	}//end stipendioTot()
	
	public ArrayList<Impiegato> getImpiegati()
	{
		return impiegato;
	}//end getImpiegati()
	
	public Impiegato getImpiegatobyID(String ID)
	{
		for(Impiegato imp:impiegato)
		if(imp.getId().equals(ID)) 
			return imp;
		
		return null;
	}//end getImpiegatobyID
}//end class
