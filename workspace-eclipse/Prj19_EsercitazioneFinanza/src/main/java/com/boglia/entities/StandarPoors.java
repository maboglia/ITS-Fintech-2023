package com.boglia.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "s&p500")
public class StandarPoors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Symbol;
	private String Security;
	@Column(name = "GICS_Sector") 
	private String GICSSector;
	@Column(name = "GICS_Sub-Industry")
	private String SubIndustry;
	private String HeadquartersLocation;
	@Column(nullable = true)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate DateAdded;
	private String CIK;
	private String Founded;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public String getSecurity() {
		return Security;
	}
	public void setSecurity(String security) {
		Security = security;
	}
	public String getGICSSector() {
		return GICSSector;
	}
	public void setGICSSector(String gICSSector) {
		GICSSector = gICSSector;
	}
	public String getSubIndustry() {
		return SubIndustry;
	}
	public void setSubIndustry(String subIndustry) {
		SubIndustry = subIndustry;
	}
	public String getHeadquartersLocation() {
		return HeadquartersLocation;
	}
	public void setHeadquartersLocation(String headquartersLocation) {
		HeadquartersLocation = headquartersLocation;
	}
	public LocalDate getDateAdded() {
		return DateAdded;
	}
	public void setDateAdded(LocalDate dateAdded) {
		DateAdded = dateAdded;
	}
	public String getCIK() {
		return CIK;
	}
	public void setCIK(String cIK) {
		CIK = cIK;
	}
	public String getFounded() {
		return Founded;
	}
	public void setFounded(String founded) {
		Founded = founded;
	}
	
	
	
}
