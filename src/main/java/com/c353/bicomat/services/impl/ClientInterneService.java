package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.ClientInterne;
import com.c353.bicomat.repository.ClientInterneRepository;
import com.c353.bicomat.services.IClientInterneService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class ClientInterneService extends DefaultService<ClientInterne, Integer> implements IClientInterneService {

    @Autowired
    private ClientInterneRepository clientInterneRepository;

    @Override
    public JpaRepository<ClientInterne, Integer> getDao() {
        return clientInterneRepository;
    }

}
