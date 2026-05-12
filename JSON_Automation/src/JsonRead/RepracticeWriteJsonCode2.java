package JsonRead;

import org.json.JSONArray;
import org.json.JSONObject;

public class RepracticeWriteJsonCode2 {

	public static void main(String[] args) {
		JSONArray  HeadArrayJson=new JSONArray();
		JSONObject rootObjJson=new JSONObject();
		HeadArrayJson.put(rootObjJson);
		rootObjJson.put("FirstName", "Hariom");
		rootObjJson.put("Last_Name", "Bind");
		rootObjJson.put("age", 24);
		
		JSONArray secondArr= new JSONArray();
		JSONObject name1=new JSONObject();
		secondArr.put(name1);
		rootObjJson.put("per", name1);
		name1.put("First_Name_1", "Vimal");
		name1.put("Last_Name_1", "Bind");
		name1.put("Age_1", 22);

		
		
		System.out.println(HeadArrayJson);
 		System.out.println();
		System.out.println();
		
		
		
		
		
		
	}

}
