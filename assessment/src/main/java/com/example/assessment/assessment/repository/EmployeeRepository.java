package com.example.assessment.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment.assessment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
