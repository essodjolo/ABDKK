package com.c353.bicomat.services;

import java.util.List;

import com.c353.bicomat.entities.ClientInterne;

/**
 * 
 * @author KAHANAM Essodjolo
 *
 */
public interface IClientInterneService {
	
	public ClientInterne saveClientInterne(ClientInterne clientInterne);

	public ClientInterne updateClient(ClientInterne clientInterne);

	public void deleteClientInterne(ClientInterne clientInterne);

	public List<ClientInterne> findAllClientInterne();

	public ClientInterne getUnClientInterne(Long id);

}
