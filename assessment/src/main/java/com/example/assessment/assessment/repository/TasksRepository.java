package com.example.assessment.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment.assessment.entity.Task;

public interface TasksRepository extends JpaRepository<Task, Long> {

	List<Task> findByProjectId(Long id);
}
