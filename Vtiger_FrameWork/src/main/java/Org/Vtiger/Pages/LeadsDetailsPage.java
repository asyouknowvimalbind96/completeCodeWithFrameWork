package Org.Vtiger.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class LeadsDetailsPage  {
	
	WebUtil webUtil;
	
	
	public LeadsDetailsPage(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")  // //span[contains(text(),'Lead Information')]
	private WebElement LeadDetail;							

	@FindBy(xpath="//input[@accesskey='E']")
	private WebElement editLeadsDetails;

	@FindBy(xpath="//input[@accesskey='U']")
	private WebElement duplicate_LeadsDetails;

	@FindBy(xpath="//input[@accesskey='D']")
	private WebElement delete_LeadsDetails;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	
	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.threadSleep(1);
		webUtil.click(signOut);
	}

	public void validateLeadDetailsByContains(String expectedValue,String message) {
		webUtil.explicitWait_For_visibilityOf(LeadDetail, 10);
		webUtil.validateGetTextContains(LeadDetail, expectedValue, message);
	}
	
	public void clickOnEditLeadsButton() {
		webUtil.click(editLeadsDetails);
	}
	public void duplicateLeadsDetails() {
		webUtil.click(duplicate_LeadsDetails);
	}
	public void clickOnDeleteLeadButton() {
		webUtil.click(delete_LeadsDetails);
	}



}
