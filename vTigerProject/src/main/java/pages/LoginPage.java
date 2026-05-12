package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WebUtils;

public class LoginPage {
protected WebUtils utils ;
protected WebDriver driver ;

public LoginPage(WebUtils utils) {
	this.utils = utils ;
	PageFactory.initElements(utils.getDriver(), this);
}

@FindBy(xpath =  "//input[@name='user_name']")
private WebElement userName;

@FindBy(xpath = "//input[@name='user_password']")
private WebElement  passWord ;

@FindBy(xpath = "//input[@id='submitButton']")
private WebElement login ; 


public void validLogin(String userN , String uPass) {
	utils.sendkeys(userName, userN);
	utils.sendkeys(passWord,uPass);
	utils.clickWithActions(login);
	
}

public void inValidLogin(String userN , String uPass) {
	utils.sendkeys(userName, userN);
	utils.sendkeys(passWord,uPass);
	utils.click(login);
}


}
