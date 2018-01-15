package com.c353.bicomat.entities.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Classe entité pour Banque.
 *
 * @author DINAH Aladji Jérémie
 *
 */
@Entity
public class Banque {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nom;

    @Column
    private String adresse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Banque(Integer id, String nom, String adresse) {
        super();
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Banque() {
        super();

    }

}
