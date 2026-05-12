package org.infoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rigvee.infoProject.WebUtil;


public class LeadsCreatePage extends basePages{
	WebUtil webUtil;
	
	public LeadsCreatePage(WebUtil weUtil) {
		super(weUtil);
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}
	
	
@FindBy(xpath="//select[@name='salutationtype']")
public  WebElement firstNameTitle;
@FindBy(xpath="//input[@name='firstname']")
public WebElement firstName;

@FindBy(xpath="//input[@name='lastname']")
public WebElement lastName;

@FindBy(xpath="//input[@name='company']")
public WebElement companyName;

@FindBy(xpath="//input[@name='designation']")
public WebElement titleName;

@FindBy(xpath="//select[@name='leadsource']")
public WebElement leadScore;

@FindBy(xpath="//select[@name='industry']")
public WebElement industry;

@FindBy(xpath="//input[@name='phone']")
public WebElement phoneNumber;

@FindBy(xpath="//input[@name='mobile']")
public WebElement mobileNumber;

@FindBy(xpath="//input[@name='fax']")
public WebElement faxNumber;

@FindBy(xpath="//input[@name='email']")
public WebElement emailID;

@FindBy(xpath="//input[@name='website']")
public WebElement websiteName;

@FindBy(xpath="//select[@name='leadstatus']")
public WebElement leadStatus;

@FindBy(xpath="//select[@name='rating']")
public WebElement rating;

@FindBy(xpath="//input[@name='annualrevenue']")
public WebElement annualrevenue;

@FindBy(xpath="//input[@name='noofemployees']")
public WebElement noOfEmployee;

@FindBy(xpath="//input[@name='secondaryemail']")
public WebElement secondryEmail;

@FindBy(xpath="//textarea[@name='lane']")
public WebElement streetName;

@FindBy(xpath="//input[@name='pobox']")
public WebElement POBoxAdd;

@FindBy(xpath="//input[@name='code']")
public WebElement postalCode;

@FindBy(xpath="//input[@name='city']")
public WebElement cityAddress;

@FindBy(xpath="//input[@name='country']")
public WebElement countryName;

@FindBy(xpath="//input[@name='state']")
public WebElement stateName;

@FindBy(xpath="//textarea[@name='description']")
public WebElement discription;

@FindBy(xpath="//input[@accesskey='S']")
public WebElement saveButton;

@FindBy(xpath="//input[@accesskey='X']")
public WebElement cancleButton;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
public WebElement hoverForLogout;

@FindBy(xpath="//a[text()='Sign Out']")
public WebElement signOut;








public void signOut() {
	webUtil.actions_MovetoElement(hoverForLogout);
	webUtil.click(signOut);
}

public void firstNameTitle(String selectByVisibleText) {
	webUtil.selectByVisibleText(firstNameTitle, selectByVisibleText);	
}
public void firstNameTextBox(String firstNameValue) {
	webUtil.sendKeys(firstName,firstNameValue);
}
public void lastNameTextBox(String lastNameValue) {
	webUtil.sendKeys(lastName,lastNameValue);
}
public void CompanyTextBox(String companyNameValue) {
	webUtil.sendKeys(companyName,companyNameValue);
}
public void titleNameTextBox(String titleNamevalue) {
	webUtil.sendKeys(titleName,titleNamevalue);
}
public void leadScoreName(String selectByVisibleText) {
	webUtil.selectByVisibleText(leadScore, selectByVisibleText);
}
public void industryName(String selectByVisibleText) {
	webUtil.selectByVisibleText(industry, selectByVisibleText);
}
public void phoneNumberTextBox(String phoneNumberValue) {
	webUtil.sendKeys(phoneNumber,phoneNumberValue);
}
public void mobileTextBox(String mobileNumberValue) {
	webUtil.sendKeys(mobileNumber,mobileNumberValue);
}
public void faxTextBox(String faxvalue) {
	webUtil.sendKeys(faxNumber,faxvalue);
}
public void emailIdTextBox(String emailIDValue) {
	webUtil.sendKeys(emailID,emailIDValue);
}
public void websiteNameTextBox(String websiteValue) {
	webUtil.sendKeys(websiteName,websiteValue);
}

public void leadStatusName(String selectByVisibleText) {
	webUtil.selectByVisibleText(leadStatus, selectByVisibleText);
}

public void ratingStatus(String selectByVisibleText) {
	webUtil.selectByVisibleText(rating, selectByVisibleText);
}


public void annualRevenueTextBox(String annualRevenueValue) {
	webUtil.clear(annualrevenue);
	webUtil.sendKeys(annualrevenue,annualRevenueValue);
}
public void noOfEmplyeeTextBox(String noOfEmployeevalue) {
	webUtil.clear(noOfEmployee);
	webUtil.sendKeys(noOfEmployee,noOfEmployeevalue);
}
public void secondryEmailTextBox(String secondryEmailValue) {
	webUtil.sendKeys(secondryEmail,secondryEmailValue);
}
public void addressInformation(String streetNameValue,String POBox,String postalCodeNum,String city,String StateName,String country) {
	webUtil.sendKeys(streetName,streetNameValue);
	webUtil.sendKeys(POBoxAdd,POBox);
	webUtil.sendKeys(postalCode,postalCodeNum);
	webUtil.sendKeys(cityAddress,city);
	webUtil.sendKeys(stateName,StateName);
	webUtil.sendKeys(countryName,country);
}
public void discriptionTextBox(String discriptionValue) {
	webUtil.sendKeys(discription,discriptionValue);
}
public void saveButton() {
	webUtil.click(saveButton);
}
public void cancleButton() {
	webUtil.click(cancleButton);
}

}
