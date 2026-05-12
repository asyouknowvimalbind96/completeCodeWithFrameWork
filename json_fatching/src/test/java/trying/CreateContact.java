package trying;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateContact {

	public static void main(String[] args) {
		//		 Response firstcontact = RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").accept("application/json").get("https://bindvimal.agilecrm.com/dev/api/contacts/4785253476139008");
		//		System.out.println(firstcontact.statusCode());
		//		 String strOneContact=firstcontact.getBody().asPrettyString();
		//		 System.out.println(strOneContact);

		//		String body="{\r\n"
		//				+ "    \"star_value\": \"4\",\r\n"
		//				+ "    \"lead_score\": \"92\",\r\n"
		//				+ "    \"tags\": [\r\n"
		//				+ "        \"brothers\",\r\n"
		//				+ "        \"doughter \"\r\n"
		//				+ "    ],\r\n"
		//				+ "    \"properties\": [\r\n"
		//				+ "        {\r\n"
		//				+ "            \"type\": \"SYSTEM\",\r\n"
		//				+ "            \"name\": \"first_name\",\r\n"
		//				+ "            \"value\": \"ananya\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"type\": \"SYSTEM\",\r\n"
		//				+ "            \"name\": \"last_name\",\r\n"
		//				+ "            \"value\": \"bind\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"type\": \"SYSTEM\",\r\n"
		//				+ "            \"name\": \"email\",\r\n"
		//				+ "            \"subtype\": \"work\",\r\n"
		//				+ "            \"value\": \"ananaya@walt.ltd\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"type\": \"SYSTEM\",\r\n"
		//				+ "            \"name\": \"address\",\r\n"
		//				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"phone\",\r\n"
		//				+ "            \"value\": \"8888888889\",\r\n"
		//				+ "            \"subtype\": \"work\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"phone\",\r\n"
		//				+ "            \"value\": \"8888888889\",\r\n"
		//				+ "            \"subtype\": \"home\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"website\",\r\n"
		//				+ "            \"value\": \"www.youtube.com\",\r\n"
		//				+ "            \"subtype\": \"YOUTUBE\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"website\",\r\n"
		//				+ "            \"value\": \"www.linkedin.com\",\r\n"
		//				+ "            \"subtype\": \"LINKEDIN\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"website\",\r\n"
		//				+ "            \"value\": \"www.mywebsite.com\",\r\n"
		//				+ "            \"subtype\": \"URL\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"My custom field of type text\",\r\n"
		//				+ "            \"type\": \"CUSTOM\",\r\n"
		//				+ "            \"value\": \"My name is ghanshyam\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"My custom field of type date\",\r\n"
		//				+ "            \"type\": \"CUSTOM\",\r\n"
		//				+ "            \"value\": 1479580200\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"My custom field of type checkbox\",\r\n"
		//				+ "            \"type\": \"CUSTOM\",\r\n"
		//				+ "            \"value\": \"on\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"My custom field of type list\",\r\n"
		//				+ "            \"type\": \"CUSTOM\",\r\n"
		//				+ "            \"value\": \"lemon\"\r\n"
		//				+ "        },\r\n"
		//				+ "        {\r\n"
		//				+ "            \"name\": \"My custom field of type companies\",\r\n"
		//				+ "            \"type\": \"CUSTOM\",\r\n"
		//				+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
		//				+ "        }\r\n"
		//				+ "    ]\r\n"
		//				+ "}"; 
		//		
		//		Response creatcontact=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").contentType("application/json").accept("application/json").body(body).post("https://bindvimal.agilecrm.com/dev/api/contacts");
		//		 System.out.println(creatcontact.statusCode());
		//		ResponseBody contactCreat = creatcontact.body();
		//		String stre=contactCreat.asPrettyString();
		//		System.err.println(stre);

		String SecondBody="{\r\n"
				+ "    \"id\": \"5676477903273984\",\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \"ram\"\r\n"
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
				+ "            \"value\": \"updateContact@walt.ltd\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";


		Response secondContactCreat=RestAssured.given().auth().basic("vimal@12ram.com", "pass@123").
				contentType("application/json").accept("application/json").
				body(SecondBody).post("https://bindvimal.agilecrm.com/dev/api/contacts/6598989073547264");
		System.out.println(secondContactCreat.statusCode());

//		ResponseBody CreatContactBodysecond=secondContactCreat.body();
//		String strCreatContact=CreatContactBodysecond.asPrettyString();
//		System.out.println(strCreatContact);


	}

}
