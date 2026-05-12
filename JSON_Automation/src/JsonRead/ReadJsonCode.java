package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonCode {
///  getNumber, getString , getBoolean , getJSONObject , getJSONArray
	
	public static void main(String[] args) throws IOException {
		
		Path x=Paths.get("C:\\Users\\Vimal Bind\\Desktop\\test.json");
		byte[] byteArr=Files.readAllBytes(x);	
		String  strJson= new String(byteArr);
		//System.out.println(strJson);
		
		
		JSONObject rootJson=new JSONObject(strJson);
		rootJson.getNumber("id");
		rootJson.getString("type");
		
		JSONObject viewedObj=rootJson.getJSONObject("viewed");
		viewedObj.getNumber("viewed_time");
		
		JSONArray jsonTagsArray=  rootJson.getJSONArray("tags");
		for(int i=0;i<jsonTagsArray.length(); i++) {
			String value=jsonTagsArray.getString(i);
			System.out.println(value);
		}
		
		
		
		JSONArray jsonPropertiesArray=rootJson.getJSONArray("properties");
		
		for(int i=0; i<jsonPropertiesArray.length();i++) {
			JSONObject propObj=jsonPropertiesArray.getJSONObject(i);
			
			
			String data=propObj.getString("type");
			System.out.println(data);
		}
		
		
		
		
	}
	
	
}
