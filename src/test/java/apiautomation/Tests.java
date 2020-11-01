package apiautomation;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Tests {

	@SuppressWarnings("unchecked")
	@Test
	void scenario_01() {
		given()
			.when()
				.get("http://dummy.restapiexample.com/api/v1/employees")
			.then()
				.statusCode(200)		
				.body("data.profile_image", hasItems(blankOrNullString()));
	}
}
