package com.c353.bicomat.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * 
 * @author DINAH Aladji Jérémie
 *
 */

@Entity
public class Banque {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String nom;
	
	@Column
	private String adresse;

	 @OneToMany
	 @JoinColumn( name = "id" )
	 private List<CompteBancaire>  comptebancaires;
	    

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	

	public List<CompteBancaire> getComptebancaires() {
		return comptebancaires;
	}


	public void setComptebancaires(List<CompteBancaire> comptebancaires) {
		this.comptebancaires = comptebancaires;
	}


	public Banque(Long id, String nom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}


	public Banque() {
		super();
		
	}
	
	
	

}
