package Org.Vtiger.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class HomePage {

public WebUtil webUtil;
public HomePage(WebUtil weUtil){
	this.webUtil=weUtil;
	PageFactory.initElements(webUtil.getDriver(), this);
}

	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement calendarModual;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgModual;
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadsModual;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactModual;

	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement validateforHomeText;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	
	public void signOut() {
		//webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.threadSleep(1);
		webUtil.jsClick(signOut);
	}
	
	public void validateTextByContainst(String expectedText,String message) {
		webUtil.validateGetTextContains(validateforHomeText, expectedText, message);
	}
	
	
	public void ClickOnLeadsModual() {
		webUtil.click(leadsModual);
	}
	public void clickOnCalendarModual() {
		webUtil.click(calendarModual);
	}
	public void ClickOnContactModual() {
		webUtil.click(contactModual);
	}
	public void ClickOnOrgModual() {
		webUtil.click(orgModual);
	}
	public void validateEquals(String expectedText,String message) {
		webUtil.validateGetTextEquals(validateforHomeText,expectedText,message);
	}
	
	public void validateHomePageURLContains(String expectedURL,String message) {
		webUtil.validateURLContains(expectedURL, message);
	}
	
}
