package JsonRead;

import org.json.JSONArray;
import org.json.JSONObject;

public class RepracticeWriteJsonCode {

	public static void main(String[] args) {
		JSONArray ArrJson=new JSONArray();
		JSONObject ObjJson=new JSONObject();
		
		ObjJson.put("First_name", "Dhruva");
		ObjJson.put("Last_name", "Gupta");
		ObjJson.put("Education", "Graduation");
		ObjJson.put("HighSchool_Passing_Year", 2018);
		ObjJson.put("Graduation_passing_Year", 2024);
		ArrJson.put(ObjJson);
		
		JSONObject personal=new JSONObject();
		
		personal.put("My_name", "Vimal Bind");
		personal.put("My Education", "Graduation");
		personal.put("Highschool",2018 );
		personal.put("Intermediat", 2020);
		personal.put("Graduation", 2024);
		ObjJson.put("My Profile", personal);

		System.out.println(ArrJson);
		
		

	}

}
