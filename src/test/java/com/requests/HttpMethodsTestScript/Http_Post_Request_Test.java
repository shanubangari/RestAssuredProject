package com.requests.HttpMethodsTestScript;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.restassuredproject.genericUtils.ApiBaseClass;
import com.restassuredproject.genericUtils.JavaUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Http_Post_Request_Test extends ApiBaseClass{
	/**
	 * @author Santhosha M
	 * A simple request, Create a resource inside the server using post() HTTP method.
	 */
	@Test
	public void http_Post_Request_Test() {
		//A Simple Post() request.

		//Create a JSONObject and provide the data in Key and value pair.
		JSONObject object=new JSONObject();
		object.put("createdBy", "Santosh M"+JavaUtils.getRandomNum());
		object.put("projectName", "RestAssured"+JavaUtils.getRandomNum());
		object.put("status", "Created");
		object.put("teamSize", 13);

		Response response = given()
				.contentType(ContentType.JSON).body(object)
				.when().post("http://localhost:8084/addProject");
		response.then()
		.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();



	}
}
