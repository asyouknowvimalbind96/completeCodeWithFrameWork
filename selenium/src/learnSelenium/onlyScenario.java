package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlyScenario {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		int expected_X_cordinate=560;
		int expected_Y_cordinate=204;

		Point UserInputBoxLocation=weUserName.getLocation();
		int actualX_Cordinate=UserInputBoxLocation.getX();
		int actualY_Cordinate=UserInputBoxLocation.getY();

		System.out.println(actualX_Cordinate);
		System.out.println(actualY_Cordinate);


		if(expected_X_cordinate==actualX_Cordinate) {
			System.out.println("UserName Input Box Expected and actual X_cordinate matched  -- Validation Passed");
		}else {
			System.out.println("UserName Input Box Expected and actual X_cordinate not matched  -- Validation Failed");
		}
		if(expected_Y_cordinate==actualY_Cordinate) {
			System.out.println("UserName Input Box Expected and actual Y_cordinate matched  -- Validation Passed");
		}else {
			System.out.println("UserName Input Box Expected and actual Y_cordinate not matched  -- Validation Failed");
		}


		if(weUserName.isDisplayed()) {
			System.out.println("UserName Input Box is Display   -Validation Passed");
		}else {
			System.out.println("UserName Input Box is not Display   - Validation failed");
		}

		if(weUserName.isEnabled()) {
			System.out.println("UserName Input Box is Enable   -Validation Passed");
		}else {
			System.out.println("UserName Input Box is not Enable   -Validation failed");
		}
		String ExpectedTagName="input";
		String ActualTagName=weUserName.getTagName();
		if(ExpectedTagName.equals(ActualTagName)) {
			System.out.println("Actual and Expedted Tag name matched    -- validation  Passed");
		}else {
			System.out.println("Actual and Expedted Tag name Not matched    -- validation  Failed");
		}

		weUserName.clear();
		weUserName.sendKeys("admin");
		String ExpectedUsernamefieldValue="admin";
		String ActualUserNamefieldValue=weUserName.getAttribute("value");
		if(ExpectedUsernamefieldValue.equals(ActualUserNamefieldValue)) {
			System.out.println("Actual and Expected UserName Field  after sending value matched  -- Validation passed");
		}else {
			System.out.println("Actual and Expected UserName Field  after sending value not matched  -- Validation Failed");
		}



		///////////////////////////////////////User_Password///////////////////////////////////////////////////////////////////

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		int expecteduserPasswordXCordinate=561;
		int expecteduserPasswordYCordinate=203;
		Point UserPassworlocation=weUserPassword.getLocation();		
		int actualUserPasswordX_cordinate=UserPassworlocation.getX();
		int actualUserPasswordY_cordinate=UserPassworlocation.getY();
		if(expecteduserPasswordXCordinate==actualUserPasswordX_cordinate) {
			System.out.println("UserPassword Input Box Expected and actual X_cordinate matched  -- Validation Passed");	
		}else {
			System.out.println("UserPassword Input Box Expected and actual X_cordinate not matched  -- Validation Failed");
		}
		if(expecteduserPasswordYCordinate==actualUserPasswordY_cordinate) {
			System.out.println("UserPassword Input Box Expected and actual Y_cordinate matched  -- Validation Passed");
		}else {
			System.out.println("UserPassword Input Box Expected and actual Y_cordinate not matched  -- Validation Failed");
		}


		if(weUserPassword.isDisplayed()) {
			System.out.println("UserPassword Input Box is Display   -Validation Passed");
		}else {
			System.out.println("UserPassword Input Box is not Display   - Validation failed");
		}

		if(weUserPassword.isEnabled()) {
			System.out.println("UserPassword Input Box is Enable   -Validation Passed");
		}else {
			System.out.println("UserPassword Input Box is not Enable   -Validation failed");
		}


		String ExpectedUserPasswordTagName="input";
		String ActualUserPasswordTagName=weUserPassword.getTagName();
		if(ExpectedUserPasswordTagName.equals(ActualUserPasswordTagName)) {
			System.out.println("User Password input box Actual and Expedted Tag name matched    -- validation  Passed");
		}else {
			System.out.println("User Password input box Actual and Expedted Tag name Not matched    -- validation  Failed");
		}
		weUserPassword.clear();
		weUserPassword.sendKeys("worngPassword");

		String expectedwrongUserPassword="worngPassword";
		String worngUserPassword= weUserPassword.getAttribute("value");
		if(worngUserPassword.equals(expectedwrongUserPassword)) {
			System.out.println("UserPassword input box Actual and Expected value matched   - Validation Passed");		
		}else {
			System.out.println("UserPassword input box Actual and Expected value not matched   -Validation failed ");
		}
		weUserPassword.clear();
		weUserPassword.sendKeys("admin1");
	}

}
