package com.boglia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "documenti")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String path;
	@Column(name = "nome_file")
	private String nomeFile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getNomeFile() {
		return nomeFile;
	}
	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [id=");
		builder.append(id);
		builder.append(", path=");
		builder.append(path);
		builder.append(", nomeFile=");
		builder.append(nomeFile);
		builder.append("]");
		return builder.toString();
	}
	
}
