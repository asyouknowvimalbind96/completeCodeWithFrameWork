package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;



public class ReadJSON_Formate {

	public static void main(String[] args) throws IOException  {
		byte[] byteJson=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonformate.json"));
		String strJson=new String(byteJson);
		//System.out.println(strJson);
		
		
		JSONArray arrJsonObj=new JSONArray(strJson);
		JSONObject objJson=arrJsonObj.getJSONObject(0);
		Number num=objJson.getNumber("id");
		System.out.println(num);
		
		JSONObject objjson=objJson.getJSONObject("viewed");
		Number num3=objjson.getNumber("viewed_time");
		System.out.println(num3);
		
		JSONArray jsontagwithtimearray=objJson.getJSONArray("tagsWithTime");

		JSONObject objtagwithtime=jsontagwithtimearray.getJSONObject(0);
		String strtagwithtime=objtagwithtime.getString("tag");
		System.out.println(strtagwithtime);
		
		Number objtagwithtimenumber=objtagwithtime.getNumber("createdTime");
		System.out.println("for time   >  "+objtagwithtimenumber);
		
		
		JSONArray jsonArrProperties=objJson.getJSONArray("properties");
		JSONObject objpropertiesjson=jsonArrProperties.getJSONObject(5);
		String strProperties=objpropertiesjson.getString("value");
		System.out.println(strProperties);
		
		
	}

}
