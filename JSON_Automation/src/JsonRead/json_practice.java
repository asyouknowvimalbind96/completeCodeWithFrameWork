package JsonRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance;

public class json_practice {

	public static void main(String[] args) throws IOException {
		byte[] arrbyte=Files.readAllBytes(Paths.get("C:\\Users\\Vimal Bind\\Desktop\\formate.json"));
		String strbyte=new String(arrbyte);
		//System.out.println(strbyte);
		
		JSONArray arrobj=new JSONArray(strbyte);
		JSONObject obj1=arrobj.getJSONObject(0);
		//String str1=arrobj.getString(0);
		String strobj1=obj1.getString("type");
		System.out.println(strobj1);
		
		
		
		

	}

}
