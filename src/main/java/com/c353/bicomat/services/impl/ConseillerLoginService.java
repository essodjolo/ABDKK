package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.ConseillerLogin;
import com.c353.bicomat.repository.ConseillerLoginRepository;
import com.c353.bicomat.services.IConseillerLoginService;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 
 * @author BOKOBOSSO Eyapene
 *
 */
@Service
public class ConseillerLoginService extends DefaultService<ConseillerLogin, Integer> implements IConseillerLoginService {

    @Autowired
    private ConseillerLoginRepository conseillerLoginRepository;

    @Override
    public JpaRepository<ConseillerLogin, Integer> getDao() {
        return conseillerLoginRepository;
    }

}
