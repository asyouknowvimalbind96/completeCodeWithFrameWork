package eva.practicetestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Eva.Vtiger.utils.WebUtil;
import Org.Vtiger.Pages.HomePage;
import Org.Vtiger.Pages.LeadsCreatePage;
import Org.Vtiger.Pages.LeadsDetailsPage;
import Org.Vtiger.Pages.Leads_Landing_Page;
import Org.Vtiger.Pages.LoginPage;



public class PracticeTestNG {
	 WebUtil webUtil;
	 LoginPage loginPage;
	 HomePage homePage;
	
	@BeforeMethod
	public void beforeMethod() {
		webUtil=new WebUtil();
		webUtil.launchBrowser("chrome");
		webUtil.getURL("http://localhost:8888/");
		loginPage=new LoginPage(webUtil);
		loginPage.login_With_Valid_Credentials("admin", "admin1");
	}
	
	@Test
	public void TC001_LoginAndVerifyHomePage()  {
		webUtil.validateURLContains("index.php?action=index&module=Home", "Verify Home Page ");
	}
	@Test
	public void TC002_LogoutAndVerifyLoginPage() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "Home Page ");
		homePage=new HomePage(webUtil);
		webUtil.validateURLContains("php?action=Login&module=Users", "Login Page ");
		
	}
	@AfterMethod
	public void after_Method() {
		webUtil.threadSleep(3);
		homePage.signOut();
		webUtil.threadSleep(3);
		webUtil.closeBrowser();
	}

	@Test
	public  void TC003_LeadCreateWithMandatoryFieldAndVerifyLead() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "Home Page ");
		HomePage homePage=new HomePage(webUtil);
		homePage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "LeadLanding Page ");
		Leads_Landing_Page leadPage=new Leads_Landing_Page(webUtil);
		leadPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		LeadsCreatePage createPage=new LeadsCreatePage(webUtil);
		createPage.lastNameInputField("Bind");
		createPage.CompanyName("Eva");
		createPage.saveButton();
		LeadsDetailsPage leadDetailPage=new LeadsDetailsPage(webUtil);
		leadDetailPage.validateLeadDetailsByContains("Lead Information", "verify new Lead Create Successfull");
	}
	@Test
	public void TC004_LeadCreateWithAllFieldAndVerifyLead() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verify Home Page ");
		HomePage homePage=new HomePage(webUtil);
		homePage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		Leads_Landing_Page leadLandingPage=new Leads_Landing_Page(webUtil);
		leadLandingPage.clickOnLeadCreateButton();
		webUtil.validateURLContains("EditView&return_action=DetailView&parenttab=Marketing", "LeadCreate Page ");
		LeadsCreatePage createPage=new LeadsCreatePage(webUtil);
		createPage.firstNameTitle("Mr.");
		createPage.firstNameTextBox("vimal");
		createPage.lastNameInputField("Bind");
		createPage.CompanyName("Eva");
		createPage.titleNameTextBox("Qa");
		createPage.emailIdTextBox("vimal@gmail.com");
		createPage.leadScoreName("Employee");
		createPage.industryName("Banking");
		createPage.annualRevenueTextBox("1999");
		createPage.noOfEmplyeeTextBox("12");
		createPage.secondryEmailTextBox("rrrr@gmail.com");
		createPage.phoneNumberTextBox("+91 020 8090 9999");
		createPage.mobileTextBox("7800618135");
		createPage.faxTextBox("asdfg@fax.com");
		createPage.websiteNameTextBox("www.eva.com");
		createPage.leadStatusName("Cold");
		createPage.ratingStatus("Active");
		createPage.addressInformation("nigoh road", "nigoh", "222162", "jaunput", "U.P", "india");
		createPage.discriptionTextBox("I think this code is proper Running according  ");
		createPage.saveButton();
		LeadsDetailsPage leadDetailPage=new LeadsDetailsPage(webUtil);
		leadDetailPage.validateLeadDetailsByContains("Lead Information", "new Lead Create Successfull");
	}
	//@Test
	public void TC005_DeleteLeadAndVerifyLead() {
		webUtil.validateURLContains("index.php?action=index&module=Home", "verif Home Page ");
		HomePage homePage=new HomePage(webUtil);
		homePage.ClickOnLeadsModual();
		webUtil.validateURLContains("module=Leads&action=index", "verify LeadLanding Page ");
		
		
		
	}
}