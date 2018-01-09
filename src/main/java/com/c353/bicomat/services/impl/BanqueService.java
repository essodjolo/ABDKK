package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Banque;
import com.c353.bicomat.repository.BanqueRepository;
import com.c353.bicomat.services.IBanqueService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DINAH Aladji Jérémie
 *
 */
@Service
public class BanqueService extends DefaultService<Banque, Integer> implements IBanqueService {

    @Autowired
    private BanqueRepository banqueRepository;

    @Override
    public JpaRepository<Banque, Integer> getDao() {
        return banqueRepository;
    }

}
