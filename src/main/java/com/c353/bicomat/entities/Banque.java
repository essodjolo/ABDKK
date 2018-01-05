package com.c353.bicomat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * 
 * @author DINAH Aladji Jérémie
 *
 */

@Entity
public class Banque {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private String Nom;
	
	@Column
	private String Adresse;

	public Long getId() {
		return Id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public Banque(Long id, String nom, String adresse) {
		super();
		Id = id;
		Nom = nom;
		Adresse = adresse;
	}

	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
