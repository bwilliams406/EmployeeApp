package com.williams.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.williams.employee.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Brody");
		emp1.setLastName("Williams");
		employees.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("Rilee");
		emp2.setLastName("Fisher");
		employees.add(emp2);

		return employees;
	}
}
