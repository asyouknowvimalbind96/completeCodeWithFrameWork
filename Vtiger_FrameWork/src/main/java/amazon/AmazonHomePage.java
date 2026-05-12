package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class AmazonHomePage {
	WebUtil weutil;
public AmazonHomePage(WebUtil we) {
	this.weutil=we;
	PageFactory.initElements(weutil.getDriver(), this);
}
	

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
private WebElement homepageSearchBox;

@FindBy(xpath="//input[@id='nav-search-submit-button']")
private WebElement clickOnSearchModual;
	
	public void homePageSendKeys(String value) {
		weutil.click(homepageSearchBox);

		weutil.sendKeys(homepageSearchBox, value);
	}
	
public void clickOnSearchbutton() {
//	   WebElement we= driver.findElement(By.xpath(("//input[@name='username']")));
//	   we.sendKeys("");
//	    we.getTagName();
//	
		weutil.click(clickOnSearchModual);
	}
	
}
