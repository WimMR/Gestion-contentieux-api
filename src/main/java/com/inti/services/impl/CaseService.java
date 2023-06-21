package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Case;
import com.inti.repositories.CaseRepository;
import com.inti.services.interfaces.ICaseService;
@Service
public class CaseService implements ICaseService{

	@Autowired
	CaseRepository caseRepository;
	
	@Override
	public List<Case> findAll() {
		return caseRepository.findAll();
	}

	@Override
	public Case findOne(Long id) {
		return caseRepository.findById(id).get();
	}

	@Override
	public Case save(Case caseObject) {
		return caseRepository.save(caseObject);
	}

	@Override
	public void delete(Long id) {
		caseRepository.deleteById(id);
		
	}

	@Override
	public List<Case> findByReferenceCase(String referenceCase) {
		return caseRepository.findByReferenceCase(referenceCase);
	}



}
