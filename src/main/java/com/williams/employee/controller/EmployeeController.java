package com.williams.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williams.employee.model.Employee;
import com.williams.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")

public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;
 
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
