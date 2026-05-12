package org.infoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rigvee.infoProject.WebUtil;


public class HomePage {
	WebUtil webUtil;
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
	private WebElement ContactModual;

	
	
	
	
	public void verifyByText(WebElement webElement,String expectedText,String message) {
		webUtil.validateGetTextContains(webElement, expectedText, message);
	}
	
	

	public void ClickOnLeadsModual() {
		webUtil.click(leadsModual);
	}
	public void clickOnCalendarModual() {
		webUtil.click(calendarModual);
	}
	public void ClickOnContactModual() {
		webUtil.click(ContactModual);
	}
	public void ClickOnOrgModual() {
		webUtil.click(orgModual);
	}
	
	
	
}
