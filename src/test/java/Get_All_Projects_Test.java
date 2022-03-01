import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Get_All_Projects_Test {
	@Test(priority = 1)
	public void get_All_Projects_Test() {
		//Read operation using get() HTTP method without BDD Feature.
		System.out.println("**** Read operation using get() HTTP method without BDD Feature ****");
		Response response =RestAssured.get("http://localhost:8084/projects");

		System.out.println("Response Status Code is="+response.getStatusCode());
		System.out.println("Response Status Line is="+response.getStatusLine());
		System.out.println("Content-Type is="+response.getHeader("content-type"));
		System.out.println("Response time is="+response.getTime());
		System.out.println("Response body is:");
		response.then().assertThat().log().body();
		//Validation using Assert Statements.
		int actualCode = response.getStatusCode();
		Assert.assertEquals(actualCode, 200, "Status code is same");
	}	
	
	@Test(priority = 2 )
	public void get_All_Projects_2Test() {
		//Read operation using get() HTTP method with BDD Feature.
		System.out.println("**** Read operation using get() HTTP method with BDD Feature ****");
		when()
			.get("http://localhost:8084/projects")
	    .then()
			.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}
	
	@Test(priority = 3)
	public void get_All_Projects_3Test() {
		//Verify the projectId using JsonPath.
		System.out.println("**** Verify the projectId using JsonPath ****");
		given().get("http://localhost:8084/projects").then().statusCode(200)
		.body("[0].projectId", equalTo("TY_PROJ_1832"));
	}
}
