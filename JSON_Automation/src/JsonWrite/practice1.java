package JsonWrite;

import org.json.JSONArray;
import org.json.JSONObject;

public class practice1 {

	public static void main(String[] args) {
		
	JSONObject objJson=new JSONObject();
		objJson.put("name", "jay gupta");
		objJson.put("id", "576787897677");
		objJson.put("TYPE", "PERSON");
		
		JSONArray arrJson=new JSONArray();
		JSONObject jsonOfDetail = new JSONObject();
		jsonOfDetail.put("address", "bhadohi");
		jsonOfDetail.put("pin", 221406);
		jsonOfDetail.put("city", "Varanasi");
		arrJson.put(jsonOfDetail);
		objJson.put("detail", arrJson);
		
		
		JSONObject obj2=new JSONObject();
		obj2.put("salary", 100000);
		obj2.put("Job", "QA Engnineer");
		obj2.put("Timing", "8 Hr");
		arrJson.put(obj2);

		
		
		
		
		System.out.println(objJson);

	}

}
