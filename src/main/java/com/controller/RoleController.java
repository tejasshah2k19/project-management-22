package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.RoleEntity;
import com.repository.RoleRepository;

@RestController
public class RoleController {

	@Autowired
	RoleRepository roleRepo; 
	
	@PostMapping("/roles")
	public RoleEntity addRole(RoleEntity role) {
		
	
		roleRepo.save(role);
		return role;
	}
}
