package com.c353.bicomat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Client;
import com.c353.bicomat.repository.ClientRepository;
import com.c353.bicomat.services.IClientService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class ClientService extends DefaultService<Client, Integer> implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public JpaRepository<Client, Integer> getDao() {
        return clientRepository;
    }

}
