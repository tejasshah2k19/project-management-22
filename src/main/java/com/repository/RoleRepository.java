package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.RoleEntity;

@Repository
public interface RoleRepository extends  CrudRepository<RoleEntity, Long> {

	
	//
	
}
