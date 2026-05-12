package Org.Vtiger.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;


public class LoginPage {
	public WebUtil webUtil;
	
	public LoginPage(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userName;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement userPassword;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement home;

	public void login_With_Valid_Credentials(String userNameValue,String userPasswordValue) {
		webUtil.sendKeys(userName, userNameValue);
		webUtil.sendKeys(userPassword, userPasswordValue);
		webUtil.actions_Click(loginButton);
	}
	public void login_With_Invalid_Credentials(String userNameValue,String userPasswordValue) {
		webUtil.sendKeys(userName, userNameValue);
		webUtil.sendKeys(userPassword, userPasswordValue);
		webUtil.click(loginButton);

	}


}
