package apiautomation;

import org.testng.annotations.Test;
import java.util.Properties;
import Configuration.GetConfigProperties;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Scenario1_Tests extends GetConfigProperties {
	
	Properties props = this.gettingproperties();

	@SuppressWarnings("unchecked")
	@Test
	void scenario_01() {
		given()
			.when()
				.get(props.getProperty("API_Employes"))
			.then()
				.assertThat()
					.statusCode(200)		
					.body("data.profile_image", hasItems(blankOrNullString()));
	}
}
