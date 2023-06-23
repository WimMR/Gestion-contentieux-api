package com.inti.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Case;
import com.inti.services.interfaces.ICaseService;

@RestController
@CrossOrigin
public class CaseController {

	@Autowired
	ICaseService caseService;

	@GetMapping("/cases")
	public List<Case> findAll()
	{
		return caseService.findAll();
	}
	
	@GetMapping("/cases/{idCase}")
	public Optional<Case> findOneTest(@PathVariable("idCase") Long id) {
		return (caseService.findOneTest(id));
	}
	
	/*@GetMapping("/cases/{ref}")
	public List<Case> findByReferenceCase(@PathVariable("ref")String ref)
	{
		return caseService.findByReferenceCase(ref);
	}*/
	
	@PostMapping("/cases")
	public Case saveCase(@RequestBody Case caseObject)
	{
		return caseService.save(caseObject);
	}
	
	@DeleteMapping("/cases/{idCase}")
	public void deleteCase(@PathVariable("idCase")Long id)
	{
		caseService.delete(id);
	}
	
	@PutMapping("/cases/{idCase}")
	public Optional<Case> updateCase(@PathVariable("idCase")Long id, @RequestBody Case caseObject)
	{
		Optional<Case> testCase = caseService.findOneTest(id);
		Case currentCase = new Case();
		if (testCase.isPresent())
		{
			currentCase = testCase.get();
			currentCase.setDescriptionCase(caseObject.getDescriptionCase());
			currentCase.setReferenceCase(caseObject.getReferenceCase());
			currentCase.setTitleCase(caseObject.getTitleCase());
			currentCase.setStatus(caseObject.getStatus());
			currentCase.setDocuments(caseObject.getDocuments());
			return Optional.of(caseService.save(currentCase));
		}
		else 
			{
				currentCase= null;
				return Optional.ofNullable(currentCase);
			}

	}
}
