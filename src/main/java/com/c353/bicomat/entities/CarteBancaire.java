package com.c353.bicomat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;


/**
 * 
 * @author KAHANAM Essodjolo
 *
 */

@Entity
public class CarteBancaire {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String numeroCB;
	
	@Column
	private String typeCarte;
	
	@Column
	private Date echeance;
	
	@Column
	private String codeCrypto;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(String numeroCB) {
		this.numeroCB = numeroCB;
	}
	
	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	
	public Date getEcheance() {
		return echeance;
	}

	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}
	
	public String getCodeCrypto() {
		return codeCrypto;
	}

	public void setCodeCrypto(String codeCrypto) {
		this.codeCrypto = codeCrypto;
	}

	
	public CarteBancaire(Long id, String numeroCB, String typeCarte, Date echeance, String codeCrypto) {
		super();
		this.id = id;
		this.numeroCB = numeroCB;
		this.typeCarte = typeCarte;
		this.echeance = echeance;
		this.codeCrypto = codeCrypto;
	}

	public CarteBancaire() {
		super();
	}
	

}
