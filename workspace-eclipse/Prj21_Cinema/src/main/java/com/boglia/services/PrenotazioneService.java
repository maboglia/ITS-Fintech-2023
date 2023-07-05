package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prenotazione;

public interface PrenotazioneService {

	List<Prenotazione> getAll();
	Prenotazione getById(int id);
	Prenotazione add(Prenotazione c);
}
