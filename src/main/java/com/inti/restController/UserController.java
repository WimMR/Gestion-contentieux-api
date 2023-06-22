package com.inti.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;
import com.inti.services.interfaces.IUserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> findAll() {
	    List<User> userList = userService.findAll();
	    return (userList);
	}

	/*@RequestMapping(value = "users/{idUser}", method = RequestMethod.GET)
	public User findOne(@PathVariable("idUser") Long id) {
		return userService.findOne(id);
	}*/
	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Optional<User> findOne(@PathVariable("idUser") Long id) {
	    return(userService.findOne(id));
	}

	@RequestMapping(value = "users/{idUser}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("idUser") Long id) {
		userService.delete(id);
	}
	


	@PutMapping("/users/{idUser}")
	public Optional<User> updateUser(@PathVariable("idUser")Long id, @RequestBody User user)
	{
		Optional<User> testUser= userService.findOne(id);
		User currentUser =new User();

		if (testUser.isPresent())
		{
			currentUser =testUser.get();
			currentUser.setEmail(user.getEmail());
			currentUser.setPrenomUtilisateur(user.getPrenomUtilisateur());
			currentUser.setNomUtilisateur(user.getNomUtilisateur());
			return Optional.of(userService.save(currentUser));
		}
		else 
			{
				currentUser =null;
				return Optional.ofNullable(currentUser);
			}
	}
	@PostMapping("/users")
	public Optional<User> saveUser(@RequestBody User user) {
	    return Optional.ofNullable(userService.save(user));
	}
}
