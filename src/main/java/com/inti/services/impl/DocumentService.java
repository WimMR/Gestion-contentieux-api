package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Document;
import com.inti.repositories.DocumentRepository;
import com.inti.services.interfaces.IDocumentService;
@Service
public class DocumentService implements IDocumentService {

	@Autowired
	DocumentRepository documentRepository;
	
	@Override
	public List<Document> findAll() {
		return documentRepository.findAll();
	}

	/*@Override
	public Document findOne(Long id) {

		return documentRepository.findById(id).get();
	}*/
	@Override
	public Optional<Document> findOneTest(Long id) {

		return documentRepository.findById(id);
	}

	@Override
	public Document save(Document documentObject) {

		return documentRepository.save(documentObject);
	}

	@Override
	public void delete(Long id) {
		documentRepository.deleteById(id);
		
	}

	/*@Override
	public List<Document> findByCaseDocument(String nameDocument) {
		return documentRepository.findByCaseDocument(nameDocument);
	}*/



}
