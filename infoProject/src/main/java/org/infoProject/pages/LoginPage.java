package org.infoProject.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rigvee.infoProject.WebUtil;



public class LoginPage {
	public WebUtil webUtil;
	public LoginPage(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	public WebElement userName;

	@FindBy(xpath="//input[@name='user_password']")
	public WebElement userPassword;

	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginButton;

	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement home;

	
	public void verifyByText(String expectedText,String message) {
		webUtil.validateGetTextContains(home, expectedText, message);
	}
	
	public void login_With_Valid_Credentials(String userNameValue,String userPasswordValue) {
		webUtil.sendKeys(userName, userNameValue);
		webUtil.sendKeys(userPassword, userPasswordValue);
		webUtil.click(loginButton);
	}
	public void login_With_Invalid_Credentials(String userNameValue,String userPasswordValue) {
		webUtil.sendKeys(userName, userNameValue);
		webUtil.sendKeys(userPassword, userPasswordValue);
		webUtil.click(loginButton);

	}


}
