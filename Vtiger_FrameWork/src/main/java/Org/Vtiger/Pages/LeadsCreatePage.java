package Org.Vtiger.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class LeadsCreatePage {
	WebUtil webUtil;

	public LeadsCreatePage(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private  WebElement firstNameTitle;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName;

	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleName;

	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadScore;

	@FindBy(xpath="//select[@name='industry']")
	private WebElement industry;

	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneNumber;

	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNumber;

	@FindBy(xpath="//input[@name='fax']")
	private WebElement faxNumber;

	@FindBy(xpath="//input[@name='email']")
	private WebElement emailID;

	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteName;

	@FindBy(xpath="//select[@name='leadstatus']")
	private WebElement leadStatus;

	@FindBy(xpath="//select[@name='rating']")
	private WebElement rating;

	@FindBy(xpath="//input[@name='annualrevenue']")
	private WebElement annualrevenue;

	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployee;

	@FindBy(xpath="//input[@name='secondaryemail']")
	private WebElement secondryEmail;

	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetName;

	@FindBy(xpath="//input[@name='pobox']")
	private WebElement POBoxAdd;

	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;

	@FindBy(xpath="//input[@name='city']")
	private WebElement cityAddress;

	@FindBy(xpath="//input[@name='country']")
	private WebElement countryName;

	@FindBy(xpath="//input[@name='state']")
	private WebElement stateName;

	@FindBy(xpath="//textarea[@name='description']")
	private WebElement discription;

	@FindBy(xpath="")
	private WebElement newDetail;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveButton;

	@FindBy(xpath="//input[@accesskey='X']")
	private WebElement cancleButton;
	
	
	
	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.threadSleep(1);
		webUtil.click(signOut);
	}
	
	public void saveButton() {
		webUtil.click(saveButton);
	}
	public void cancleButton() {
		webUtil.click(cancleButton);
	}

	public void firstNameTitle(String selectByVisibleText) {
		webUtil.selectByVisibleText(firstNameTitle, selectByVisibleText);	
	}
	public void firstNameTextBox(String firstNameValue) {
		webUtil.sendKeys(firstName,firstNameValue);
	}
	public void lastNameInputField(String lastNameValue) {
		webUtil.sendKeys(lastName,lastNameValue);
	}
	public void CompanyName(String companyNameValue) {
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
	

}
