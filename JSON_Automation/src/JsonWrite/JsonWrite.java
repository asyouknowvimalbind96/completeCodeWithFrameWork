package JsonWrite;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject jsRoot=new JSONObject();
		jsRoot.put("firstName", "Vimal");
		jsRoot.put("lastName", "Bind");
		
		JSONObject personalObject=new JSONObject();
		personalObject.put("mother", "Urmila");
		personalObject.put("father", "Ratan");
		personalObject.put("dob", "2003");
		
		jsRoot.put("personal", personalObject);
		JSONArray hobbiesArr=new JSONArray();
		hobbiesArr.put("travelling");
		hobbiesArr.put("cricket");
		jsRoot.put("hobbies" , hobbiesArr);
		System.out.println(jsRoot);
		
		
		
		
		
		
		
		
	}

}
