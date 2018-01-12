package com.c353.bicomat.services;

import java.util.List;

import com.c353.bicomat.entities.Conseiller;

/**
 * 
 * @author BOKOBOSSO Eyapene
 *
 */
public interface IConseillerService {
	
	public Conseiller saveConseiller(Conseiller conseiller);

	public Conseiller updateConseiller(Conseiller conseiller);

	public void deleteConseiller(Conseiller conseiller);

	public List<Conseiller> findAllConseiller();

	public Conseiller getUnConseiller(Long id);

}
