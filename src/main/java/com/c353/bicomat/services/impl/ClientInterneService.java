package com.c353.bicomat.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.ClientInterne;
import com.c353.bicomat.repository.ClientInterneRepository;
import com.c353.bicomat.services.IClientInterneService;


/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
@Service
public class ClientInterneService implements IClientInterneService{
	
    /**
     * Injection par Spring
     */
    @Autowired
    private ClientInterneRepository  clientInterneRepository;

	@Override
	public ClientInterne saveClientInterne(ClientInterne clientInterne) {
		
		return clientInterneRepository.save(clientInterne);
	}

	@Override
	public ClientInterne updateClient(ClientInterne clientInterne) {
		
		return clientInterneRepository.saveAndFlush(clientInterne);
	}

	@Override
	public void deleteClientInterne(ClientInterne clientInterne) {
		
		 clientInterneRepository.delete(clientInterne);
	}

	@Override
	public List<ClientInterne> findAllClientInterne() {
	
     return clientInterneRepository.findAll();
		
	}

	@Override
	public ClientInterne getUnClientInterne(Long id) {
		
		return clientInterneRepository.findOne(id);
	}


}
