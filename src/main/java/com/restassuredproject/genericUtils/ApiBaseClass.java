package com.restassuredproject.genericUtils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ApiBaseClass {
	@BeforeSuite
	public void dataBaseConnection() {
		System.out.println("==== DB Connected Successfully...! ====");
	}
	
	@AfterSuite
	public void dataBaseConnectionClosed() {
		System.out.println("==== DB Connection Closed Successfully...! ====");
	}
	

}
