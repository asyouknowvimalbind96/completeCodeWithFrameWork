package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodpractice2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

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
		String ExpectedUserPassword="admin1";
		weUserPassword.sendKeys("admin1");
		String ActualUserPassword=weUserPassword.getAttribute("value");
		if(ExpectedUserPassword.equalsIgnoreCase(ActualUserPassword)) {
			System.out.println("(right sending)Expected and actual userPassword matched   - Validation Passed");
		}else {
			System.out.println("Expected and actual userPassword Not matched   - Validation failed ");
		}
		//////////////////////////////////////////////we_Login//////////////////////////////////////////////////////////////

		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));

		weLogin.click();



		//////////////////////////////////////////////////we_Leads////////////////////////////////////////////////////////////////////	
		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
		Actions ActObj=new Actions(driver);
		
		
		WebElement we_PlushButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		ActObj.doubleClick(we_PlushButton).build().perform();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		WebElement we_source=driver.findElement(By.xpath("(//td[@align='left'])[7]"));
		WebElement we_Target=driver.findElement(By.xpath("(//td[@align='left'])[15]"));
		
		Thread.sleep(2000);
		ActObj.dragAndDrop(we_source,we_Target).build().perform();
		Thread.sleep(3000);
		
		WebElement we_more=driver.findElement(By.xpath("//a[@href='javascript:;']"));
		ActObj.moveToElement(we_more).build().perform();
		Thread.sleep(3000);
		
		WebElement HomePlushButton=driver.findElement(By.xpath("//img[@width='27']"));
		
		
		ActObj.contextClick(HomePlushButton).build().perform();
		Thread.sleep(3000);
		
		WebElement SignSimble=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		ActObj.moveToElement(SignSimble).build().perform();
		Thread.sleep(2000);
		
		WebElement SignOut=driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']"));
		ActObj.click(SignOut).build().perform();
		

	}	
	}

