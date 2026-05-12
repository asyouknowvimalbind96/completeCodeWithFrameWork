package org.Eva.Vtiger.TestCases;

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

public class TestCases {
	
	WebUtil webUtil;
	LoginPage loginPage;
	HomePage homePage;
	Leads_Landing_Page leadLandingPage;
	LeadsCreatePage createPage;
	LeadsDetailsPage leadDetailPage;
	
	
	
	@BeforeClass(groups={"smoke","regrassion"})
	public void setUpForProject() {
		webUtil=new WebUtil();
		webUtil.launchBrowser("chrome");
		webUtil.getURL("http://localhost:");
	}
	
	@BeforeMethod(groups= {"smoke","regrassion"})
	public void beforeMethod() {
		loginPage=new LoginPage(webUtil);
		loginPage.login_With_Valid_Credentials("admin", "admin1"); 
	}
	
	@Test(priority=0,groups= "smoke")
	public void TC001_LoginAndVerifyHomePage()  {
		webUtil.validateURLContains("index.php?action=index&module=Home", "Verify Home Page  ");
	}
	@Test(priority=1,groups= {"smoke"})
	public  void TC003_LeadCreateWithMandatoryFieldAndVerifyLead() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "Home Page ");
		homePage=new HomePage(webUtil);
		homePage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		createPage=new LeadsCreatePage(webUtil);
		createPage.lastNameInputField("Bind");
		createPage.CompanyName("EVA");
		createPage.saveButton();
		LeadsDetailsPage leadDetailPage=new LeadsDetailsPage(webUtil);
		leadDetailPage.validateLeadDetailsByContains("Lead Information", "verify new Lead Create Successfull");
		webUtil.threadSleep(2);
	}
	@Test(priority=2,groups = {"regrassion"})
	public void TC004_LeadCreateWithAllFieldAndVerifyLead() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		homePage = new HomePage(webUtil);
		homePage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		createPage=new LeadsCreatePage(webUtil);
		createPage.firstNameTitle("Mr.");
		createPage.firstNameTextBox("vimal");
		createPage.lastNameInputField("Bind");
		createPage.CompanyName("Eva");
		createPage.titleNameTextBox("Qa");
		createPage.emailIdTextBox("vimalbindaaa@gmail.com");
		createPage.leadScoreName("Employee");
		createPage.industryName("Banking");
		createPage.annualRevenueTextBox("1999");
		createPage.noOfEmplyeeTextBox("12");
		createPage.secondryEmailTextBox("rrrrvimal@gmail.com");
		createPage.phoneNumberTextBox("+91 020 8090 9999");
		createPage.mobileTextBox("7800618135");
		createPage.faxTextBox("asdfg@fax.com");
		createPage.websiteNameTextBox("www.eva.com");
		createPage.leadStatusName("Cold");
		createPage.ratingStatus("Active");
		createPage.addressInformation("nigoh road", "nigoh", "222162", "jaunput", "U.P", "india");
		createPage.discriptionTextBox("I think this code is proper Running according  ");
		createPage.saveButton();
		leadDetailPage=new LeadsDetailsPage(webUtil);
		leadDetailPage.validateLeadDetailsByContains("", "new Lead Create Successfull");
	
	}
//	@Test
//	public void TC005_DeleteLeadAndVerifyLead() {
//		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
//		homePage=new HomePage(webUtil);
//		homePage.ClickOnLeadsModual();
//		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");	
//	}
	@AfterMethod(groups={"smoke","regrassion"})
	public void logOutVtiger() {
		homePage=new HomePage(webUtil);
		homePage.signOut();
	}
	@AfterClass(groups={"smoke","regrassion"})
	public void windowClose() {
		webUtil.threadSleep(2);
		webUtil.closeBrowser();
	}
	
}