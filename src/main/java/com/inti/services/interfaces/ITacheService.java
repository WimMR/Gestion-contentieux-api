package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Tache;

public interface ITacheService {
	
	List<Tache> findAll();
	
	Optional<Tache> findOne(Long id);
	
	Tache save(Tache tache);
	
	void delete(Long id);

}
