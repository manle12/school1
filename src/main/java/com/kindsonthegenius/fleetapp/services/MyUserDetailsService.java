package com.kindsonthegenius.fleetapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.User;
import com.kindsonthegenius.fleetapp.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	
	@Autowired private UserRepository  userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found!");
		}
 
		//return new UserPrincipal(user);
		
		 return org.springframework.security.core.userdetails.User
	                .withUsername(user.getUsername())
	                //.password(user.getPassword())  // Password should already be encoded
	                .password("{noop}" + user.getPassword())
	                .roles(user.getRole())  // Assuming the role is stored as a string
	                .build();

	}
	
	

	
	
		
		
	}


