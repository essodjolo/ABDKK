package com.c353.bicomat.services.agency.impl;

import com.c353.bicomat.entities.banque.Client;
import com.c353.bicomat.entities.agency.CompteAgency;
import com.c353.bicomat.services.agency.api.IAgencyMotDePasseService;

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