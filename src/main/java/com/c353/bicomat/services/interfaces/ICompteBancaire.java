package com.c353.bicomat.services.interfaces;

import java.util.List;

import com.c353.bicomat.entities.CompteBancaire;

/**
 * 
 * @author Jérémie
 *
 */
public interface ICompteBancaire {
	
	public CompteBancaire saveCompteBancaire(CompteBancaire compteBancaire);

	public CompteBancaire updateCompteBancaire(CompteBancaire compteBancaire);

	public void deleteCompteBancaire(CompteBancaire compteBancaire);

	public List<CompteBancaire> findAllCompteBancaire();

	public CompteBancaire getUneCompteBancaire(Long id);
	
	public boolean existeCompteBancaire(CompteBancaire compteBancaire);
	
//	public List<CompteBancaire> listerComptesBancairesClient(Client client);

}
