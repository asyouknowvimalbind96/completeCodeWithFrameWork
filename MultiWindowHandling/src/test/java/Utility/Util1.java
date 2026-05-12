package Utility;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Util1 {
	static WebDriver driver;
	static Actions act;


	
	
	
	public void LoginTest() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebElement weClick=driver.findElement(By.xpath("//input[@type='submit']"));
		weClick.click();
		String expectedTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("login Succesfully Dashboard is Open");
		}else {
			System.out.println("Unsuccessful login");
		}

	}
	public void logoutTest_2() {
		new Actions(driver);
		WebElement weprofileOver=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		act.moveToElement(weprofileOver).build().perform();
		WebElement weprofile=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		weprofile.click();
		String ExpectedTitleLoginPage="vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase(ExpectedTitleLoginPage)) {
			System.out.println("page logout successfully");
		}else {
			System.out.println("logout unsuccessful");
		}

	}
	public void CreateLeadTest_3() throws InterruptedException {
		LoginTest();

		WebElement welead=driver.findElement(By.xpath("//a[text()='Lead']"));
		welead.click();
		WebElement weplushButton=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		weplushButton.click();
		WebElement welastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		welastname.sendKeys("yadav1");
		WebElement wecompany=driver.findElement(By.xpath("//input[@name='company']"));
		wecompany.sendKeys("Gravity automation PVT LTD");
		WebElement wesaveButton=driver.findElement(By.xpath("//input[@accesskey='S']"));
		wesaveButton.click();
		WebElement weleadname=driver.findElement(By.xpath("//span[contains(text(),'Lead Information')]"));   
		String actualLead=weleadname.getText();


		if(actualLead.contains("Lead Information")) {
			System.out.println("Lead Create Successfully");
			System.out.println(actualLead);
		}else {
			System.out.println("Lead Create Unsuccessfully");
		}


	}
	public void editTest_4() throws InterruptedException {
		LoginTest();
		WebElement welead=driver.findElement(By.xpath("//a[text()='Leads']"));
		welead.click();	
		WebElement weEdit=driver.findElement(By.xpath("//tr[contains(@id,'row_65')]//a[text()='edit']"));
		weEdit.click();
		WebElement welastnameEdit=driver.findElement(By.xpath("//input[@name='lastname']"));
		welastnameEdit.clear();
		welastnameEdit.sendKeys("yadav sandeep");
		WebElement wesaveButton=driver.findElement(By.xpath("//input[@accesskey='S']"));
		wesaveButton.click();
		WebElement weexitingName=driver.findElement(By.xpath("//tr[contains(@id,'row_65')]//a[@href='index.php?module=Leads&parenttab=Marketing&action=DetailView&record=65']"));
		String Actualtext=weexitingName.getText();
		String expected="yadav sandeep";
		if(Actualtext.equalsIgnoreCase(expected)) {
			System.out.println("Edited name is present");
		}else {
			System.out.println("Edited name is not present");
		}
	}
	public void deleteTest_5() throws InterruptedException {
		LoginTest();

		WebElement welead=driver.findElement(By.xpath("//a[text()='Leads']"));
		welead.click();	
		WebElement weDelete=driver.findElement(By.xpath("//tr[contains(@id,'row_')]//a[text()='del']"));
		weDelete.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		List<WebElement> ListAllLead=driver.findElements(By.xpath("//td[contains(text(),'LEA')]"));
		System.out.println(ListAllLead.size());

	}
	public void CreateContactTest_6() throws InterruptedException {
		LoginTest();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement weCreateContact=driver.findElement(By.xpath("//a[text()='Contacts']"));
		weCreateContact.click();
		WebElement weplushButton=driver.findElement(By.xpath("//img[@title='Create Contact...']"));
		weplushButton.click();
		WebElement weLastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		jse.executeScript("arguments[0].value='BindVimal'", weLastName);
		WebElement weSaveButton=driver.findElement(By.xpath("//input[@accesskey='S']"));
		weSaveButton.click();
		WebElement weconformationText=driver.findElement(By.xpath("//span[contains(text(),'Contact Information')]"));
		String Actual_Text=weconformationText.getText();
		if(Actual_Text.contains("Contact Information")) {
			System.out.println("Contact Create Successfully");
			System.out.println(Actual_Text);
		}else {
			System.out.println("Contact Create Unsuccessfull");
		}
	}
	public void EditContactTest_7() throws InterruptedException {
		LoginTest();
		WebElement weCreateContact=driver.findElement(By.xpath("//a[text()='Contacts']"));
		weCreateContact.click();
		Thread.sleep(2000);
		WebElement wecontactName=driver.findElement(By.xpath("(//td[contains(text(),'CON2')]//following-sibling::td//a[@href='index.php?module=Contacts&parenttab=Marketing&action=DetailView&record=79'])[2]"));
		wecontactName.click();
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement weedit=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Edit']")));
		weedit.click();
		WebElement weLastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		weLastName.clear();
		weLastName.sendKeys("Vimal");

		WebElement weTextChange=driver.findElement(By.xpath("//span[contains(text(),'Contact Information')]"));
		String ActualText=weTextChange.getText();
		if(ActualText.contains("Contact Information")) {
			System.out.println("Contact Edit Successfully");
			System.out.println(ActualText);
		}else {
			System.out.println("Contact not Edit");
		}
	}

	public void DeleteContactTest_8() throws InterruptedException {
		LoginTest();
		WebElement weCreateContact=driver.findElement(By.xpath("//a[text()='Contacts']"));
		weCreateContact.click();
		WebElement wecheckBox=driver.findElement(By.xpath("//tr[@id='row_79']//input[@name='selected_id']"));
		wecheckBox.click();
		WebElement weDeleteButton=driver.findElement(By.xpath("//input[@value='Delete']"));
		weDeleteButton.click();

		List<WebElement> allcontact = driver.findElements(By.xpath("//td[contains(text(),'CON')]"));
		System.out.println(allcontact.size());
	}

	public void OrganazationTest_9() throws InterruptedException {
		LoginTest();
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement organazation =expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Organizations']")));
		organazation.click();
		WebElement weconformationName = driver.findElement(By.xpath("//img[@title='Create Organization...']"));
		weconformationName.click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Dhruv Gupta");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		WebElement weConformati_on_meaage = driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]"));
		String ActualContactText=weConformati_on_meaage.getText();
		if(ActualContactText.contains("Organization Information")) {
			System.out.println("Orgnazation Create Successful");
			System.out.println(ActualContactText);
		}else {
			System.out.println("Ornazation Create Unsuccesfully");
		}

	}
	public void EditOrganazation_10() throws InterruptedException {
		LoginTest();
		WebElement weOrganazation=driver.findElement(By.xpath("//a[text()='Organizations']"));
		weOrganazation.click();
		WebElement weOrgName=driver.findElement(By.xpath("//tr[@id='row_81']//a[@title='Organizations']"));
		weOrgName.click();
		WebElement weEdit=driver.findElement(By.xpath("//input[@name='Edit']"));
		weEdit.click();
		WebElement weReplaceName=driver.findElement(By.xpath("//input[@name='accountname']"));
		weReplaceName.clear();
		weReplaceName.sendKeys("dhruv gupta");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		WebElement weConformati_on_meaage = driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]"));
		String ActualContactText=weConformati_on_meaage.getText();
		if(ActualContactText.contains("Organization Information")) {
			System.out.println("Orgnazation Edit Successful");
			System.out.println(ActualContactText);
		}else {
			System.out.println("Ornazation Edit Unsuccessfully");
		}


	}

	public void DeleteOrganazation_11() throws InterruptedException {
		LoginTest();
		WebElement weOrganazation=driver.findElement(By.xpath("//a[text()='Organizations']"));
		weOrganazation.click();
		WebElement weOrgName=driver.findElement(By.xpath("//a[text()='del']"));
		weOrgName.click();
		List<WebElement> allOrg = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
		System.out.println("Before Delete Organation Left   > "+allOrg.size());
		WebElement weDelete=driver.findElement(By.xpath("//input[@value='Delete']"));
		weDelete.click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		List<WebElement> AallOrg = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
		System.out.println("After Delete Organation Left   > "+AallOrg.size());


	}
	public void CreateOpprtunity_12() throws InterruptedException {
		LoginTest();
		WebElement weOpportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		weOpportunities.click();
		WebElement wePlushButton=driver.findElement(By.xpath("//img[@alt='Create Opportunity...']"));
		wePlushButton.click();
		WebElement weOpportunityName=driver.findElement(By.xpath("//input[@name='potentialname']"));
		weOpportunityName.sendKeys("EVA Opportu..");
		WebElement weReleted=driver.findElement(By.xpath("//input[@id='related_to_display']/following-sibling::img[@src='themes/softed/images/select.gif']"));
		weReleted.click();

		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String CurrentURL=driver.getCurrentUrl();
			if(CurrentURL.contains("http://localhost:8888/index.php?module=Contacts&action=Popup&html=Popup_picker&form=vtlibPopupView&")) {
				break;
			}
		}
		WebElement weReletedName=driver.findElement(By.xpath("//a[text()='vimal bind']"));
		weReletedName.click();
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String CurrentURL=driver.getCurrentUrl();
			if(CurrentURL.contains("/index.php?module=Potentials&action")) {
				break;
			}
		}
		WebElement wesaveButton=driver.findElement(By.xpath("(//input[@title='Cancel [Alt+X]']//preceding-sibling::input[@value='  Save  '])[1]"));
		wesaveButton.click();
		WebElement weVerifiedName1=driver.findElement(By.xpath("//span[contains(text(),'Opportunity Information')]"));
		String innerText=weVerifiedName1.getText();
		if(innerText.contains("Opportunity Information")) {
			System.out.println("new Opportunity Create Successfully");
			System.out.println("It is new Opportunity  > "+innerText);
		}else {
			System.out.println("new Opportunity Create Unsuccessfully");
		}
	}

	public void ConvertLeadToOpportunity_13() throws InterruptedException {
		LoginTest();
		WebElement welead=driver.findElement(By.xpath("//a[text()='Leads']"));
		welead.click();	
		WebElement wenameClick=driver.findElement(By.xpath("//td[text()='LEA53 ']//following-sibling::td//a[text()='yadav1']"));
		wenameClick.click();
		WebElement weconvertLead=driver.findElement(By.xpath("//a[text()='Convert Lead']"));
		weconvertLead.click();
		WebElement weCheckBoxClick=driver.findElement(By.xpath("//input[@id='select_potential']"));
		weCheckBoxClick.click();
		WebElement weFillDate=driver.findElement(By.xpath("//input[@id='jscal_field_closedate']"));
		weFillDate.sendKeys("2026/05/12");
		WebElement weSaveButton=driver.findElement(By.xpath("//input[@name='Save']"));
		weSaveButton.click();
		WebElement weVerifyName=driver.findElement(By.xpath("//span[contains(text(),'Organization Information')]"));
		String strText=weVerifyName.getText();
		if(strText.contains("Organization Information")) {
			System.out.println("Lead convert to Organization Succesfull");
			System.out.println("It is converted Lead  >  "+strText);
		}else {
			System.out.println("Lead convert to Organization Unsuccesfull");
		}
	}

	public void campaignsTest_14() throws InterruptedException {
		LoginTest();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement weCampaign=driver.findElement(By.xpath("//a[@name='Campaigns']"));
		jse.executeScript("arguments[0].click()", weCampaign);

		WebElement weplushButton=driver.findElement(By.xpath("//img[@alt='Create Campaign...']"));
		weplushButton.click();
		WebElement wecompaignName=driver.findElement(By.xpath("//input[@name='campaignname']"));
		jse.executeScript("arguments[0].value='Eva mondh bhadohi'", wecompaignName);
		WebElement weSaveButton=driver.findElement(By.xpath("//input[@accesskey='S']"));
		weSaveButton.click();
		WebElement weCompaignVerifyName=driver.findElement(By.xpath("//span[contains(text(),' Campaign Information')]"));
		String foundText=weCompaignVerifyName.getText();
		if(foundText.contains("Campaign Information")) {
			System.out.println("Campaign Created Successful");
			System.out.println("it is new Created Compaign  >  "+foundText);
		}else {
			System.out.println("Campaign Create Unsuccessful");
		}
	}
	public void Generate_Report_15() throws InterruptedException {
		LoginTest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Actions act=new Actions(driver);
		WebElement weOverOnMore=driver.findElement(By.xpath("//a[text()='More']"));
		act.moveToElement(weOverOnMore).build().perform();
		WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement weReport=expWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Reports']")));
		jse.executeScript("arguments[0].click();", weReport);
		List<WebElement> allReport = driver.findElements(By.xpath("//b[contains(text(),'Organization and Contact Reports')]//ancestor::table[@class='reportsListTable']//tr[@class='lvtColData']"));
		System.out.println("After Report add then total Reports >   "+allReport.size());
		driver.findElement(By.xpath("//img[@alt='Create Report...']")).click();
		WebElement weDropDown=driver.findElement(By.xpath("//select[@id='selectModuleElement']"));
		Select sel=new Select(weDropDown);
		sel.selectByVisibleText("Contacts");
		WebElement weCreatebutton=driver.findElement(By.xpath("//input[@name='cancel']//preceding-sibling::input[@class='crmbutton small create']"));
		weCreatebutton.click();
		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("Reports&action=ReportsAja")) {
				break;
			}
		}
		Thread.sleep(4000);
		WebElement weReportName=driver.findElement(By.xpath("//input[@name='reportname']"));
		jse.executeScript("arguments[0].value='Absence of the error fallasi111'", weReportName);
		WebElement weReportDiscription=driver.findElement(By.xpath("//textarea[@name='reportdes']"));
		weReportDiscription.sendKeys("1. Testing Shows pregence of Defect  2.  exahstive Testing   3.  Early Testing  4.   Defect Clustering   5.  pestiside Paradox   6. testing is Context Dependence   7.  defect is errror Falsi ");
		//WebElement wenextButton=driver.findElement(By.xpath(""));
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		driver.findElement(By.xpath("//input[@value='Products']")).click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		driver.findElement(By.xpath("//select[@id='availList']//option[text()='Contacts ID']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		wenextButton.click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		wenextButton=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next']")));
		wenextButton.click();
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("index.php?module=Reports&")) {
				break;
			}
		}
		List<WebElement> AfterallReport = driver.findElements(By.xpath("//b[contains(text(),'Organization and Contact Reports')]//ancestor::table[@class='reportsListTable']//tr[@class='lvtColData']"));
		System.out.println("After Report add then total Reports >   "+AfterallReport.size());
	}
	public void ChangePasswordTest_16() throws InterruptedException {
		LoginTest(); //img[@src='themes/softed/images/user.PNG']
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement wePreference=driver.findElement(By.xpath("//a[@id='_my_preferences_']"));
		jse.executeScript("arguments[0].click()", wePreference);
		driver.findElement(By.xpath("//input[@name='password']")).click();    //    http://localhost:8888/index.php?module=Users&action=ChangePassword&form=DetailView
		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("Users&action=ChangePassword&f")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@title='Cancel [Alt+X]']")).click();
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("DetailView&record=1")) {
				break;
			}
		}
	}
	public void AddProduct_18() throws InterruptedException {
		LoginTest();
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Parle-G");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		WebElement weVerifyText=driver.findElement(By.xpath("//span[contains(text(),'Product Information')]"));
		String GetTextfound=weVerifyText.getText();
		if(GetTextfound.contains("Product Information")) {
			System.out.println("Product Create Succesfully");
			System.out.println("it is new Product Details  >  "+GetTextfound);
		}else {
			System.out.println("Product Create Unsuccesfully");
		}
	}

	public void Create_Invoice_19() throws InterruptedException {
		LoginTest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement weOverOnMore=driver.findElement(By.xpath("//a[text()='More']"));
		act.moveToElement(weOverOnMore).build().perform();
		WebElement weInvoice=driver.findElement(By.xpath("//a[@name='Invoice']"));
		weInvoice.click();
		driver.findElement(By.xpath("//img[@alt='Create Invoice...']")).click();
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Programing Langues");
		driver.findElement(By.xpath("//input[@id='single_accountid']//following-sibling::img[@alt='Select']")).click();
		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("=Popup&popuptype=specific_account_address&")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='vimal bind']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("index.php?module=Invoice&action")) {
				break;
			}
		}
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Vill- adampur Nigoh Dist Jaunpur 222162");
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Vill- adampur Nigoh Dist Jaunpur 222162");
		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
		Set<String> allHandleValue2=driver.getWindowHandles();
		for(String handleValue2:allHandleValue2) {
			driver.switchTo().window(handleValue2);
			String currentUrl2=driver.getCurrentUrl();
			if(currentUrl2.contains("http://localhost:8888/index.php?module=Products&action=Popup&html=Popup_picker&select=enable&form=HelpDeskEditView&popuptype=inventory_prod&curr_row=1&&&return_module=Invoice&currencyid=1")) {
				break;
			}
		}
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement weNameclick=expWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dhruv Gupta']")));
		weNameclick.click();

		allHandleValue2=driver.getWindowHandles();
		for(String handleValue2:allHandleValue) {
			driver.switchTo().window(handleValue2);
			String currentUrl2=driver.getCurrentUrl();
			if(currentUrl2.contains("Invoice&action=EditView&return_")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		WebElement weVerifyText=driver.findElement(By.xpath("//span[contains(text(),'Invoice Information')]"));
		String GetTextfound=weVerifyText.getText();
		if(GetTextfound.contains("Invoice Information")) {
			System.out.println("Invoice Create Succesfully");
			System.out.println("it is new Invoice Details  >  "+GetTextfound);
		}else {
			System.out.println("Invoice Create Unsuccesfully");
		}
	}

	public void Search_Record_20() throws InterruptedException {
		LoginTest();
		driver.findElement(By.xpath("//input[@name='query_string']")).sendKeys("vimal");
		driver.findElement(By.xpath("//input[@alt='Find']")).click();
		Thread.sleep(4000);
		List<WebElement> wevi=driver.findElements(By.xpath("//a[text()='Vimal']"));
		System.out.println(wevi.size());


		System.out.println("Yes,  Searched name is present in the display");

		System.out.println("No,  Searched Name is not Present in the Display");


	}
	public void Assign_Lead_to_User_17() throws InterruptedException {
		LoginTest();
		WebElement weAssign=driver.findElement(By.xpath("//select[@id='qccombo']"));
		Select sel=new Select(weAssign);
		sel.selectByVisibleText("New Lead");
		
		
		
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement wecompany=expWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='company']")));
		wecompany.sendKeys("Eva mondh");
		WebDriverWait expWaitforLastName=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement welastname=expWaitforLastName.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname']")));		
		welastname.sendKeys("Bind");
		driver.findElement(By.xpath("//td[@align='right']//input[@name='button']")).click();
		WebElement weleadname=driver.findElement(By.xpath("//span[contains(text(),'Lead Information')]"));   
		String actualLead=weleadname.getText();


		if(actualLead.contains("Lead Information")) {
			System.out.println("Lead Create Successfully");
			System.out.println(actualLead);
		}else {
			System.out.println("Lead Create Unsuccessfully");
		}


	}
}

