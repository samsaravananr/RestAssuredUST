package com.sam.USTAPITEST;
import static io.restassured.RestAssured.*;

public class TS001 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Given -- all input details
		//When  -- Submit the API - End Point, Http Method
		//Then  -- Validate the response
		
		/*
		 * Set up the REST ASSURED Project
		 * 
		 * STEP01. CREATE A MAVEN PROJECT STEP02. UPDATE the POM.xml file with the following dependecies 
		 * RestAssured 
		 * JSON Path 
		 * XML Path 
		 * JSON Schema Validator
		 * 
		 * STEP03. Import the following package in the Test 
		 * import static io.restassured.RestAssured.*;
		 */

		
		
		given().when().get("http://localhost:8080/getEmployee/SAM0").then().log().body();
		
		//given().get("http://localhost:8080/getEmployee/SAM0").then().log().body();

	}

}

