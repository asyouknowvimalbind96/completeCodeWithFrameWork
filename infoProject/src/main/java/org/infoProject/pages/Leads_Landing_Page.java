package org.infoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rigvee.infoProject.WebUtil;


public class Leads_Landing_Page {
	WebUtil webUtil;
	
	public Leads_Landing_Page(WebUtil webUtil) {
		this.webUtil=webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}
	
	

	@FindBy(xpath="//img[@alt='Create Lead...']")
	public WebElement plushButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	public WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	public WebElement signOut;

	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.click(signOut);
	}
	
	
	public void clickOnPlusButton() {
		webUtil.click(plushButton);
	}
	
	
	
}
