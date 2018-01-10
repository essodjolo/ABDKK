package com.c353.bicomat.services.impl;

import com.c353.bicomat.entities.Client;
import com.c353.bicomat.entities.CompteAgency;
import com.c353.bicomat.services.IAgencyMotDePasseService;

/**
 * Implémentation de l'interface de gestion des mots de passe de comptes Agency.
 * 
 * @author KAHANAM Essodjolo
 *
 */
public class AgencyMotDePasseService implements IAgencyMotDePasseService {

	@Override
	public void signalerOubliMotDePasse(CompteAgency compteAgency) {
		
	}
	
	@Override
	public boolean verifierProprietaireCompteAgency(Client client, CompteAgency compteAgency) {
		return false;
	}
	
	@Override
	public void restaurerMotDePasseAgency(CompteAgency compteAgency) {
		
	}

}