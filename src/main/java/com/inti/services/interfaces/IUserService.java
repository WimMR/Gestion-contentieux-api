package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.User;

public interface IUserService {
	List<User> findAll();

	Optional<User> findOne(Long id);

	User save(User user);

	void delete(Long id);
	
}
