package com.kindsonthegenius.fleetapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetapp.models.Country;
//import com.kindsonthegenius.fleetapp.models.State;

@Repository
@EnableJpaRepositories
public interface CountryRepository extends JpaRepository<Country, Integer> {
	public Optional findById(Integer id);
	public List<Country> findByCapital(String capital);
	public List<Country> findByClassnumberAndExamtype(Integer classnumber, String examtype);
	//public Optional findById(Integer id);



}
