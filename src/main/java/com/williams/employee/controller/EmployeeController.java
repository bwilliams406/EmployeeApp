package com.williams.employee.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.williams.employee.model.Employee;
import com.williams.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/api/showEmployees")
@Api(value = "employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@ApiOperation(value = "This will return all employees", response = Iterable.class)
	@GetMapping("/showEmployees")
	
    public ModelAndView findEmployees() {

		List<Employee> employees = (List<Employee>) EmployeeService.findAll();

        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("employees", employees);

        return new ModelAndView("showEmployees", params);
    }
}
