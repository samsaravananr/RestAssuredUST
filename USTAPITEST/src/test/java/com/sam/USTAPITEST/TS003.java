package com.sam.USTAPITEST;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class TS003 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Given -- all input details
		//When  -- Submit the API - End Point, Http Method
		//Then  -- Validate the response
		
	
		//Using Query Parameter
		
		System.out.println("----------------------------------------------");
		RestAssured.baseURI="http://localhost:8080/";
		given().when().get("getEmployee?EmployeeName=SAM").then().log().body();
		System.out.println("----------------------------------------------");
		
		//given().get("http://localhost:8080/getEmployee/SAM0").then().log().body();

	}

}

