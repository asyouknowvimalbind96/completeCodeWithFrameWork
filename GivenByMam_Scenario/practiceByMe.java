package GivenByMam_Scenario;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceByMe {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hsmap=new HashMap<String, Integer>();
		hsmap.put("neeraj Age", 18);
		hsmap.put("Pradeep Age", 21);
		hsmap.put("Anand Age", 20);
		hsmap.put("Ansh Age", 10);
		
		
		int ageofAnand=hsmap.get("Anand Age");
		System.out.println(ageofAnand);
		
		LinkedHashMap<Integer, String> linkmap=new LinkedHashMap<Integer, String>();
		linkmap.put(78,"ram");
		linkmap.put(10,"anand");
		linkmap.put(20,"army");
		String str=linkmap.get(10);
		System.out.println(str);
		
		LinkedHashMap<String, Integer> linkmap1=new LinkedHashMap<String, Integer>();
		linkmap1.put("ram",78);
		linkmap1.put("anand",10);
		linkmap1.put("army",20);
		int str1=linkmap1.get("army");
		System.out.println(str1);
		
		Map<String, Integer> trmap=new TreeMap<String, Integer>();
		trmap.put("vimal", 30);
		trmap.put("anuj", 28);
		trmap.put("neeraj", 30);
		trmap.put("arun", 28);
		
		int num=trmap.get("arun");
		System.out.println(num);
		
		ChromeDriver driver1=new ChromeDriver();
		ChromeDriver driver2=new ChromeDriver();
		ChromeDriver driver3=new ChromeDriver();
		ChromeDriver driver4=new ChromeDriver();
		ChromeDriver driver5=new ChromeDriver();

		Map<String,ChromeDriver> maap=new TreeMap<String,ChromeDriver>();
		maap.put("Chrome", driver1);
		maap.put("Vimal", driver2);
		maap.put("Neeraj", driver3);
		maap.put("Vinod", driver4);
		maap.put("Hariom", driver5);
		WebDriver dri=maap.get("Hariom");
		
		System.out.println(dri);
		System.out.println();

		
	}

}
