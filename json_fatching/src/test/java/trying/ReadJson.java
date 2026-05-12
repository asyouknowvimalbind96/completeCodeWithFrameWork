package trying;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReadJson {

	public static void main(String[] args) {
		Response data = RestAssured.given().auth().basic("vimal12@ram.com", "pass@123").accept(ContentType.JSON).get("https://bindvimal.agilecrm.com/dev/api/contacts");
		System.out.println(data);
	}

}
