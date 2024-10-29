package com.kindsonthegenius.fleetapp.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//output username
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.services.CountryService;

//import ch.qos.logback.classic.Logger;
//output username
@Controller



public class CountryController {
	

	
@Autowired 
private CountryService countryService;
	
	//Get All Countrys
	@SuppressWarnings("null")
	@GetMapping("/countries")
	
	
	//get username and role for every body //get username and role for every body  //get username and role for every body  //get username and role for every body  //get username and role for every body  //get username and role for every body  //get username and role for every body  //get username and role for every body //get username and role for every body
	

	
	//public String findAll(org.springframework.ui.Model model) {
	public String findAll(Model model){	
		
		//ModelMap modelMap = null;
		//modelMap.addAttribute("countries", countryService.findAll());
		//ModelAndView mav = null;
		//mav.addObject("countries", countryService.findAll());
		List<Country> countryList = countryService.findAll();
	    // Log the data to check if it's dynamic
	    countryList.forEach(country -> System.out.println(country.getCapital()));
	     
	    //output username     //output username        //output username         //output username         //output username      //output username     //output username
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println("Current authenticated user: " + username);
        
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        //authorities.forEach(authority -> System.out.println(authority.getAuthority()));
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
        }

       // return "Credentials logged (check the console)";
    
		//end output username  //end output username   //end output username    //end output username  //end output username    //end output username  //end output username
		model.addAttribute("countries", countryService.findAll());
		 model.addAttribute("username", username);
		 model.addAttribute("authorities1", authorities);
		return "country";
	}
	
	
	
		
	
	/*@GetMapping("/states")
    public String showUserDetails(Model model, Integer userId) {
		Optional<Country> countr  = countryService.findById(userId);
        model.addAttribute("countr", countryService.findById(userId)); // Passing the user data to the view
        return "countr"; // This corresponds to userDetails.html
    }*/
	
	//@RequestMapping(value="/countries/{classnumber}/{examtype}")
	
	
	//@RequestMapping(value="/countries/{id}")
	 @GetMapping("/countries/{id}") // Maps GET requests to /locations/{id}
	   // public String getLocationById(@PathVariable Long id, Model model) {
		 public String getCountryById(@PathVariable Integer id,Model model){
	       // Location location = locationService.getLocationById(id); // Fetch location by ID
	        Optional<Country> myid = countryService.getCountryById(id);
	        
	        
	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        String username = authentication.getName();
	        System.out.println("Current authenticated user: " + username);
	        
	        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	        //authorities.forEach(authority -> System.out.println(authority.getAuthority()));
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
	        }
	       // model.addAttribute("location", location); // Add location to the model
	        model.addAttribute("countries", myid); // Add location to the model
	        model.addAttribute("username", username);
			model.addAttribute("authorities1", authorities);
	     // Name of the Thymeleaf template
	      //return stateService.getStateByName(name);
	       // return "country";
	        return "country";
	    }


	
	@RequestMapping(value="/countries/{classnumber}/{examtype}")
	//@RequestMapping(value="/countries/{capital}")
	 // @GetMapping("/states/{capital}/{stateCode}")
    public String getStateByClassnumberAndExamtype(
            @PathVariable Integer classnumber, 
            @PathVariable String examtype, 
            Model model) {
        
        // Add both path variables to the model
       // model.addAttribute("classnumber", classnumber);
       // model.addAttribute("examtype", examtype);
		 List<Country> classnumberandexamtype = countryService.getStateByClassnumberAndExamtype(classnumber,examtype);
		 
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        String username = authentication.getName();
	        System.out.println("Current authenticated user: " + username);
	        
	        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	        //authorities.forEach(authority -> System.out.println(authority.getAuthority()));
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
	        }
		// model.addAttribute("classnumberandexamtypes", classnumberandexamtype);
		 model.addAttribute("countries", classnumberandexamtype);
		 model.addAttribute("username", username);
		 model.addAttribute("authorities1", authorities);
		 
	        return "country";
	    }
	    
	
	
	    
		
		/*@GetMapping("/states")
	    public String showUserDetails(Model model, Integer userId) {
			Optional<Country> countr  = countryService.findById(userId);
	        model.addAttribute("countr", countryService.findById(userId)); // Passing the user data to the view
	        return "countr"; // This corresponds to userDetails.html
	    }*/
		
		
		
		@RequestMapping(value="countries/findById/{id}") 
		@ResponseBody
		public Optional<Country> findById(@PathVariable Integer id)
		{
			return countryService.findById(id);
		}
		
		//Add Country
			@PostMapping(value="countries/addNew")
			public String addNew(Country country) {
				countryService.save(country);
				return "redirect:/countries";
			}	
			
			@RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
			public String update(Country country) {
				countryService.save(country);
				return "redirect:/countries";
			}
			
			@RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
			public String delete(Integer id) {
				countryService.delete(id);
				return "redirect:/countries";
			}
		    
		
			
  
	} 

