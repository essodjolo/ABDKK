package com.c353.bicomat.services.interfaces;

import java.util.List;

import com.c353.bicomat.entities.Banque;
import com.c353.bicomat.entities.Client;
import com.c353.bicomat.entities.CompteAgency;

/**
 * Interface pour l'administration des comptes Agency.
 * 
 * @author ATSOU Komi Bi-Ayéfo
 *
 */
public interface IAgencyAdminService {
	
	void creerCompteAgencyProvisoire(Client client, 
									String questionSecrete, 
									String reponseQuestionSecrete);
	
	void validerCompteAgencyProvisoire(CompteAgency clientInterneAgency);
	
	CompteAgency consulterCompteAgency(Long id);
	
	List<CompteAgency> listerComptesAgencyParBanque(Banque banque);

	int nombreTotalComptesProvisoires();

}
