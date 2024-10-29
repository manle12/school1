package com.kindsonthegenius.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.models.State1;
import com.kindsonthegenius.fleetapp.repositories.StateRepository1;


@Service
public class StateService1 {
	
	@Autowired
	private StateRepository1 stateRepository1;
	
	
	
	
		public List<State1> findAll(){
			return stateRepository1.findAll();
		}	
		
		
		
		//Delete Country
		public void delete(Integer id) {
			stateRepository1.deleteById(id);
		}
		
		//Update Country
		public void save( State1 state) {
			stateRepository1.save(state);
		}
		
		public List<State1> getStateByTitle(String title){
			return stateRepository1.findByTitle(title);
			}

}
