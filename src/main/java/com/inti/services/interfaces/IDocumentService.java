package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.Document;

public interface IDocumentService {

	List<Document> findAll();
	//Document findOne(Long id);
	Optional<Document> findOneTest(Long id);
	Document save(Document documentObject);
	void delete (Long id);
	//Document findByNameDocument(String nameDocument);
	//List<Document> findByCaseDocument(String caseDocument);
}
