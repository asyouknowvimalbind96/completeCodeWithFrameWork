package org.infoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.rigvee.infoProject.WebUtil;

public class basePages {
public WebUtil webUtil;
	public basePages(WebUtil weUtil) {
		this.webUtil=weUtil;
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	
	
	
	
	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.click(signOut);
	}
	
	
	
}
