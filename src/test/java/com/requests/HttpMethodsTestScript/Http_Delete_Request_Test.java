package com.requests.HttpMethodsTestScript;

import org.testng.annotations.Test;

import com.restassuredproject.genericUtils.ApiBaseClass;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Http_Delete_Request_Test extends ApiBaseClass{
	/**
	 * @author Santhosha M
	 * A simple request, delete the existing resource inside the server using delete() HTTP method.
	 */
	@Test
	public void http_Delete_Request_Test() {
		Response response = when().delete("http://localhost:8084/projects/TY_PROJ_3603");
		response.then().statusCode(204).contentType(ContentType.JSON).log().all();
	}

}
