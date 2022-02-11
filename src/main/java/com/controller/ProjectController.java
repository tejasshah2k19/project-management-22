package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ProjectEntity;
import com.repository.ProjectRepository;

@RestController
public class ProjectController {

	@Autowired
	ProjectRepository projectRepository;

	@PostMapping("/projects")
	public ProjectEntity addProject(ProjectEntity project) {
		projectRepository.save(project);
		return project;
	}

	@GetMapping("/projects")
	public List<ProjectEntity> getAllProjects() {
		return projectRepository.findAll();
	}

	@DeleteMapping("/projects/{projectId}")
	public List<ProjectEntity> deleteProject(@PathVariable("projectId") Long projectId ){
		projectRepository.deleteById(projectId);
		return projectRepository.findAll(); 
	}   
	
	
	@PutMapping("/projects")
	public ProjectEntity updateProject(ProjectEntity project) {
		projectRepository.save(project);
		return project;
	}
	
}
