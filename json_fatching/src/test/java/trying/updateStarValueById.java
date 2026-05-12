package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updateStarValueById {

	public static void main(String[] args) {            //  6598989073547264
		String bodyforUpadateStarValue="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"star_value\": 5\r\n"
				+ "}";
		
	Response	 RestUpdateStar=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").body(bodyforUpadateStarValue).put("https://bindvimal.agilecrm.com/dev/api/contacts/edit/add-star");
	int CodeStatus=RestUpdateStar.statusCode();
	System.out.println(CodeStatus);
	String strStarValue=RestUpdateStar.body().asPrettyString();
	System.out.println(strStarValue);
	
	
	
	}

}
