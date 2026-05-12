package JsonRead;

import org.json.JSONArray;
import org.json.JSONObject;

public class writeJsonFormate {

	public static void main(String[] args) {

		JSONArray arrjson= new JSONArray();
		JSONObject jsonOBJ=new JSONObject();
		jsonOBJ.put("First_name", "Vimal");
		jsonOBJ.put("Last_name", "Bind");
		jsonOBJ.put("Address", "Adampur");
		jsonOBJ.put("Post", "Nigoh");
		jsonOBJ.put("Thana", "Barsathi");
		//arrjson.put(jsonOBJ);
		
		JSONArray at=new JSONArray();
		at.put(jsonOBJ);
		
		
		JSONObject jsonOBJEducation=new JSONObject();
		jsonOBJ.put("Educational", jsonOBJEducation);
		jsonOBJEducation.put("highschool_mark", 350);
		jsonOBJEducation.put("intermediat_mark",330 );
		jsonOBJEducation.put("Graduation_mark", 994);
		jsonOBJEducation.put("ITI",1000);

		JSONObject  secondobj=new JSONObject();
		jsonOBJ.put("friends_name", secondobj);
		secondobj.put("name1", "jay");
		secondobj.put("name2", "Ritesh");
		secondobj.put("name3", "Ashish");
		secondobj.put("name4", "dhruv");
		
		
		JSONObject  secondobj2=new JSONObject();
		secondobj.put("insideFriend", secondobj2);
		secondobj2.put("stu1", "mukesh");
		secondobj2.put("stu2", "hariom");
		secondobj2.put("stu3", "neeraj");
		arrjson.put(jsonOBJ);
		

		
		System.out.println(arrjson);
	}

}
