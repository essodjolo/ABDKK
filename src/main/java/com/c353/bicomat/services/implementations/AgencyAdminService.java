package com.c353.bicomat.services.implementations;

import java.util.List;

import com.c353.bicomat.entities.Banque;
import com.c353.bicomat.entities.Client;
import com.c353.bicomat.entities.CompteAgency;
import com.c353.bicomat.services.interfaces.IAgencyAdminService;

public class AgencyAdminService implements IAgencyAdminService {

	@Override
	public void creerCompteAgencyProvisoire(Client client, String questionSecrete, String reponseQuestionSecrete) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validerCompteAgencyProvisoire(CompteAgency clientInterneAgency) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompteAgency consulterCompteAgency(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompteAgency> listerComptesAgencyParBanque(Banque banque) {
		// TODO Auto-generated method stub
		return null;
	}

}
