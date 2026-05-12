package trying;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class updateContact {

	public static void main(String[] args) {
		
//		String updatecontactBody="{\r\n"
//				+ "    \"id\": \"6598989073547264\",\r\n"
//				+ "    \"properties\": [\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"first_name\",\r\n"
//				+ "            \"value\": \"deepak\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"last_name\",\r\n"
//				+ "            \"value\": \"maurya\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"email\",\r\n"
//				+ "            \"subtype\": \"work\",\r\n"
//				+ "            \"value\": \"samsontt@walt.ltd\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"address\",\r\n"
//				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
//				+ "        }\r\n"
//				+ "    ]\r\n"
//				+ "}";
//		
//		
//		
//		Response resforUpdateContact=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").
//		contentType("application/json").accept("application/json").
//		body(updatecontactBody).put("https://bindvimal.agilecrm.com/dev/api/contacts/edit-properties");
//		System.out.println(resforUpdateContact.statusCode());
//		
//		String strBody=resforUpdateContact.body().asPrettyString();
//		System.out.println(strBody);
//		
		String tt="{\r\n"
				+ "    \"id\": \"6598989073547264\",\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \"jay\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \" dhruva\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \"jaydhruva@walt.ltd\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		Response resp=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").
		contentType("application/json").accept("application/json").body(tt).
		put("https://bindvimal.agilecrm.com/dev/api/contacts/edit-properties");
		int rr=resp.statusCode();
		
		System.out.println(rr);
		
		String strw=resp.body().asPrettyString();
		System.out.println(strw);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
