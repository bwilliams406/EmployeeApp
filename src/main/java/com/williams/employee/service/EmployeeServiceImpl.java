package com.williams.employee.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.employee.dao.EmployeeDaoImpl;
import com.williams.employee.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl repository;


    public List<Employee> findAll() {

    	List<Employee> employee = (List<Employee>) repository.findAll();
		return employee;
    }

}
