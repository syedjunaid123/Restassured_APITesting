package testCases;


import org.testng.annotations.Test;
import java.util.Properties;
import Configuration.GetConfigProperties;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import Utilities.ExcelUtil;

public class Scenario2_Tests extends GetConfigProperties{

	Properties props = this.gettingproperties();
	ExcelUtil axe = new ExcelUtil();
	
	@Test
	void scenario_02() {
		given()
			.when()
				.get(props.getProperty("API_Individual_Employee")+ axe.getCellValue())
		.then()
			.assertThat()
				.statusCode(200)
				.body(matchesJsonSchemaInClasspath("EmployeeSchema.json"), containsString("Successfully! Record has been fetched."));

	}

}
