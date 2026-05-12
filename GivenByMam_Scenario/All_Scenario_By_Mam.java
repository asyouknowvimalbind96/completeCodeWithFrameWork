package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class All_Scenario_By_Mam {

	public static void main(String[] args) throws InterruptedException {
		//Scenario27_09();
		//erroHandling();
		//NavigationAction();		
		//VerifyFieldPropertie();
		 NewLead_with_validaData();




	}


	public static void Scenario27_09() throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();


		String ExpectedHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String ActualHomepageTitle=driver.getTitle();
		if(ExpectedHomePageTitle.equals(ActualHomepageTitle)) {
			System.out.println("Expected and actual home Page title matched    -- Validation Passed ");
		}else {
			System.out.println("Expected and actual home Page title not matched    -- Validation failed ");
		}

		WebElement weLead=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLead.click();

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@class='searchBox']"));
		weSearchBox.sendKeys("Test Lead");
		Thread.sleep(2000);
		weSearchBox.clear();

		WebElement weDropDown=driver.findElement(By.xpath("//select[@name='search_field']"));
		Select DropSel=new Select(weDropDown);
		DropSel.selectByVisibleText("Last Name");

		WebElement weSearch=driver.findElement(By.xpath("//input[@name='submit']"));
		weSearch.click();
		driver.navigate().back();

		String expLeadPageCurrentUrl="http://localhost:8888/index.php?action=index&module=Home";
		String actualLeadPageCurrentUrl=driver.getCurrentUrl();
		if(expLeadPageCurrentUrl.equals(actualLeadPageCurrentUrl)) {
			System.out.println("Expected and actual current Url matche  -- Validation Passed ");
		}else {
			System.out.println("Expected and actual current Url matche  -- Validation Passed ");
		}

		driver.quit();
	}


	public static void erroHandling() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();

		WebElement weerrorMessage=driver.findElement(By.xpath("//div[@class='errorMessage']"));
		String ActualErrorMessage=weerrorMessage.getAttribute("value");
		String ExpectedErrorMessage="You must specify a valid username and password.";

		if(ActualErrorMessage.equals(ExpectedErrorMessage)) {
			System.out.println("Expected and actual Error message Matched  -- Validation Passed ");
		}else {
			System.out.println("Expected and actual Error message not Matched  -- Validation Failed ");

		}




	}

	public static void NavigationAction() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();

		WebElement weMore=driver.findElement(By.xpath("//a[text()='More']"));
		act.moveToElement(weMore).build().perform();

		WebElement weCampaigns=driver.findElement(By.xpath("//a[text()='Campaigns']"));
		act.click(weCampaigns).build().perform();

		String Expected_Campaigns_Title="Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM";
		String Actual_Campaigns_Title=driver.getTitle();

		if(Expected_Campaigns_Title.equals(Actual_Campaigns_Title)) {
			System.out.println("Expected and actual Campaigns page title matched   -- Validatin Passed ");
		}else {
			System.out.println("Expected and actual Campaigns page title not matched   -- Validatin Failed ");

		}
		driver.navigate().back();

	}
	
	
	
	
	
	public static void VerifyFieldPropertie() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();


		WebElement weUserName=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		String actualUserNameInputBox=weUserName.getAttribute("value");

		if(actualUserNameInputBox.equals("")) {
			System.out.println("user name input box is blank   validation Passed");
		}else {
			System.out.println("user name input box is not blank   validation Failed");
		}
		
		

		WebElement weLogIn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		String actualLoginTagName=weLogIn.getTagName();
		if(actualLoginTagName.equals("input")) {
			System.out.println("Actual and Expected Login tag name matched   -- Validation Passed");
		}else {
			System.out.println("Actual and Expected Login tag name not matched   -- Validation Failed");
		}
	}
	
	
	
	
	
	
		public static void NewLead_with_validaData() {
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.manage().window().maximize();


			WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
			weUserName.sendKeys("admin");

			WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
			weUserPassword.sendKeys("admin1");

			WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
			weLogIn.click();
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
		}
	
	
	
	
	public static void Scenario20_09_2025() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();

		Thread.sleep(2000);

		String ExpectedHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String ActualHomePageTitle=driver.getTitle();
		System.out.println(ActualHomePageTitle);
		if(ExpectedHomePageTitle.equals(ActualHomePageTitle)) {
			System.out.println("Login Sussucefully and at home page validation By Get Title   -- Validation Passed");
		}else {
			System.out.println("Login Failed");
		}

		Thread.sleep(2000);
		String ExpectedCurrentUrl="http://localhost:8888/index.php?action=index&module=Home";
		String ActualCurrentUrl=driver.getCurrentUrl();
		System.out.println(ActualCurrentUrl);
		if(ExpectedCurrentUrl.equals(ActualCurrentUrl)) {
			System.out.println("Login Succesfully  and at home Page");
		}else {
			System.out.println("Login failed");
		}

	}




	public static void Scenario2()throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("Wrong UserName");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("Wrong UserPassword");

		Thread.sleep(2000);

		weUserName.clear();
		Thread.sleep(1000);

		weUserPassword.clear();

		weUserName.sendKeys("admin");
		Thread.sleep(1000);
		weUserPassword.sendKeys("admin1");
		Thread.sleep(1000);

		WebElement weLoginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		weLoginClick.click();

		Thread.sleep(2000);


		String ExpectedHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String Homepagetitle=driver.getTitle();

		if(ExpectedHomePageTitle.equals(Homepagetitle)) {
			System.out.println("Cleared and Logged in Succesfully");
		}else {
			System.out.println("Error In Login");
		}

		driver.quit();
	}



	public static void Scenario3() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLoginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		weLoginClick.click();

		Thread.sleep(1000);

		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click(); 

		WebElement weFilter=driver.findElement(By.xpath("//select[@name='viewname']"));

		String ExpectedTagName="select";
		String ActualTagName=weFilter.getTagName();		
		if(ExpectedTagName.equals(ActualTagName)) {
			System.out.println("Expected and actual TagName Matched   -- Validation  Passed");
		}else {
			System.out.println("Expected and actual TagName Not matched   -- Validation Failed");
		}

		Select SelObj=new Select(weFilter);

		SelObj.selectByVisibleText("This Month Leads");
		SelObj.selectByIndex(1);
		SelObj.selectByValue("1");


		String ExpectedFirstSelectOpt="All";
		WebElement FirstSelect=SelObj.getFirstSelectedOption();
		String ActualFirstSelect=FirstSelect.getText();

		if(ExpectedFirstSelectOpt.equals(ActualFirstSelect)) {
			System.out.println("Currect Options Selected   -- Validation Passed");
		}else {
			System.out.println("Wrong Option Selected -- Validation Failed");
		}


		driver.quit();	
	}


	public static void Scenario4() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLoginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		weLoginClick.click();

		Thread.sleep(1000);

		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click(); 

		Actions ActObj=new Actions(driver);
		WebElement wePlushButton=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));

		Thread.sleep(2000);
		ActObj.doubleClick(wePlushButton).build().perform();

		WebElement weLastName=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		weLastName.sendKeys("Bind");
		WebElement weCompanyName=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		weCompanyName.sendKeys("BN Yarn Dyers");


		WebElement RightClickOnSaveButton=driver.findElement(By.xpath("//input[@accesskey='S']"));
		ActObj.contextClick(RightClickOnSaveButton).build().perform();


		/////    mam mai isame condition kaise matche karau isaka 
		//      expected aur actual value kaise milegi


		//		if(()) {
		//			System.out.println("Action Succesfully Work   -- Validation Passed");
		//		}else {
		//			System.out.println("Action Failed  -- Validation Failed");
		//		}

		WebElement we_Administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		ActObj.moveToElement(we_Administrator).build().perform();
		Thread.sleep(2000);

		WebElement weSignOut=driver.findElement(By.xpath("//a[text()='Sign Out']"));//    ////a[@href='index.php?module=Users&action=Logout']
		ActObj.click(weSignOut).build().perform();



		driver.quit();

	}





	public static void Scenario18_09_2025() throws InterruptedException {

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

		WebElement weFilter=driver.findElement(By.name("viewname"));
		Select FilterSelect=new Select(weFilter);
		FilterSelect.selectByValue("3");

		WebElement this_month_DropdownValue=FilterSelect.getFirstSelectedOption();
		String Actualthis_month_DropDownValue=this_month_DropdownValue.getText();
		String Expectedthis_month_DropDownValue="This Month Leads";
		if(Actualthis_month_DropDownValue.equals(Expectedthis_month_DropDownValue)) {
			System.out.println("Expected and actual DropDown Value of This Month Leads   matched    ---- Validation Passed");

		}else {
			System.out.println("Expected and actual DropDown Value of This Month Leads  not matched    ---- Validation Failed");

		}


		Thread.sleep(3000);
		driver.navigate().back();



		WebElement weLeads2=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads2.click();

		WebElement weFilter2=driver.findElement(By.xpath(""));
		Select FilterSelect2=new Select(weFilter2);
		FilterSelect2.selectByVisibleText("Hot Leads");

		WebElement HotDropdownValue=	FilterSelect2.getFirstSelectedOption();
		String ActualHotDropDownValue=HotDropdownValue.getText();
		String ExpectedHotDropDownValue="Hot Leads";
		if(ActualHotDropDownValue.equals(ExpectedHotDropDownValue)) {
			System.out.println("Expected and actual DropDown Value of Hot Leads   matched    ---- Validation Passed");
		}else {
			System.out.println("Expected and actual DropDown Value of Hot Leads  not matched    ---- Validation Failed");
		}


		if(Actualthis_month_DropDownValue.equals(ActualHotDropDownValue)) {
			System.out.println("value is not match ...passed");
		}
		else {
			System.out.println("value is  match ...failed");
		}
		Thread.sleep(3000);
		//driver.quit();
	}



}	
//*Test Case: Filter “Hot Leads”

//1-please enters  valid username “admin” and valid password “admin” and presses the login button.

//2-After successfully logging in, clicks on the Leads module to see the list of leads.
//
//3-On the Leads page, please locates the Filter dropdown (named “viewname”).
//
//4-please checks if this filter dropdown is visible and enabled for interaction.
//
//5-and then selects the “Hot Leads” option from this dropdown.
//
//6-then retrieves the currently selected option from the dropdown using getFirstSelectedOption().getText() and confirms “Hot Leads”.
//
//7-Verify before selection and  after selection (value changed).
//
//8-and then sign out 
//
//9-Finally, closes the browser.




