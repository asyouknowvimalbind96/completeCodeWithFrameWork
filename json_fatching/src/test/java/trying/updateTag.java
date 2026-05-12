package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updateTag {

	public static void main(String[] args) {   //  6598989073547264
		String body="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"lead_score\": 102\r\n"
				+ "}";
		Response resRoot=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").body(body).put("https://bindvimal.agilecrm.com/dev/api/contacts/edit/lead-score");
		System.out.println(resRoot.statusCode());
		String strData=resRoot.body().asPrettyString();
		System.out.println(strData);
		
	}

}
