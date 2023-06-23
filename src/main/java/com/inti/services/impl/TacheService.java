package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Tache;
import com.inti.repositories.TacheRepository;
import com.inti.services.interfaces.ITacheService;

@Service
public class TacheService implements ITacheService{
	
	@Autowired
	TacheRepository tacheRepository;

	@Override
	public List<Tache> findAll() {
		return tacheRepository.findAll();
	}
	
	@Override
	public Optional<Tache> findOne(Long id) {
		return tacheRepository.findById(id);
	}

	@Override
	public Tache save(Tache tache) {
		return tacheRepository.save(tache);
	}

	@Override
	public void delete(Long id) {
		tacheRepository.deleteById(id);
		
	}
	
	

}
