package com.c353.bicomat.entities.banque;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author KAHANAM Essodjolo
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(
//        name = "typeClient",
//        discriminatorType = DiscriminatorType.STRING
//)
public class Client implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClient;

    @Column
    private String numeroCompte;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String email;

    @Column(insertable = false, updatable = false)
    private String typeClient;

    @ManyToOne
    @JoinColumn(name = "id_compte_bancaire")
    private CompteBancaire compteBancaire;

    @ManyToOne
    @JoinColumn(name = "id_carte_bancaire")
    private CarteBancaire carteBancaire;

    
    public Long getIdClient() {
        return idClient;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public CarteBancaire getCarteBancaire() {
        return carteBancaire;
    }

    public void setCompteBancaire(CarteBancaire carteBancaire) {
        this.carteBancaire = carteBancaire;
    }

    public Client(Long idClient, String nom, String prenom, String email, String typeClient) {
        super();
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.typeClient = typeClient;
    }

    public Client() {
        super();

    }

    public Client(String nomClient, Long idClient) {
        this.nom = nomClient;
        this.idClient = idClient;
    }

}
