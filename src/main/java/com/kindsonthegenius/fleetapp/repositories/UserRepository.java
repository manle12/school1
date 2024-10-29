package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;


import com.kindsonthegenius.fleetapp.models.User;
@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
