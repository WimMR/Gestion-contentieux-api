package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
