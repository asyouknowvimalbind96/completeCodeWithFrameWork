package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Jsonpra {

	public static void main(String[] args) throws IOException {
		byte[] bytearrfile=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonformate.json"));
		String strobj=new String(bytearrfile);
		
		JSONArray objJsonarr=new JSONArray(strobj);
		JSONObject objjsonformate= objJsonarr.getJSONObject(0);
		
		String strwithobj=objjsonformate.getString("type");
		System.out.println(strwithobj);
		
		JSONObject jsonobjview= objjsonformate.getJSONObject("viewed");
		Number numviewtime=jsonobjview.getNumber("viewed_time");
		System.out.println(numviewtime);
		
		
		
		
	}

}
