package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.CompteAgency;
import com.c353.bicomat.repository.CompteAgencyRepository;
import com.c353.bicomat.services.ICompteAgencyService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class CompteAgencyService extends DefaultService<CompteAgency, Integer> implements ICompteAgencyService {

    @Autowired
    private CompteAgencyRepository compteAgencyRepository;

    @Override
    public JpaRepository<CompteAgency, Integer> getDao() {
        return compteAgencyRepository;
    }

}
