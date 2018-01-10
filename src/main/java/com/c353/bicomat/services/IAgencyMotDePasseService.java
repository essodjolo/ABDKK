package com.c353.bicomat.services;


import com.c353.bicomat.entities.Client;
import com.c353.bicomat.entities.CompteAgency;

/**
 * Interface pour la gestion des mots de passe de comptes Agency.
 * 
 * @author KAHANAM Essodjolo
 *
 */
public interface IAgencyMotDePasseService {
	
	void signalerOubliMotDePasse(CompteAgency compteAgency);
	
	boolean verifierProprietaireCompteAgency(Client client, CompteAgency compteAgency);
	
	void restaurerMotDePasseAgency(CompteAgency compteAgency);
	
}