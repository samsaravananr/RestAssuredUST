package com.sam.USTAPITEST;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;

public class TS0011JIRACOMMENT 
{
	
	 public static String username = "imtestingconsultant@gmail.com";
	 public static String password = "stRwzZPBUsdEpoFW2kKj2CF7";

	 public static void main(String[] args) {
	   
	  // access token - 3dNTxBiRTsLQK1zRmtNQ0F26
	  //https://developer.atlassian.com/server/jira/platform/jira-rest-api-examples/
	  
	  RestAssured.baseURI="https://samproject.atlassian.net/";
	  given().auth().preemptive().basic(username, password).header("Content-Type","application/json").body(addComment()).
	  when().post("rest/api/2/issue/SAR-1/comment").then().log().all().assertThat().statusCode(201);
	  
	 }
	 
	 public static String addComment()
	 {
	  return "{\r\n"
	    + "    \"body\": \"This is a comment regarding the quality of the response.\"\r\n"
	    + "}";
	 }

	

}
