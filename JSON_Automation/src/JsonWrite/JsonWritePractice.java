package JsonWrite;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonWritePractice {


	public static void main(String[] args) {

//		let x : JsonWritePractice = new JsonWritePractice();
//		
//		JsonWritePractice x=new JsonWritePractice();
//		
//		
//		let x  = new JsonWritePractice();
		
		JSONObject rootJson=new JSONObject();
		rootJson.put("id", 687877887);
		rootJson.put("firstName", "Vimal");
		rootJson.put("LastName", "Bind");
		
		JSONObject objForSani=new JSONObject();
		rootJson.put("saniDetail", objForSani);
		objForSani.put("FirstName", "Shani");
		objForSani.put("LastName", "Bind");
		objForSani.put("address", "jaunpur");
		
		
		JSONObject objForMukesh=new JSONObject();
		rootJson.put("Details Of Mukesh", objForMukesh);
		objForMukesh.put("firstName", "Mukesh");
		objForMukesh.put("LastName", "Yadav");
		objForMukesh.put("address", "baraut allahabad");
		objForMukesh.put("profession", "Manager");
		
		JSONArray jsonArr=new JSONArray();
		JSONObject  json1=new JSONObject(jsonArr);
		jsonArr.put(json1);
		rootJson.put("detailOfAshish",jsonArr );
		json1.put("name", "ashish");
		json1.put("Gender", "Male");
		json1.put("address", "chhoti mai");
		json1.put("instituteName", "Eva");
		
		
		
		System.out.println(rootJson);
		
		
		
		
		
		
		
		


//		JSONArray arrjson = new JSONArray(rootJson);
//		JSONObject objJson = new JSONObject();
//		objJson.put("first_name", "sani");
//		objJson.put("last_name", "bind");
//		objJson.put( "saniDetail",arrjson);
//		System.out.println(rootJson);


	}

}
