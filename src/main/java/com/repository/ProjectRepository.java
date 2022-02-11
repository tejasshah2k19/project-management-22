package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProjectEntity;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {

	List<ProjectEntity> findAll();
}
