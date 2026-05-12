package org.Eva.Vtiger.TestCases;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Eva.Vtiger.utils.WebUtil;
import Org.Vtiger.Pages.HomePage;
import Org.Vtiger.Pages.LeadsCreatePage;
import Org.Vtiger.Pages.LeadsDetailsPage;
import Org.Vtiger.Pages.Leads_Landing_Page;
import Org.Vtiger.Pages.LoginPage;

public class LeadsModualTestCases {
	WebUtil webUtil;   
	LoginPage loginPage;
	HomePage homepage;
	Leads_Landing_Page leadLandingPage;
	LeadsCreatePage leadCreate;
	LeadsDetailsPage leadDetail;


	@BeforeClass(groups= {"smoke","regrassion"})
	public void setUpBrowser() {
		webUtil=new WebUtil();
		webUtil.launchBrowser("chrome");
	}
	@BeforeMethod(groups= {"smoke","regrassion"})
	public void beforeMethodLogin() {
		webUtil.getURL("http://localhost:8888/");
		loginPage=new LoginPage(webUtil);
		loginPage.login_With_Valid_Credentials("admin", "admin1");
	}

	
	
	
	
	@Test(groups= "smoke")
	public void  TC_SMOKE_01_Verify_User_Login_With_Valid_Credentials() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
	}
	@Test(groups= "smoke")
	public void TC_SMOKE_02_Verify_Create_Lead_With_Valid_Data() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("home","Verify Home page");
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Vimal");
		leadCreate.saveButton();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.validateLeadDetailsByContains("", "wefwefrg");
		System.out.println("uewdwhgdh");
	}
	
	@Test(groups= "smoke")
	public void TC_SMOKE_03_Verify_Leads_List_Page_Load_Successfully() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		List<WebElement> leadSize=leadLandingPage.allLeadId();
		System.out.println(leadSize.size());
	}
	
	@Test(groups= "smoke")
	public void TC_SMOKE_04_Verify_User_Logout_Functionality() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
	}
	
	
	@Test(groups= "regrassion")
	public void TC_REG_01_Verify_Create_Lead_With_Invalid_Data() {
		homepage = new HomePage(webUtil);
		homepage.validateEquals("Home", "verify Home Page ");  //   index.php?action=index&module=Home
		homepage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "Verify Lead Create Page ");
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Eva");
		leadCreate.emailIdTextBox("abcd@");
		leadCreate.saveButton();
		String textOfPop=webUtil.alert_getText();
		System.out.println(textOfPop);
		webUtil.accept_Alert();

	}
	@Test(groups= "regrassion")
	public void  TC_REG_02_Verify_Create_Lead_With_Missing_Mandatory_Fields() {
		homepage = new HomePage(webUtil);
		homepage.validateHomePageURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.validateLeadLandingPageURLByContains("module=Leads&action=index", "verify LeadLanding Page");
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.firstNameTitle("Mr.");
		leadCreate.firstNameTextBox("vimal");
		leadCreate.titleNameTextBox("Qa");
		leadCreate.emailIdTextBox("testingwithMissingField@gmail.com");
		leadCreate.leadScoreName("Employee");
		leadCreate.industryName("Banking");
		leadCreate.annualRevenueTextBox("1999");
		leadCreate.noOfEmplyeeTextBox("12");
		leadCreate.secondryEmailTextBox("rrrrvimal@gmail.com");
		leadCreate.phoneNumberTextBox("+91 020 8090 9999");
		leadCreate.mobileTextBox("78006181356789");
		leadCreate.faxTextBox("asdfg@fax.com");
		leadCreate.websiteNameTextBox("www.eva.com");
		leadCreate.leadStatusName("Cold");
		leadCreate.ratingStatus("Active");
		leadCreate.addressInformation("nigoh road", "nigoh", "222162", "jaunput", "U.P", "india");
		leadCreate.saveButton();
		String textOfPop=webUtil.alert_getText();
		System.out.println(textOfPop);
		webUtil.accept_Alert();
	}
	@Test(groups= "regrassion")
	public void TC_REG_03_Verify_Edit_Existing_Lead_Details() throws InterruptedException {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLastNameOfLead();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.clickOnEditLeadsButton();
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("EVA Mondh");
		leadCreate.saveButton();
		leadDetail.validateLeadDetailsByContains("Lead Updated Successfull", "new lead create successful");  //   
	}
	
	//    Resion of comment line - Xpath Again again change  firstly do correct xpath after that run the code
	
//	@Test(groups= "regrassion")
//	public void TC_REG_04_Verify_Delete_Existing_Lead() {
//		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
//		homepage = new HomePage(webUtil);
//		homepage.ClickOnLeadsModual();
//		leadLandingPage=new Leads_Landing_Page(webUtil);
//		leadLandingPage.clickOnLeadCreateButton();
//		leadDetail.clickOnDeleteLeadButton();
//		String leadDeleteConformation=webUtil.alert_getText();
//		System.out.println(leadDeleteConformation);
//		webUtil.accept_Alert();
//		List<WebElement> leadSize=leadLandingPage.allLeadId();
//		System.out.println(leadSize.size());
//
//	}
	@Test(groups= "regrassion")
	public void TC_REG_05_Verify_Search_Lead_By_Name() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.searchForLead("LEA98");
		leadLandingPage.clickOnSearchNow();
	}
	@Test(groups= "regrassion")
	public void TC_REG_06_Verify_Filter_Leads_By_Status() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.selectValueInFilter("Hot Leads");
	}
	@Test(groups= "regrassion")
	public void TC_REG_07_Verify_Duplicate_Lead_Creation_Not_Allowed() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.firstNameTitle("Mr.");
		leadCreate.firstNameTextBox("vimal");
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Eva");
		leadCreate.phoneNumberTextBox("+91 020 8090 9999");
		leadCreate.emailIdTextBox("vimal@gmail.com");
		leadCreate.saveButton();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.validateLeadDetailsByContains("Lead Information", "Create Lead with duplicate Data");
	}
	@Test(groups= "regrassion")
	public void TC_REG_08_Verify_Email_Field_Validation() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Eva");
		leadCreate.emailIdTextBox("vimal@ghghkd");
		leadCreate.saveButton();
		String popUpforWrongEmail=webUtil.alert_getText();
		System.out.println("This message when i send wrong Email  : "+popUpforWrongEmail);
		webUtil.accept_Alert();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.validateLeadDetailsByContains("Lead Information", "Create Lead with duplicate Data");
	
	}
	@Test(groups= "regrassion")
	public void TC_REG_09_Verify_Phone_Number_Field_Validation() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homepage = new HomePage(webUtil);
		homepage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Eva");
		leadCreate.mobileTextBox("vimajfkldjfdfdf");
		leadCreate.saveButton();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.validateLeadDetailsByContains("Lead Information", "Create Lead with duplicate Data");
	
		
	}
	
	@AfterMethod(groups= {"smoke","regrassion"})
	public void signOutVtiger() {
		webUtil.threadSleep(1);
		homepage.signOut();	
	}


	@AfterClass(groups= {"smoke","regrassion"})
	public void closeBrowser() {
		webUtil.closeBrowser();
	}
}
