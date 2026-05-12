package trying;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getContactById {

	public static void main(String[] args) {
		Response resofContact=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").accept("application/json").get("https://bindvimal.agilecrm.com/dev/api/contacts/6598989073547264");
		System.out.println(resofContact.statusCode());
		String GetContact=resofContact.getBody().asPrettyString();
		System.out.println(GetContact);
		
	}

}
