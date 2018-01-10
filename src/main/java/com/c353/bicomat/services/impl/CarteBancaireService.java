package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.CarteBancaire;
import com.c353.bicomat.repository.CarteBancaireRepository;
import com.c353.bicomat.services.ICarteBancaireService;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class CarteBancaireService extends DefaultService<CarteBancaire, Integer> implements ICarteBancaireService {

    @Autowired
    private CarteBancaireRepository carteBancaireRepository;

    @Override
    public JpaRepository<CarteBancaire, Integer> getDao() {
        return carteBancaireRepository;
    }

}
