package org.info.infoTestCase;



import org.infoProject.pages.HomePage;
import org.infoProject.pages.LeadsCreatePage;
import org.infoProject.pages.Leads_Landing_Page;
import org.infoProject.pages.LoginPage;
import org.infoProject.pages.basePages;
import org.rigvee.infoProject.WebUtil;


public class TestCaseRun {



	
	public void TC002_withMandatoryFieldonly() {
		WebUtil webUtil=new WebUtil();
		webUtil.launchBrowser("chrome");
		webUtil.getURL("http://localhost:8888/");
		new LoginPage(webUtil).login_With_Valid_Credentials("admin", "admin1");
		new HomePage(webUtil).ClickOnLeadsModual();
		new Leads_Landing_Page(webUtil).clickOnPlusButton();
		LeadsCreatePage createPage=new LeadsCreatePage(webUtil);
		createPage.lastNameTextBox("Bind");
		createPage.CompanyTextBox("Eva");
		//createPage.saveButton();
		
	}
	

	public void TC_001_() throws InterruptedException {
		WebUtil webUtil=new WebUtil();
		webUtil.launchBrowser("chrome");
		new LoginPage(webUtil).login_With_Valid_Credentials("admin", "admin1");
		new LoginPage(webUtil).verifyByText("Home", "Validation for Home page ");
		new HomePage(webUtil).ClickOnLeadsModual();
		new Leads_Landing_Page(webUtil).clickOnPlusButton();
		LeadsCreatePage createPage=new LeadsCreatePage(webUtil);
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
		basePages basepage=new basePages(webUtil);
		basepage.signOut();


	}


	}
