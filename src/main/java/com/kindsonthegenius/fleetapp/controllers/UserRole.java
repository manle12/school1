package com.kindsonthegenius.fleetapp.controllers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Controller;
//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class UserRole {
	@SuppressWarnings("null")
	@GetMapping("index")
	public String findAll(Model model){	
		
		
	
	 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
     String username = authentication.getName();
     System.out.println("Current authenticated user: " + username);
     
     Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
    // authorities.forEach(authority -> System.out.println(authority.getAuthority()));
     List<String> authorities1 = authentication.getAuthorities()
             .stream()
             .map(GrantedAuthority::getAuthority)  // Get the authority name (role/permission)
             .collect(Collectors.toList());
     
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
     model.addAttribute("authorities1", authorities);
    
     return "index";

}
	
}