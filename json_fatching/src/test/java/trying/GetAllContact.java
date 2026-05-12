package trying;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllContact {

	public static void main(String[] args) {
		Response GetAllContact = RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").accept("application/json").get("https://bindvimal.agilecrm.com/dev/api/contacts");
		System.out.println(GetAllContact.statusCode());
		String strAllContact=GetAllContact.getBody().asPrettyString();
		//System.out.println(strAllContact);
		
		JSONArray ArrJson=new JSONArray(strAllContact);
		JSONObject rootJson= ArrJson.getJSONObject(0);
		Number Idnum=rootJson.getNumber("id");
		System.out.println(Idnum);
		
		
		
		
		
		
	}

}
