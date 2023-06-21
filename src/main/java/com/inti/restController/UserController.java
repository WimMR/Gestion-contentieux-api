package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tache;
import com.inti.entities.User;
import com.inti.services.interfaces.IUserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	IUserService userService;

	@RequestMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "users/{idUser}", method = RequestMethod.GET)
	public User findOne(@PathVariable("idUser") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "users/{idUser}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("idUser") Long id) {
		userService.delete(id);
	}

	@PutMapping("/users/{idUser}")
	public User updateUser(@PathVariable("idUser") Long id, @RequestBody User user) {
		User currentParent = userService.findOne(id);
		currentParent.setEmail(user.getEmail());
		currentParent.setNomUtilisateur(user.getPrenomUtilisateur());
		currentParent.setPrenomUtilisateur(user.getPrenomUtilisateur());
		return userService.save(currentParent);

	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}
}
