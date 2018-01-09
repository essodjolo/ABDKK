package com.c353.bicomat.services;

import java.util.List;

import com.c353.bicomat.entities.Client;

/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
public interface IClientService {
	
	public Client saveClient(Client client);

	public Client updateClient(Client client);

	public void deleteClient(Client client);

	public List<Client> findAllClient();

	public Client getUnClient(Long id);

}
