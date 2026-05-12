package JsonRead;

import org.json.JSONArray;
import org.json.JSONObject;

public class truer {

	public static void main(String[] args) {
		JSONObject rootjson = new JSONObject();
		JSONObject obj1 = new JSONObject();
		rootjson.put("employees", obj1);
		
		JSONArray arr=new JSONArray();
		JSONObject obj2 = new JSONObject();
		
		obj1.put("employee", arr);
		obj2.put("id", 1);
		obj2.put("firstName", "jay");
		obj2.put("lastName", "gupta");
		obj2.put("address", "mondh");
		arr.put(obj2);
		
		JSONObject obj3=new JSONObject();
		obj3.put("id", 2);
		obj3.put("firstName", "dhruva");
		obj3.put("lastName", "gupta");
		obj3.put("address", "gyanpur");
		arr.put(obj3);
		
		JSONObject obj4=new JSONObject();
		obj4.put("id", 3);
		obj4.put("firstName", "ashish");
		obj4.put("lastName", "yadav");
		obj4.put("address", "bhadohi");
		arr.put(obj4);
		
		
		
		System.out.println(rootjson);
		
		
	}

}
