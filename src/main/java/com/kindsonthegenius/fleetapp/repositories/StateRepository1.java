package com.kindsonthegenius.fleetapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetapp.models.State1;
@Repository

public interface StateRepository1 extends JpaRepository<State1, Integer> {
	List<State1> findByTitle(String title);

}
