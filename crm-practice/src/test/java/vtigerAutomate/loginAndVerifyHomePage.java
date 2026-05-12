package vtigerAutomate;

import org.pages.LoginPage;
import org.testng.annotations.Test;
import org.utility.WebUtils;

public class loginAndVerifyHomePage {
	LoginPage login;


	@Test
	public void loginWithValidCredential() throws InterruptedException {
		WebUtils web=new WebUtils();
		web.get("chrome","http://localhost:8888/");
		login=new LoginPage(web);
		login.loginWithValidCredential("admin", "admin1");


	}
}
