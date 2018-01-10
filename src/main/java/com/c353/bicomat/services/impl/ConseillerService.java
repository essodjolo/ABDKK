package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Conseiller;
import com.c353.bicomat.repository.ConseillerRepository;
import com.c353.bicomat.services.IConseillerService;
import org.springframework.data.jpa.repository.JpaRepository;


@Service
public class ConseillerService extends DefaultService<Conseiller, Integer> implements IConseillerService {

    @Autowired
    private ConseillerRepository conseillerRepository;

    @Override
    public JpaRepository<Conseiller, Integer> getDao() {
        return conseillerRepository;
    }

}