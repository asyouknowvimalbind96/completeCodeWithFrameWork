package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class practicejsoncode2 {

	public static void main(String[] args) throws IOException  {
		byte[] bytearr_for_secondobj=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonformate.json"));
		String strObj=new String(bytearr_for_secondobj);
		
		JSONArray objJsonArr=new JSONArray(strObj);
		JSONObject objJsonRead=objJsonArr.getJSONObject(1); 
		Number SecondObjID=objJsonRead.getNumber("id");
		System.out.println(SecondObjID);
		
		JSONArray Arr2obj=objJsonRead.getJSONArray("tags");
		System.out.println(Arr2obj);
		
		boolean getduplicateExist=objJsonRead.getBoolean("is_duplicate_existed");
		System.out.println(getduplicateExist);
		
		JSONObject objforOwner=objJsonRead.getJSONObject("owner");
		String strowner=objforOwner.getString("domain");
		System.out.println(strowner);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
