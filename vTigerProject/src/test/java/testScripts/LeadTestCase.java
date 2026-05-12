package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericMethods.WebUtils;
import pages.CreateNewLeadPage;
import pages.HomePage;
import pages.LeadsDetailPage;
import pages.LoginPage;

public class LeadTestCase  {

 WebUtils utils ;

	LoginPage loginObj; 
	HomePage  homeObj ;
	LeadsDetailPage leadsDetailPageObj ;
	CreateNewLeadPage createNewLeadPageObj ;

	@BeforeClass
	public void setUp() {
		utils =	new WebUtils();
		utils.launchBrowser("chrome");
	}
	
	@BeforeMethod
	public void initOject() {
		utils.hitURL("http://localhost:8888/");
		loginObj=new LoginPage(utils) ;
		homeObj=new HomePage(utils) ;
		leadsDetailPageObj  = new  LeadsDetailPage(utils) ;
		createNewLeadPageObj =  new  CreateNewLeadPage(utils);

	}

		@Test
		public void TC001_validLogin()  {
			loginObj.validLogin("admin","admin1");
			
		
		}

	@Test
	public void dummyTest() {
		loginObj.validLogin("admin","admin1");
		System.out.println("Execution trigger"); 
	}
	@Test
	public void TC002_invalidLogin() {
		loginObj.validLogin("admin","admin1");
		//loginObj.inValidLogin("admin", "admin123");
	}

	@Test
	public void TC003_invalidLogin() {
		loginObj.validLogin("admin","admin1");
		//loginObj.inValidLogin("admin123", "admin");
	}

	@Test
	void TC004_invalidLogin() {
		loginObj.validLogin("admin","admin1");
		//loginObj.inValidLogin("admin123", "admin123");
	}

	@Test
	public void TC005_invalidLogin() {
		loginObj.validLogin("admin","admin1");
		//loginObj.inValidLogin("", "admin ") ;
	}

	@Test
	public void TC006_invalidLogin() {
		loginObj.validLogin("admin","admin1");
		//loginObj.inValidLogin("admin", " ");
	}

	@Test
	public void TC007_verifyHomePageAndValidateLead() {
		loginObj.validLogin("admin","admin1");
		String actual =		homeObj.verifyHomePage();
		Assert.assertEquals(actual, "Home");
		homeObj.validateLeadButton();
		homeObj.clickOnLeadButton();
	}


	@Test
	public void TC008_verifyAndClickOnCreateLeadButton() {
		loginObj.validLogin("admin","admin1");
		homeObj.clickOnLeadButton();
		String actual =		leadsDetailPageObj.validateLeadPage();
		Assert.assertEquals(actual, "Leads");
		leadsDetailPageObj.validateCreateLeadButton();
		leadsDetailPageObj.clickOnCreateLeadButton();

	}

	@Test
	public void TC009_verifyCreateNewLeadPageAndCreate() {
		loginObj.validLogin("admin","admin1");
		homeObj.clickOnLeadButton();
		leadsDetailPageObj.clickOnCreateLeadButton();
		String actual =	createNewLeadPageObj.validateCreateNewLeadPage();
		Assert.assertEquals(actual, "Creating New Lead");
		createNewLeadPageObj.fillFirstName("DR.");
		createNewLeadPageObj.fillLastName("Doom");
		createNewLeadPageObj.fillCompanyName("Avengers");
		createNewLeadPageObj.assignTo();
		createNewLeadPageObj.validateSaveButton();
		createNewLeadPageObj.clickOnsaveLeadButton();
	}
	@AfterMethod
	public void logOut() {
		homeObj.clickOnSignOutJs();
	}
	@AfterClass
	public void tierDown() {
		utils.closeBrowser();
	}
}
