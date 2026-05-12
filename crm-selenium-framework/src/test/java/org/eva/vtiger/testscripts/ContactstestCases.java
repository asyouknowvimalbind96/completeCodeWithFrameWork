package org.eva.vtiger.testscripts;

import java.io.IOException;

import org.eva.vtiger.pages.LoginPage;
import org.eva.vtiger.utils.WebUtil;

public class ContactstestCases {

	public static void main(String[] args) throws IOException {
		new ContactstestCases ().TC_Login_Success_And_Home_Validation();
//		byte[] arr=Files.readAllBytes(Paths.get("src/test/resources/payloads/CreateContact.json"));
//		String jsonString=	new String(arr);
//		JSONObject rootJson=new JSONObject(jsonString);
//		JSONArray propsArr= rootJson.getJSONArray("properties");
//		JSONObject nameObj=propsArr.getJSONObject(0);
//		String firstName=nameObj.getString("value");
//		nameObj.put
//		Response resp	=RestAssured.given().auth().basic("priti@evaailab.com",  "123456").body(jsonString).post("https://evaailab.agilecrm.com/dev/api/contacts");
//		int stcode=resp.getStatusCode();
//		String jsonstr=resp.getBody().asPrettyString();

		//TC_Login_Success_And_Home_Validation();

	}
	public  void TC_Login_Success_And_Home_Validation() {
		WebUtil webutil=new WebUtil();
		webutil.browserlaunch("ch");
		webutil.openURL("http://localhost:8888/");
		LoginPage loginpage=new LoginPage(webutil);
	   loginpage.validLogin("admin", "admin");
	
		
		
//		WebUtil.browserlaunch("ch");
//		WebUtil.openURL("http://localhost:8888/");
//		LoginPage loginpage=new LoginPage();
//	     PageFactory.initElements(WebUtil.driver,loginpage);
//	     loginpage.validLogin("admin", "admin");
		
		
	}


}
