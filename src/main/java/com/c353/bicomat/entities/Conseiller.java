package com.c353.bicomat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author BOKOBOSSO Eyapene
 *
 */

@Entity
public class Conseiller {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@ManyToOne
    @JoinColumn( name = "id_clientInterne" )
    private ClientInterne clientInterne;
	
	//@OneToOne
    //@JoinColumn( name = "id_conseillerLogin" )
    //private ConseillerLogin conseillerLogin;
    
	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ClientInterne getClientInterne() {
		return clientInterne;
	}

	public void setClientInterne(ClientInterne clientInterne) {
		this.clientInterne = clientInterne;
	}

	//public ConseillerLogin getConseillerLogin() {
	//	return conseillerLogin;
	//}

	//public void setConseillerLogin(ConseillerLogin conseillerLogin) {
	//	this.conseillerLogin = conseillerLogin;
	//}
	
	public Conseiller(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Conseiller() {
		super();
		
	}

	public Conseiller(String nomConseiller, Long idConseiller) {
		this.nom = nomConseiller;
		this.id = idConseiller;
	}
	
	

}
