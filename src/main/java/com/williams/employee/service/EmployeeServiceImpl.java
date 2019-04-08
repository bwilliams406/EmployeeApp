package com.williams.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.employee.dao.EmployeeDao;
import com.williams.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}
}
