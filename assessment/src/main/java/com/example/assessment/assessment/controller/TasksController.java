package com.example.assessment.assessment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.assessment.dto.TaskDto;
import com.example.assessment.assessment.entity.Project;
import com.example.assessment.assessment.entity.Task;
import com.example.assessment.assessment.repository.ProjectRepository;
import com.example.assessment.assessment.repository.TasksRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:1234")
public class TasksController {
	@Autowired
	private TasksRepository tasksRepository;
	@Autowired
	private ProjectRepository projectRepository;
	
	@PostMapping("/postTask")
	public Task postTask(@RequestBody TaskDto dto) {
		Project project=projectRepository.findByProjectName(dto.getProjectName());
		if(project==null) {
			
		}
		System.out.println(project);
		Task task= new Task();
		task.setTaskName(dto.getTaskName());
		task.setTaskDescription(dto.getTaskDescription());
		task.setAssignTo(dto.getAssignTo());
		task.setStartDate(dto.getStartDate());
		task.setEndDate(dto.getEndDate());
		task.setProject(project);
		
		return tasksRepository.save(task);
	}
	
	@GetMapping("/getTask")
	public List<TaskDto> getAllTask(){
		List<Task> task=tasksRepository.findAll();
		List<TaskDto> dto=new ArrayList<>();
		for(Task tasks:task) {
			TaskDto taskDto=new TaskDto();
			taskDto.setId(tasks.getId());
			taskDto.setTaskName(tasks.getTaskName());
			taskDto.setTaskDescription(tasks.getTaskDescription());
			taskDto.setAssignTo(tasks.getAssignTo());
			taskDto.setStartDate(tasks.getStartDate());
			taskDto.setEndDate(tasks.getEndDate());
			taskDto.setProjectName(tasks.getProject().getProjectName());
			taskDto.setProjectDescription(tasks.getProject().getProjectDescription());
		dto.add(taskDto);
		}
		return dto;
	}
	@GetMapping("/getId/{id}")
	public List<Task> getById(@PathVariable("id") Long id){
	 return tasksRepository.findByProjectId(id);
	
			
		}
		
	}


