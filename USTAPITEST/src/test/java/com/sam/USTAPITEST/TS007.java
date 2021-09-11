package com.sam.USTAPITEST;


import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class TS007 {

	public static void main(String[] args) 
	{
	
		
		RestAssured.baseURI="http://localhost:8080/";
		given().header("Content-Type","application/json").body("{\r\n"
				+ "     \"eNAME\":\"Russel Johnson\",\r\n"
				+ "     \"eSAL\":\"60000\"\r\n"
				+ "}").when().post("addEmployee").then().log().all().assertThat().statusCode(201);
		

	}
	
	

}
