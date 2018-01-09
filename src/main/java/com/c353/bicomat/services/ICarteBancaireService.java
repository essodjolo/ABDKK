package com.c353.bicomat.services;

import java.util.List;

import com.c353.bicomat.entities.CarteBancaire;

/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
public interface ICarteBancaireService {
	
	public CarteBancaire saveCarteBancaire(CarteBancaire carteBancaire);

	public CarteBancaire updateCarteBancaire(CarteBancaire carteBancaire);

	public void deleteCarteBancaire(CarteBancaire carteBancaire);

	public List<CarteBancaire> findAllCarteBancaire();

	public CarteBancaire getUneCarteBancaire(Long id);

}
