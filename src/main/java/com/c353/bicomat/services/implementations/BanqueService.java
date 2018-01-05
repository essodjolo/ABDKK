package com.c353.bicomat.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c353.bicomat.entities.Banque;
import com.c353.bicomat.repository.BanqueRepository;
import com.c353.bicomat.services.interfaces.IBanqueService;


/**
 * 
 * @author DINAH Aladji Jérémie
 *
 */
@Service
public class BanqueService implements IBanqueService{
	
    /**
     * Injection par Spring
     */
    @Autowired
    private BanqueRepository  banqueRepository;

	@Override
	public Banque saveBanque(Banque banque) {
		
		return banqueRepository.save(banque);
	}

	@Override
	public Banque updateBanque(Banque banque) {
		
		return banqueRepository.saveAndFlush(banque);
	}

	@Override
	public void deleteBanque(Banque banque) {
		
		 banqueRepository.delete(banque);
	}

	@Override
	public List<Banque> findAllBanque() {
	
     return banqueRepository.findAll();
		
	}

	@Override
	public Banque getUneBanque(Long id) {
		
		return banqueRepository.findOne(id);
	}


}
