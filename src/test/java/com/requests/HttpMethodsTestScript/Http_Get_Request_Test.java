package com.requests.HttpMethodsTestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restassuredproject.genericUtils.ApiBaseClass;
import com.restassuredproject.genericUtils.EndPoints;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*; 

import static io.restassured.RestAssured.*;

public class Http_Get_Request_Test extends ApiBaseClass{

	/**
	 * @author Santhosha M
	 * A simple request, read the existing resources inside the server using get() HTTP method.
	 */
	@Test
	public void http_Get_Request_Test() {
		
		//A simple Get() request.
		//Response resp = when().get("http://localhost:8084/projects");
		Response resp = when().get(EndPoints.baseUrl+EndPoints.get);
		
		//resp.then().log().all().body("[1].projectId", equalTo("TY_PROJ_2404"));
		//Verify the body having projects name or not.
		//.body(".projectName", hasItems("ZOHO JIWAKU305", "JSJ986", "JSJ322", "Jagwar1", "ChapiriP192", "JSJ389","JSJ362", "JSJ610","JSJ461", 'JSJ938", "JSJ21", "zho crm", "JIWAKU944", "JIWAKU584","ZOHOCRM572","ZOHOCRM537","ZOHOCRM959", "JIWAKU227", "JIWAKU773", "JIWAKU708", "JIWAKU401", "JIWAKU690", "JIWAKU850", "JIWAKU857"));
		
		resp.then().log().all();
		Assert.assertEquals(resp.getStatusCode(), 200);

	}

}
