package com.williams.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.williams.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@ApiOperation(value = "This will return all employees", response = Iterable.class)
	@GetMapping(value = "/api")
	public String getEmployees() {

		employeeService.findAll();

		return "employees";
	}
}
