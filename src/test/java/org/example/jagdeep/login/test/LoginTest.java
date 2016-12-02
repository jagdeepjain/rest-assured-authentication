/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.login.test;

import static org.assertj.core.api.Assertions.*;
import static com.jayway.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jayway.restassured.response.Response;

class LoginTest {
    
	private Response response;
	private String sessionCookie;
	
    @Test
    @DisplayName("Login Test.")
    void loginAndLogoutTest() {
    	response = 
				given()
					.param("email", "user3@dt.com")
					.param("password", "user3")
				.when()
					.post("http://localhost:8080/user/signIn");
		sessionCookie = response.getCookie("JSESSIONID");
		System.out.println("SESSION ID => " + sessionCookie);
		assertThat(response.getStatusCode()).isEqualTo(302);
		
		response = 
				given()
				.when()
					.post("http://localhost:8080/user/signOut");
		assertThat(response.getStatusCode()).isEqualTo(302);
    }
    
    	
}
