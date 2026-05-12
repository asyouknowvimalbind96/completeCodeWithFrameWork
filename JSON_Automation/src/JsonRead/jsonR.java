package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonR {

	public static void main(String[] args) throws IOException {
		
	byte[] filebyte=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\jsonformate.json"));
	String rootStr=new String(filebyte);
	
	
	JSONArray jsonArr=new JSONArray(rootStr);
	JSONObject jsonOBJ=jsonArr.getJSONObject(0);
	String str2= jsonOBJ.getString("type");
	System.out.println(str2);
	
	
	Number createtime=jsonOBJ.getNumber("created_time");
	System.out.println(createtime);
	
	
	
	
	}
	

}
