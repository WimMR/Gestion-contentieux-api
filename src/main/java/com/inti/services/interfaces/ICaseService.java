package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Case;


public interface ICaseService {
	List<Case> findAll();
	Optional<Case> findOneTest(Long id);
	//Case findOne(Long id);
	Case save(Case caseObject);
	void delete (Long id);
	//Case findByReferenceCase(String referenceCase);
	//List<Case> findByReferenceCase(String referenceCase);
}
