package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	//Document findByNameDocument (String nameDocument);
	//List<Document> findByCaseDocument(String caseDocument);

}
