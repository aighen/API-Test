package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;




public class GetAPIBDDFramework {
	
	@Test
	public void test_Employeenumber(){
		
		
		given().
		when().
		   get("http://dummy.restapiexample.com/api/v1/employees").
		   
		then().
		   
		    assertThat().
		    statusCode(200).
		    and().
		    body("data.id",hasSize(24)).
		    and().
		    header("Content-Length",equalTo("595"));
		    
		  
		    
		    
		 
		
        
}

	
		
	}

