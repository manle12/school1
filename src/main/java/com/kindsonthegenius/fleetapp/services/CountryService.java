package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

	@Autowired
	private CountryRepository countryRepository;
	
	
	
	
		public List<Country> findAll(){
			return countryRepository.findAll();
		}	
		
		//Get Country By Id
		public Optional<Country> findById(int id) {
			return countryRepository.findById(id);
		}	
		
		//Delete Country
		public void delete(Integer id) {
			countryRepository.deleteById(id);
		}
		
		//Update Country
		public void save( Country country) {
			countryRepository.save(country);
		}
		
		public List<Country> getCapitalByName(String capital){
			return countryRepository.findByCapital(capital);
			}
		public List<Country> getStateByClassnumberAndExamtype(Integer classnumber,String examtype){
		return countryRepository.findByClassnumberAndExamtype(classnumber,examtype);
			}
		/*
		 public List<Country> getStateByClassnumberAndExamtype(Integer classnumber, String examtype) {
		        // Log the input parameters
		        logger.debug("Calling findByClassAndExamtype with classnumber: {} and examtype: {}", classnumber, examtype);

		        // Call the repository method
		        List<Country> result = countryRepository.findByClassnumberAndExamtype(classnumber, examtype);

		        // Log the result from the repository
		        logger.debug("Result from findByClassAndExamtype: {}", result);

		        return result;
		    }
		
		*/
		public Optional<Country> getCountryById(int id) {
			return countryRepository.findById(id);
		}	
	
	

}
