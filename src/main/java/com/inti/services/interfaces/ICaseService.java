package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Case;
import com.inti.entities.Document;

public interface ICaseService {
	List<Case> findAll();
	Case findOne(Long id);
	Case save(Case caseObject);
	void delete (Long id);
	//Case findByReferenceCase(String referenceCase);
	//List<Case> findByReferenceCase(String referenceCase);
}
