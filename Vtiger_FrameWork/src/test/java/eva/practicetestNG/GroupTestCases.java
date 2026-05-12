package eva.practicetestNG;

import org.testng.annotations.Test;

public class GroupTestCases {
	
	@Test(groups= {"smoke"})
	public void launch() {
		System.out.println("Launch the browser");
	}
	
	@Test(groups= {"smoke"})
	public void openUrl() {
		System.out.println("open the url");
	}
	@Test(groups= {"regrassion"})
	public void signOut() {
		System.out.println("Sign out the application");
	}

}
