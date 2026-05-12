package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTagById {

	public static void main(String[] args) {
		String bodyForDeleteTag="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"Lead\",\r\n"
				+ "        \"Likely Buyer\"\r\n"
				+ "    ]\r\n"
				+ "}";
		
		Response rootRest= RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").body(bodyForDeleteTag).put("https://bindvimal.agilecrm.com/dev/api/contacts/delete/tags");
		
		System.out.println(rootRest.statusCode());
		String strDeleteTag=rootRest.body().asPrettyString();
		System.out.println(strDeleteTag);
		
		
		
	}

}
