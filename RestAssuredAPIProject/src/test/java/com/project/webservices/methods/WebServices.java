package com.project.webservices.methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class WebServices {
	
	public static Response Post(String uRI,String stringJSON){
		
		RequestSpecification requestSpecification= RestAssured.given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response=requestSpecification.post(uRI);
		return response;
	}

}
