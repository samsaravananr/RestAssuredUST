package com.sam.USTAPITEST;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuthDemo2 {
	
	
	public static String vAccess;

	public static void main(String[] args) 
	{
	
		
		Response response1=RestAssured.given()
		.formParam("client id", "raghu")
		.formParam("client_secret", "e7404d90cd28bab64a64332941333d37")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
		//System.out.println(response1.asString());
		
		String vAccess=response1.jsonPath().get("access_token");
		
		
		
		
		Response response2=RestAssured.given().auth().oauth2(vAccess)
		.post("http://coop.apps.symfonycasts.com/api/1944/chickens-feed");
		
		System.out.println("Response Code "+response2.getStatusCode());
		System.out.println("Response Body "+response2.getBody().asString());
		
	
		
		

	}

}
