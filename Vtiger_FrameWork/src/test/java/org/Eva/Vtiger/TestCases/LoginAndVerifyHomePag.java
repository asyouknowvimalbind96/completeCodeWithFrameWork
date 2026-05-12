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

public class LoginAndVerifyHomePag {
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

	@Test(groups="smoke")
	public void  TC_SMOKE_01_Verify_User_Login_With_Valid_Credentials() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
	}
	@Test(groups="smoke")
	public void TC_SMOKE_02_Verify_Create_Lead_With_Valid_Data() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		leadCreate=new LeadsCreatePage(webUtil);
		leadCreate.lastNameInputField("Bind");
		leadCreate.CompanyName("Vimal");
		leadCreate.saveButton();
		leadDetail=new LeadsDetailsPage(webUtil);
		leadDetail.validateLeadDetailsByContains("Lead Information", "Lead Create Successfull");

	}
	@Test(groups="smoke")
	public void TC_SMOKE_03_Verify_Leads_List_Page_Load_Successfully() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
		homepage.ClickOnLeadsModual();
		leadLandingPage=new Leads_Landing_Page(webUtil);
		List<WebElement> leadSize=leadLandingPage.allLeadId();
		System.out.println(leadSize.size());
	}
	@Test(enabled =false,groups="smoke")
	public void TC_SMOKE_04_Verify_User_Logout_Functionality() {
		homepage=new HomePage(webUtil);
		homepage.validateEquals("Home","Verify Home page");
	}
@Test(groups= "regrassion")
	public void TC_REG_01_Verify_Create_Lead_With_Invalid_Data() {
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
		leadCreate.emailIdTextBox("abcd@");
		leadCreate.saveButton();
		String textOfPop=webUtil.alert_getText();
		System.out.println(textOfPop);
		//webUtil.accept_Alert();

	}

	@AfterMethod
	public void signOutVtiger() {
		//homepage.signOut();	
	}

	@AfterClass
	public void closeBrowser() {
		//webUtil.closeBrowser();
	}
}
