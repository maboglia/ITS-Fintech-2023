package com.boglia.entities;

import java.time.LocalDate;

import org.hibernate.annotations.Fetch;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="filminsala") 
public class FilmInSala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Cinema cinema;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
	private Film film;
	
	private LocalDate data;
	
	private double prezzo;
	
	private int postRimanenti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPostRimanenti() {
		return postRimanenti;
	}

	public void setPostRimanenti(int postRimanenti) {
		this.postRimanenti = postRimanenti;
	}
	
	
	
	
}
