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

/**
 * @author Jérémie
 *
 */
@Entity
public class Banque {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nom;
	
	@Column
	private String adresse;

	

	/**
	 * @return
	 */
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
