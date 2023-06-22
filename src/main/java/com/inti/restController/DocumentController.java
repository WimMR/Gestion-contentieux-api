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

import com.inti.entities.Document;
import com.inti.services.interfaces.IDocumentService;

@RestController
@CrossOrigin
public class DocumentController {

	@Autowired
	IDocumentService documentService;

	@GetMapping("/documents")
	public List<Document> findAll()
	{
		return documentService.findAll();
	}
	
	@GetMapping("/documents/{idDoc}")
	public Optional<Document> findOneTest(@PathVariable("idDoc") Long id) {
		return documentService.findOneTest(id);
	}
	/*@GetMapping("/documents/{name}")
	public List<Document> findByCaseDocument(@PathVariable("name")String name)
	{
		return documentService.findByCaseDocument(name);
	}*/
	
	@PostMapping("/documents")
	public Document saveDocument(@RequestBody Document document)
	{
		return documentService.save(document);
	}
	
	@DeleteMapping("/documents/{idDoc}")
	public void deleteDocument(@PathVariable("idDocument")Long id)
	{
		documentService.delete(id);
	}
	
	@PutMapping("/documents/{idDoc}")
	public Optional<Document> updateDocument(@PathVariable("idDocument")Long id, @RequestBody Document document)
	{
		Optional<Document> testDoc = documentService.findOneTest(id);
		Document currentDocument =new Document();

		if (testDoc.isPresent())
		{
			currentDocument =testDoc.get();
			currentDocument.setCreationDateDoc(document.getCreationDateDoc());
			currentDocument.setDescriptionDoc(document.getDescriptionDoc());
			currentDocument.setNameDoc(document.getNameDoc());
			currentDocument.setCaseDocument(document.getCaseDocument());
			return Optional.of(documentService.save(currentDocument));
		}
		else 
			{
				currentDocument =null;
				return Optional.ofNullable(currentDocument);
			}
	}
	
}
