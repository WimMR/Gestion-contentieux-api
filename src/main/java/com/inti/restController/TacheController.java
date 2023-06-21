package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tache;
import com.inti.services.interfaces.ITacheService;

@RestController
@CrossOrigin
public class TacheController {
	@Autowired
	ITacheService tacheService;
	
	@GetMapping("/taches")
	public List<Tache> findAll(){
		return tacheService.findAll();
	}
	
	@GetMapping("/taches/{id}")
	public Tache findOne(@PathVariable("id") Long id) {
		return tacheService.findOne(id);
	}
	
	@PostMapping("/taches")
	public Tache saveTache(@RequestBody Tache tache) {
		return tacheService.save(tache);
	}
	
	@DeleteMapping("/taches/{id}")
	public void deleteTache(@PathVariable("id") Long id) {
		tacheService.delete(id);
	}
}
