package com.c353.bicomat.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Conseiller;
import com.c353.bicomat.repository.ConseillerRepository;
import com.c353.bicomat.services.interfaces.IConseillerService;


/**
 * 
 * @author BOKOBOSSO Eyapene
 *
 */
@Service
public class ConseillerService implements IConseillerService{
	
    /**
     * Injection par Spring
     */
    @Autowired
    private ConseillerRepository  conseillerRepository;

	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		
		return conseillerRepository.save(conseiller);
	}

	@Override
	public Conseiller updateConseiller(Conseiller conseiller) {
		
		return conseillerRepository.saveAndFlush(conseiller);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		
		conseillerRepository.delete(conseiller);
	}

	@Override
	public List<Conseiller> findAllConseiller() {
	
     return conseillerRepository.findAll();
		
	}

	@Override
	public Conseiller getUnConseiller(Long id) {
		
		return conseillerRepository.findOne(id);
	}


}
