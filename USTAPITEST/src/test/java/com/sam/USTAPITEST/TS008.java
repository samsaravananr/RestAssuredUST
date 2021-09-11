package com.sam.USTAPITEST;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;

public class TS008 {

	public static void main(String[] args) 
	{
	
		
		RestAssured.baseURI="http://localhost:8080/";
		given().header("Content-Type","application/json").body("{\r\n"
				+ "     \"eNAME\":\"Russel Johnson\",\r\n"
				+ "     \"eSAL\":\"60000\"\r\n"
				+ "}").when().post("addEmployee").then().log().all().assertThat().statusCode(201)
		//.header("unique", "Russel Johnson7");
		//Adding the below LINE
		
		.header("unique", containsString("Russel Johnson")).body("msg", equalTo("Success : Employee is Already Exist"));
		
		
		
		
		//Assert Headers

	}
	
	

}
