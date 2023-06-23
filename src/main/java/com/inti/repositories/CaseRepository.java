package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long>{
	//Case findByReferenceCase(String referenceCase);
	//List<Case> findByReferenceCase(String referenceCase);
	
}
