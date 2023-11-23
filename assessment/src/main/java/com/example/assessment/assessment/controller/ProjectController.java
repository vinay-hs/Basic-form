package com.example.assessment.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.assessment.entity.Employee;
import com.example.assessment.assessment.entity.Project;
import com.example.assessment.assessment.repository.ProjectRepository;

@RestController
@RequestMapping("/apis")
@CrossOrigin(origins = "http://localhost:1234")
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping("/getAll")
	public List<Project> getProjects() {
		List<Project> project=projectRepository.findAll();	
		return project;
	}
	@PostMapping("/postProject")
	public Project postProject(@RequestBody Project project) {
		return projectRepository.save(project);


	}
	}
