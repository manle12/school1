package com.kindsonthegenius.fleetapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.kindsonthegenius.fleetapp.models.User;
import com.kindsonthegenius.fleetapp.repositories.UserRepository;
import com.kindsonthegenius.fleetapp.services.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig {

   // private final UserDetailsService userDetailsService = null;
    @Autowired
    private  UserRepository userRepository;
    
    
    @Autowired
    
   // private MyUserDetailsService myUserDetailsService;
    
    @Bean
    public MyUserDetailsService myUserDetailsService() {
        return new MyUserDetailsService();
    }
    
    
   
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            // Fetch the user from the database using the username
            User user = userRepository.findByUsername(username);
               // .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
            
            // Convert the User object to Spring Security's UserDetails object
            return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                //.password(user.getPassword())  // Password should already be encoded
                .password("{noop}" + user.getPassword())
                .roles(user.getRole())  // Assuming the role is stored as a string
                .build();
            
       
               
                
        };
    }


   /* public ApplicationSecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }*/
    
    

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Customize security settings here
        http
            .csrf().disable() // Disable CSRF protection for simplicity, enable in production
            .authorizeHttpRequests((authz) -> authz
                .requestMatchers("/login", "/register", "/public/**","/login", 
        				"/resources/**", 
        				"/css/**", 
        				"/fonts/**", 
        				"/img/**").permitAll() // Allow these URLs without authentication
               // .requestMatchers("/admin/**").hasRole("ADMIN") // Restrict access based on roles
                .anyRequest().authenticated() // All other requests require authentication
            )
            .formLogin((form) -> form
                .loginPage("/login") // Custom login page URL
                .defaultSuccessUrl("/index", true) // Redirect after successful login
                .permitAll()
            )
          
           
            .logout((logout) -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout") // Redirect after successful logout
                .permitAll()
            )
            .httpBasic(); // Enable basic authentication (for API endpoints)

        return http.build();
    }
/*
   @Bean
    public PasswordEncoder passwordEncoder() {
		//return passwordEncoder();
	  
        return new BCryptPasswordEncoder(); // Password encoder for securely hashing passwords
    }
 
    
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
   
   */
    
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
    	
    	
    	
    	
        return http.getSharedObject(AuthenticationManagerBuilder.class)
            .userDetailsService(userDetailsService())
          // .passwordEncoder(passwordEncoder())
            .and()
            .build();
    }
    
    
}
