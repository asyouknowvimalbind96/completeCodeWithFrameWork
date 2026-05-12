package JsonRead;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonPractice4 {

	public static void main(String[] args) throws IOException {
//		byte[] bytearr=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonformate.json"));
//		String rootStr=new String(bytearr);

		JSONArray jsonArr=new JSONArray();
		JSONObject rootObj=new JSONObject();
		jsonArr.put(rootObj);
		rootObj.put("First_Name", "Jay");
		rootObj.put("Last_Name", "Gupta");
		rootObj.put("age", 22);
		rootObj.put("Institute_name", "Expert View Automation mondh");
		
		JSONObject	objforDhruv=new JSONObject();
		rootObj.put("Dhruva Details", objforDhruv);
		objforDhruv.put("First_Name", "Dhruva");
		objforDhruv.put("Last_Name", "Gupta");
		objforDhruv.put("Age", 23);
		objforDhruv.put("Institute_name", "Expert view automation ");

		JSONArray jsonArrli=new JSONArray();
		JSONObject	objforSome=new JSONObject();
		rootObj.put("some Data",jsonArrli );
		jsonArrli.put(objforSome);
		objforSome.put("First_name", "Ritesh");
		objforSome.put("Laast_name", "yadav");
		objforSome.put("Age", 23);
		objforSome.put("Institute_name", "Expert view automation ");
		
		JSONObject	objforSandeep=new JSONObject();
		objforSome.put("Sandeep", objforSandeep);
		objforSandeep.put("First_name", "Sandeep");
		objforSandeep.put("Last_name", "yadav");
		objforSandeep.put("occupation", "Student");
		objforSandeep.put("Age", 24);
		objforSandeep.put("Institute_name", "Expert View automation mondh");
		objforSandeep.put("live it", "bhadohi");
		

		
		System.out.println(jsonArr);
	}

}
