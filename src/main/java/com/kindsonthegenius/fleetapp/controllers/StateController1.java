package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.models.State1;
import com.kindsonthegenius.fleetapp.services.StateService1;


@Controller
public class StateController1 {
	
	
	@Autowired 
	private StateService1 stateService1;
		
		//Get All Countrys
		@SuppressWarnings("null")
		@GetMapping("states1")
		
		//public String findAll(org.springframework.ui.Model model) {
		public String findAll(Model model){	
			
			//ModelMap modelMap = null;
			//modelMap.addAttribute("countries", countryService.findAll());
			//ModelAndView mav = null;
			//mav.addObject("countries", countryService.findAll());
			List<State1> stateList1 = stateService1.findAll();
		    // Log the data to check if it's dynamic
		    stateList1.forEach(state -> System.out.println(state.getCapital()));
			
			model.addAttribute("states1", stateService1.findAll());
			return "state1";
		} 
		
		@RequestMapping(value="/states1/{title}")
		 //@GetMapping("/{id}") // Maps GET requests to /locations/{id}
		   // public String getLocationById(@PathVariable Long id, Model model) {
			 public String getStateByTitlee(@PathVariable String title,Model model){
			
			
			
		       // Location location = locationService.getLocationById(id); // Fetch location by ID
		        List<State1> mytitle = stateService1.getStateByTitle(title);
		       // model.addAttribute("location", location); // Add location to the model
		        model.addAttribute("mytitles", mytitle); // Add location to the model
		     // Name of the Thymeleaf template
		      //return stateService.getStateByName(name);
		        return  "state1";
		    }

}
