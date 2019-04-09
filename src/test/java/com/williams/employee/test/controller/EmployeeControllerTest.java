package com.williams.employee.test.controller;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.restassured.RestAssured;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

	@LocalServerPort
	private int port;

	final static String HOST = "http://localhost:8080";
	final static String API = "/api";
	final static String GET_ALL_EMPLOYEES_PATH = HOST + API + "/employee/getAllEmployees";

	@Test
	public void testGetAllEmployees() {
		given().port(port).when().get(GET_ALL_EMPLOYEES_PATH).then().statusCode(200);
	}

}
