package com.c353.bicomat.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Client;
import com.c353.bicomat.repository.ClientRepository;
import com.c353.bicomat.services.IClientService;


/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class ClientService implements IClientService{
	
    /**
     * Injection par Spring
     */
    @Autowired
    private ClientRepository  clientRepository;

	@Override
	public Client saveClient(Client client) {
		
		return clientRepository.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		
		return clientRepository.saveAndFlush(client);
	}

	@Override
	public void deleteClient(Client client) {
		
		 clientRepository.delete(client);
	}

	@Override
	public List<Client> findAllClient() {
	
     return clientRepository.findAll();
		
	}

	@Override
	public Client getUnClient(Long id) {
		
		return clientRepository.findOne(id);
	}


}
