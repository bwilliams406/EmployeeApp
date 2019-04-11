package com.williams.employee.controller;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.williams.employee.service.EmployeeService;

public class EmployeeControllerTest {
	
	
    @Mock
	EmployeeService employeeService;
    
    @InjectMocks
    EmployeeController controller;
    
    
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
