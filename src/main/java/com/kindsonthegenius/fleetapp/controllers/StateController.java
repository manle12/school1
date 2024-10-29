package com.kindsonthegenius.fleetapp.controllers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//post name  password    //post name  password      //post name  password     //post name  password    //post name  password  //post name  password
import org.springframework.beans.factory.annotation.Autowired;
//post name  password    //post name  password      //post name  password     //post name  password    //post name  password  //post name  password
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.services.StateService;


@Controller



public class StateController {
	
@Autowired 
private StateService stateService;


	
	//Get All Countrys
	@SuppressWarnings("null")
	@GetMapping("states")
	
	//public String findAll(org.springframework.ui.Model model) {
	public String findAll(Model model){	
		//post name  password    //post name  password      //post name  password     //post name  password    //post name  password  //post name  password
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	     String username = authentication.getName();
	     System.out.println("Current authenticated user: " + username);
	     
	     Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	    // authorities.forEach(authority -> System.out.println(authority.getAuthority()));
	     
	     List<String> authorities1 = authentication.getAuthorities()
	                .stream()
	                .map(GrantedAuthority::getAuthority)  // Get the authority name (role/permission)
	                .collect(Collectors.toList());
	        System.out.println("Current Role: " + authorities1);
	     
	      Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
	     
	     // Get the username
	     String username1 = authentication1.getName();

	     // Check if the authentication principal is a UserDetails object
	     if (authentication1.getPrincipal() instanceof User) {
	         // Cast the principal to a UserDetails object and retrieve the password
	         User userDetails = (User) authentication1.getPrincipal();
	         String password = userDetails.getPassword();
	         
	         // Log the username and password (for testing purposes only)
	         System.out.println("Username: " + username1);
	         System.out.println("Password: " + password);  // WARNING: Do not log passwords in production!
	         System.out.println("The type of the variable is: " + authorities1.getClass().getSimpleName());
	         String authorities2 = authorities1.get(0);
	         System.out.println("Converted value: " + authorities2);
	     }
	   //post name  password    //post name  password      //post name  password     //post name  password    //post name  password  //post name  password
		
		//ModelMap modelMap = null;
		//modelMap.addAttribute("countries", countryService.findAll());
		//ModelAndView mav = null;
		//mav.addObject("countries", countryService.findAll());
		List<State> stateList = stateService.findAll();
		
		
		//start to limit number of rows
		// Define the maximum number of rows you want to display
		int maxRows = 1;
		// If the list is larger than the maxRows, trim it
        if (stateList.size() > maxRows) {
            stateList = stateList.subList(0, maxRows);
        }
		
		
	    // Log the data to check if it's dynamic
	    stateList.forEach(state -> System.out.println(state.getCapital()));
		
		//model.addAttribute("states", stateService.findAll());
	    model.addAttribute("states", stateList);
		 model.addAttribute("username", username);
		 model.addAttribute("authorities2", authorities);
		
		 
		 
		return "state";
	} 
	
	/*
	//@RequestMapping(value="/states/{name}")
	@RequestMapping(value="/{name}")
	//@GetMapping("/by-capital")
	public String getStateByName(@PathVariable String name){
	
	//return stateService.getStateByName(name);
		 return  "state";
	}
	
	*/
	//@RequestMapping(value="/states/{name}")
	 @GetMapping("/states/{name}") // Maps GET requests to /locations/{id}
	   // public String getLocationById(@PathVariable Long id, Model model) {
		 public String getStateByName(@PathVariable String name,Model model){
		
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	     String username = authentication.getName();
	     System.out.println("Current authenticated user: " + username);
	     
	     Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	    // authorities.forEach(authority -> System.out.println(authority.getAuthority()));
	     
	     List<String> authorities1 = authentication.getAuthorities()
	                .stream()
	                .map(GrantedAuthority::getAuthority)  // Get the authority name (role/permission)
	                .collect(Collectors.toList());
	        System.out.println("Current Role: " + authorities1);
	     
	      Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
	     
	     // Get the username
	     String username1 = authentication1.getName();

	     // Check if the authentication principal is a UserDetails object
	     if (authentication1.getPrincipal() instanceof User) {
	         // Cast the principal to a UserDetails object and retrieve the password
	         User userDetails = (User) authentication1.getPrincipal();
	         String password = userDetails.getPassword();
	         
	         // Log the username and password (for testing purposes only)
	         System.out.println("Username: " + username1);
	         System.out.println("Password: " + password);  // WARNING: Do not log passwords in production!
	         System.out.println("The type of the variable is: " + authorities1.getClass().getSimpleName());
	         String authorities2 = authorities1.get(0);
	         System.out.println("Converted value: " + authorities2);
	     }
		
		
		
	       // Location location = locationService.getLocationById(id); // Fetch location by ID
	        List<State> location = stateService.getStateByName(name);
	       // model.addAttribute("location", location); // Add location to the model
	        model.addAttribute("states", location); // Add location to the model
	        model.addAttribute("username", username);
			 model.addAttribute("authorities2", authorities);
	     // Name of the Thymeleaf template
	      //return stateService.getStateByName(name);
	        return  "state";
	    }
	
	@RequestMapping(value="/states/{username}")
	// @GetMapping("/states/{username}") // Maps GET requests to /locations/{id}
	   // public String getLocationById(@PathVariable Long id, Model model) {
		 public String getStateByUsername(@PathVariable String username,Model model){
		
		
		
	       // Location location = locationService.getLocationById(id); // Fetch location by ID
	        List<State> myusername = stateService.getStateByUsername(username);
	        
	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		     String username1 = authentication.getName();
		     System.out.println("Current authenticated user: " + username1);
		     
		     Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		    // authorities.forEach(authority -> System.out.println(authority.getAuthority()));
		     
		     List<String> authorities1 = authentication.getAuthorities()
		                .stream()
		                .map(GrantedAuthority::getAuthority)  // Get the authority name (role/permission)
		                .collect(Collectors.toList());
		        System.out.println("Current Role: " + authorities1);
		     
		      Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
		     
		     // Get the username
		     String username11 = authentication1.getName();

		     // Check if the authentication principal is a UserDetails object
		     if (authentication1.getPrincipal() instanceof User) {
		         // Cast the principal to a UserDetails object and retrieve the password
		         User userDetails = (User) authentication1.getPrincipal();
		         String password = userDetails.getPassword();
		         
		         // Log the username and password (for testing purposes only)
		         System.out.println("Username: " + username11);
		         System.out.println("Password: " + password);  // WARNING: Do not log passwords in production!
		         System.out.println("The type of the variable is: " + authorities1.getClass().getSimpleName());
		         String authorities2 = authorities1.get(0);
		         System.out.println("Converted value: " + authorities2);
		     }
	       // model.addAttribute("location", location); // Add location to the model
	        model.addAttribute("states", myusername); // Add location to the model
	        model.addAttribute("username", username11);
			 model.addAttribute("authorities2", authorities1);
	     // Name of the Thymeleaf template
	      //return stateService.getStateByName(name);
	        return  "state";
	    }
	
	
	
	    
}
	
	
	
	//back decision name ====username
///and usrname ===name
	
	
