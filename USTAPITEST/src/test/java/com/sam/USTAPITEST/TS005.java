package com.sam.USTAPITEST;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class TS005 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Given -- all input details
		//When  -- Submit the API - End Point, Http Method, Resource
		//Then  -- Validate the response
		
	
		//Using Query Parameter
		
		System.out.println("----------------------------------------------");
		RestAssured.baseURI="http://localhost:8080/";
		given().queryParam("EmployeeName", "sam").when().get("getEmployee").then().log().body();
		
		
		
		//given().get("http://localhost:8080/getEmployee/SAM0").then().log().body();

	}

}

