package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;
import com.repository.RoleRepository;
import com.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;

	@Autowired
	RoleRepository roleRepo;
	@PostMapping("/users")
	public UserEntity saveUser(UserEntity user) {

		System.out.println(user.getRole().getRoleId());
	//	RoleEntity role = roleRepo.findByRoleId(user.getRole().getRoleId());
		
		
	//	userRepo.save(user);
		userRepo.save(user);//1
		return user;
	}
	
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		return userRepo.findAll();
	}
}
