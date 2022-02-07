package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

		roleRepo.save(role);// insert
		return role;
	}

	@GetMapping("/roles")
	public List<RoleEntity> getAllRoles() {
		return roleRepo.findAll();
	}
	
	@GetMapping("/roles/{roleId}")
	public RoleEntity getRoleById(@PathVariable("roleId") Long roleId) {
		return roleRepo.findByRoleId(roleId);
	}
	
	
	@DeleteMapping("/roles/{roleId}")
	public String deleteRoleById(@PathVariable("roleId")  Long roleId) {
		roleRepo.deleteById(roleId);
		return "Role removed....";
	}
}