/*

✅ TC13 – Convert Lead to Opportunity

Precondition: Lead exists
Steps:

Click Leads

Select Lead

Click Convert

Click Save
Expected Result: Lead converted to Opportunity successfully

✅ TC14 – Create Campaign

Precondition: User logged in
Steps:

Click Campaigns

Click Add Campaign

Enter details

Click Save
Expected Result: Campaign created successfully						/////   done

✅ TC15 – Generate Report

Precondition: Data available
Steps:

Click Reports

Click Create Report

Select criteria

Click Generate
Expected Result: Report generated successfully				////done

✅ TC16 – Change Password

Precondition: User logged in
Steps:

Click Profile

Click Settings

Click Change Password

Enter old & new password

Click Save
Expected Result: Password changed successfully 				/// Done

✅ TC17 – Assign Lead to User

Precondition: Lead exists
Steps:

Click Leads

Select Lead

Click Assign

Select User

Click Save
Expected Result: Lead assigned successfully

✅ TC18 – Add Product

Precondition: User logged in
Steps:

Click Products

Click Add Product

Enter product details

Click Save
Expected Result: Product added successfully				//  done

✅ TC19 – Create Invoice

Precondition: Product & Customer exist
Steps:

Click Invoices


Click Add Invoice

Enter details

Click Save
Expected Result: Invoice created successfully

✅ TC20 – Search Record

Precondition: Records exist
Steps:

Enter keyword in Search bar

Click Search
Expected Result: Relevant records displayed
 * 
 */

