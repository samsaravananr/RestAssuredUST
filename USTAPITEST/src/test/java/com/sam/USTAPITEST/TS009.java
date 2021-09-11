package com.sam.USTAPITEST;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;

public class TS009 {

	public static void main(String[] args) 
	{
	
		
		RestAssured.baseURI="http://localhost:8080/";
		given().header("Content-Type","application/json").body(addEmployeePayLoad()).when().post("addEmployee").then().log().all().assertThat().statusCode(201)
		.header("unique", containsString("Glen Johnson")).body("msg", equalTo("Success : Employee is Added"));
	}
	
	
	public static String addEmployeePayLoad()
	{
		return "{\r\n"
				+ "     \"eNAME\":\"Glen Johnson\",\r\n"
				+ "     \"eSAL\":\"60000\"\r\n"
				+ "}";
	}
	

}
