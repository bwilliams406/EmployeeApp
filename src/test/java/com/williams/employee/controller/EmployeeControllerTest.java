package com.williams.employee.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.williams.employee.model.Employee;
import com.williams.employee.service.EmployeeService;






public class EmployeeControllerTest {

    @Mock
    EmployeeService employeeService;

    @Mock
    Model model;

    EmployeeController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new EmployeeController();
    }

    @Test
    public void getIndexPage() throws Exception {

        //given
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());

        Employee employee = new Employee();
        employee.setId(1L);

        employees.add(employee);

        when(employeeService.findAll()).thenReturn(employees);

        ArgumentCaptor<Set<Employee>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        //when
        List<Employee> viewName = controller.employeeService.findAll();


        //then
       assertEquals("employee", viewName);
        verify(employeeService, times(1)).findAll();
        verify(model, times(1)).addAttribute(eq("employees"), argumentCaptor.capture());
        Set<Employee> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }

}
