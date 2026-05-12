package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.WebUtils;

public class LoginPage {

	public WebUtils webUtils;

	public LoginPage(WebUtils webUtils){
		this.webUtils=webUtils;    
		PageFactory.initElements(webUtils.getDriver(), this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UserName;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement userPassword;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;


	public void loginWithValidCredential(String username,String password) {
		webUtils.sendKeys(UserName, username);
		webUtils.sendKeys(userPassword, password);
		webUtils.click(loginButton);
	}
	
	public void loginWithInvalidCredential(String username,String password) {
		webUtils.sendKeys(UserName, username);
		webUtils.sendKeys(userPassword, password);
		webUtils.click(loginButton);
	}
	



}
