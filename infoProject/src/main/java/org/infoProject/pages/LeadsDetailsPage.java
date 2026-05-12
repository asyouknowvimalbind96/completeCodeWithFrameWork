package org.infoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rigvee.infoProject.WebUtil;


public class LeadsDetailsPage {
	
	public WebUtil webUtil;
	public LeadsDetailsPage(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	public WebElement LeadsDetails;

	@FindBy(xpath="//input[@accesskey='E']")
	public WebElement editLeadsDetails;

	@FindBy(xpath="//input[@accesskey='U']")
	public WebElement duplicate_LeadsDetails;

	@FindBy(xpath="//input[@accesskey='D']")
	public WebElement delete_LeadsDetails;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	public WebElement hoverForLogout;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	public WebElement signOut;

	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.threadSleep(1);
		webUtil.actions_Click(signOut);
	}


	public void verifyLeadsDetails(String expectedValue,String message) {
		webUtil.validateGetTextContains(LeadsDetails, expectedValue, message);
	}
	public void editLeadsDetails() {
		webUtil.click(editLeadsDetails);
	}
	public void duplicateLeadsDetails() {
		webUtil.click(duplicate_LeadsDetails);
	}
	public void deleteLeadsDetails() {
		webUtil.click(delete_LeadsDetails);
	}



}
