package JsonRead;

import org.json.JSONArray;
import org.json.JSONObject;

public class scenariobyJay {
public static void main(String[] args) {
	JSONObject rootJson=new JSONObject();
	JSONObject All_employee=new JSONObject();
	rootJson.put("employees", All_employee);
	JSONArray arrj=new JSONArray();
	All_employee.put("employee", arrj);
	
	JSONObject employee=new JSONObject();
	employee.put("id", 1);
	employee.put("firstName", "dhruva ");
	employee.put("lastName", "gupta");
	employee.put("photo", "https:\\Users\\Dhruva.png");
	arrj.put(employee);
	
	JSONObject second = new JSONObject();
	
	second.put("firstName", "Jay");
	second.put("lastName", "gupta");
	second.put("photo", "https:\\Users\\jay.png");
	second.put("id", 2);
	arrj.put(second);
	
	JSONObject third = new JSONObject();
	third.put("id", 3);
	third.put("firstName", "ashish");
	third.put("lastName", "yadav");
	third.put("photo", "https:\\Users\\ashish.png");
	arrj.put(third);
	System.out.println(rootJson);
}
}
