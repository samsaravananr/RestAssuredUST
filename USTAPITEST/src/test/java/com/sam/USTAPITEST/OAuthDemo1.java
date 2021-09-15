package com.sam.USTAPITEST;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuthDemo1 {

	public static void main(String[] args) 
	{
	
		
		Response response=RestAssured.given().auth().oauth2("76b2f2a58dd3125006a48662630fb28a5673b26f")
		.post("http://coop.apps.symfonycasts.com/api/1944/chickens-feed");
		
		System.out.println("Response Code "+response.getStatusCode());
		System.out.println("Response Body "+response.getBody().asString());
		
	
		
		

	}

}
