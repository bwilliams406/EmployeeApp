package com.williams.employee.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.williams.employee.dao.EmployeeDao;
import com.williams.employee.model.Employee;
import com.williams.employee.service.EmployeeServiceImpl;


public class serviceTest {

    EmployeeServiceImpl employeeService;

    @Mock
    EmployeeDao employeeDao;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        employeeService = new EmployeeServiceImpl(employeeDao);
    }

    @Test
    public void getEmployees() throws Exception {

        Employee employee = new Employee();
        List<Employee> employeesData = new ArrayList<>();
        employeesData.add(employee);

        when(employeeDao.findAll()).thenReturn(employeesData);

        List<Employee> employees = employeeService.findAll();

        assertEquals(employees.size(), 1);
        verify(employeeDao, times(1)).findAll();
    }

}
