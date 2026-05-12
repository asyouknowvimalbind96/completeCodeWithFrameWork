package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updateTagValue {

	public static void main(String[] args) {
		
		String bodyForUpdateTagValue="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"bro\",\r\n"
				+ "        \"Mom\"\r\n"
				+ "    ]\r\n"
				+ "}";
		
		Response ResRoot=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").body(bodyForUpdateTagValue).put("https://bindvimal.agilecrm.com/dev/api/contacts/edit/tags");
		System.out.println(ResRoot.statusCode());
		System.out.println("                                                                               ");
		String strtagUpdate=ResRoot.body().asPrettyString();
		System.out.println(strtagUpdate);
		
		
	}

}
