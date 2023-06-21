package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.User;
import com.inti.repositories.UserRepository;
import com.inti.services.interfaces.IUserService;

public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
		
	}

}
