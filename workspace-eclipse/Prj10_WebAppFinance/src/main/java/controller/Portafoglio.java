package controller;

import java.util.ArrayList;
import java.util.List;

import model.Azione;


public class Portafoglio {

	private List<Azione> azioni;
	private String cliente;
	
	public Portafoglio(String cliente) {
		this.cliente = cliente;
		this.azioni = new ArrayList<>();
	}
	
	public void aggiungiAzione(Azione a) {
		this.azioni.add(a);
	}
	public List<Azione> getAzioni(){
		return this.azioni;
	}
	public Azione getAzioneByNome(String nomeAzione) {
		for (Azione azione : azioni) {
			if (azione.getNome().equals(nomeAzione))
				return azione;
		}
		return null;
	}
	public void eliminaAzione(Azione a) {
		if (azioni.contains(a))
			azioni.remove(a);
	}
}
