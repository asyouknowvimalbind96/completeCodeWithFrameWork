package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import io.netty.handler.codec.json.JsonObjectDecoder;

public class readJsonFile {

	
	//     
	public static void main(String[] args) throws IOException {
	byte[] allData=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonFile.txt"));
		String str=new String(allData);
		
		JSONObject objJson=new JSONObject(str);
		Number forID=objJson.getNumber("id");
		System.out.println(forID);
		
		String forType=objJson.getString("type");
		System.out.println(forType);
		
		Number forStarValue=objJson.getNumber("star_value");
		System.out.println(forStarValue);
		
		Number leadScore=objJson.getNumber("lead_score");
		System.out.println(leadScore);
		
		//String tags=objJson.getString("tags");
		JSONArray arrTags=objJson.getJSONArray("tags");
		String firstTag=arrTags.getString(0);
		System.out.println(firstTag);
		
		String secondTag=arrTags.getString(1);
		System.out.println(secondTag);
		
		String thirdTag=arrTags.getString(2);
		System.out.println(thirdTag);
	
		
		JSONArray properties = objJson.getJSONArray("properties");
		JSONObject firstObjOfProperties = properties.getJSONObject(0);
		String firstName=firstObjOfProperties.getString("name");
		System.out.println("name : "+firstName);
		
		String name=firstObjOfProperties.getString("value");
		System.out.println("first_name :  "+name);
		
		
		JSONObject forthObjOfProperties = properties.getJSONObject(3);
		String address=forthObjOfProperties.getString("value");
		System.out.println(address);
		
		

		
		
		
		
		
		
		
		
		
	}

}
