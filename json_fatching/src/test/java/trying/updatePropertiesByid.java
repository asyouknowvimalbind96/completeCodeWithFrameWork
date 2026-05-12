package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updatePropertiesByid {

	public static void main(String[] args) {
		
		String UpdatePropertiesofContact="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \"neeraj\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \"bind\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \"neeraj@walt.ltd\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"adampur\\\",\\\"city\\\":\\\"jaunpur\\\",\\\"state\\\":\\\"U.P\\\",\\\"zip\\\":\\\"222162\\\",\\\"country\\\":\\\"India\\\"}\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		
		Response resUpdateContact=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").
		body(UpdatePropertiesofContact).put("https://bindvimal.agilecrm.com/dev/api/contacts/edit-properties");
		System.out.println(resUpdateContact.statusCode());
		System.out.println(resUpdateContact.statusLine());
		System.out.println(resUpdateContact.getStatusCode());
		
	String strupdatecontact=resUpdateContact.body().asPrettyString();
		System.out.println(strupdatecontact);
	}

}
