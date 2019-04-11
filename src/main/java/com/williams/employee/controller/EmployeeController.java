package com.williams.employee.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.williams.employee.model.Employee;
import com.williams.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@ApiOperation(value = "This will return all employees", response = Iterable.class)
	@GetMapping("/employees")
	
    public List<Employee> findEmployee() {

		List<Employee> employees =  employeeService.findAll();

        HashMap<String, Object> params = new HashMap<>();
        params.put("employees", employees);

        return employees;
    }
}
