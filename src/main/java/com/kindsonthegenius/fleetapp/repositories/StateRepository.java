package com.kindsonthegenius.fleetapp.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetapp.models.State;

@Repository
@EnableJpaRepositories
public interface StateRepository extends JpaRepository<State, Integer> {
	public List<State> findByName(String name);
	public List<State> findByUsername(String username);



}
