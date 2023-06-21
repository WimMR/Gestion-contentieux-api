package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long>{

}
