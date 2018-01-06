package com.c353.bicomat.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.CarteBancaire;
import com.c353.bicomat.repository.CarteBancaireRepository;
import com.c353.bicomat.services.interfaces.ICarteBancaireService;


/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class CarteBancaireService implements ICarteBancaireService{
	
    /**
     * Injection par Spring
     */
    @Autowired
    private CarteBancaireRepository  carteBancaireRepository;

	@Override
	public CarteBancaire saveCarteBancaire(CarteBancaire carteBancaire) {
		
		return carteBancaireRepository.save(carteBancaire);
	}

	@Override
	public CarteBancaire updateCarteBancaire(CarteBancaire carteBancaire) {
		
		return carteBancaireRepository.saveAndFlush(carteBancaire);
	}

	@Override
	public void deleteCarteBancaire(CarteBancaire carteBancaire) {
		
		 carteBancaireRepository.delete(carteBancaire);
	}

	@Override
	public List<CarteBancaire> findAllCarteBancaire() {
	
     return carteBancaireRepository.findAll();
		
	}

	@Override
	public CarteBancaire getUneCarteBancaire(Long id) {
		
		return carteBancaireRepository.findOne(id);
	}


}
