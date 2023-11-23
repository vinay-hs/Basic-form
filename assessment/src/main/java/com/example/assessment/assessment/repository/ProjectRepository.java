package com.example.assessment.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.assessment.assessment.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

	@Query("select p from Project p where p.projectName=?1")
	Project findByProjectName(String projectName);

}
