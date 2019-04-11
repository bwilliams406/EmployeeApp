package com.williams.employee.dao;



import org.springframework.stereotype.Repository;

import com.williams.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface EmployeeDaoImpl extends CrudRepository<Employee, Long> {

}

