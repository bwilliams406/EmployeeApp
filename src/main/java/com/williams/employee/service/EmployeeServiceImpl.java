package com.williams.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.employee.dao.EmployeeDao;
import com.williams.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao repository;

	public EmployeeServiceImpl(EmployeeDao repository) {
		this.repository = repository;
	}

	@Override
	public List<Employee> findAll() {

		return (List<Employee>) repository.findAll();
	}

}
