package eva.practicetestNG;


import Org.Eva.Vtiger.utils.WebUtil;
import amazon.AmazonHomePage;
import amazon.ProductPage;

public class AmazonScenario {


	public static void main(String[] args) {
		WebUtil obj=new WebUtil();
		obj.launchBrowser("chrome");
		AmazonHomePage homePage=new AmazonHomePage(obj);
		ProductPage productdetails=new ProductPage(obj) ;

		
		obj.getURL("http://amazon.com/");

		
		homePage.homePageSendKeys("");
		homePage.clickOnSearchbutton();
		productdetails.clickOnProductModual();
		
		
		

	}

}
