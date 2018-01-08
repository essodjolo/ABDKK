/**
 * 
 */
package com.c353.bicomat.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c353.bicomat.entities.CompteBancaire;
import com.c353.bicomat.repository.CompteBancaireRepository;
import com.c353.bicomat.services.interfaces.ICompteBancaire;

/**
 * @author Jérémie
 *
 */
public class CompteBancaireService implements ICompteBancaire{

	@Autowired
	private CompteBancaireRepository compteBancaireRepository;
	
	
	@Override
	public CompteBancaire saveCompteBancaire(CompteBancaire compteBancaire) {
		return compteBancaireRepository.save(compteBancaire);
	}

	@Override
	public CompteBancaire updateCompteBancaire(CompteBancaire compteBancaire) {
		return compteBancaireRepository.saveAndFlush(compteBancaire);
	}

	@Override
	public void deleteCompteBancaire(CompteBancaire compteBancaire) {
		compteBancaireRepository.delete(compteBancaire);
		
	}

	@Override
	public List<CompteBancaire> findAllCompteBancaire() {
		return compteBancaireRepository.findAll();
	}

	@Override
	public CompteBancaire getUneCompteBancaire(Long id) {
		return compteBancaireRepository.findOne(id);
	}

//	@Override
//	public List<CompteBancaire> listerComptesBancairesClient(Client client) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
