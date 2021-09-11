package com.sam.USTAPITEST;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;

public class TS0010JIRA {

	
	public static String Username="imtestingconsultant@gmail.com";
	public static String Password="stRwzZPBUsdEpoFW2kKj2CF7";
	
	
	public static void main(String[] args) 
	{
	
		//STEP01: Create a JIRA Issue Tracking Project
		//STEP02: Create Access Token (stRwzZPBUsdEpoFW2kKj2CF7) 
		
		
		RestAssured.baseURI="https://samproject.atlassian.net/";
		given().auth().preemptive().basic(Username, Password).header("Content-Type","application/json").body(AddJIRAIssue())
		.when().post("rest/api/2/issue/").then().log().all();
		
		
		
	}
	
	//Add the Payload Details
	public static String AddJIRAIssue()
	{
		return "{\r\n"
				+ "    \"fields\": {\r\n"
				+ "       \"project\":\r\n"
				+ "       {\r\n"
				+ "          \"key\": \"SAR\"\r\n"
				+ "       },\r\n"
				+ "       \"summary\": \"REST ye merry gentlemen.\",\r\n"
				+ "       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\": \"Bug\"\r\n"
				+ "       }\r\n"
				+ "   }\r\n"
				+ "}";
	}

}
