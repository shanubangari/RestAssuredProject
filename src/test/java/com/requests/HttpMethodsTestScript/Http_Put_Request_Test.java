package com.requests.HttpMethodsTestScript;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.restassuredproject.genericUtils.ApiBaseClass;
import com.restassuredproject.genericUtils.JavaUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Http_Put_Request_Test extends ApiBaseClass{
	/**
	 * @author Santhosha M
	 * A simple request, complete update the existing resource inside the server using put() HTTP method.
	 */
	@Test
	public void http_Post_Request_Test() {
		//A Simple Put() request along with Form Data for Complete update.

		//Create a JSONObject and provide the data in Key and value pair.
		JSONObject object=new JSONObject();
		object.put("createdBy", "Santosh M340");
		object.put("projectName", "RestAssured652");
		object.put("status", "OnGoing");
		object.put("teamSize", 13);

		Response response = given()
				.contentType(ContentType.JSON).body(object)
				.when().put("http://localhost:8084/projects/TY_PROJ_6205");
		response.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}
}
