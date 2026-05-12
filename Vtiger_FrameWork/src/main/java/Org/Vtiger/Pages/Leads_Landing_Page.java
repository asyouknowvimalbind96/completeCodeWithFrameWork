package Org.Vtiger.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class Leads_Landing_Page {
	WebUtil webUtil;
	public Leads_Landing_Page(WebUtil weUtil) {
		this.webUtil=weUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}



	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement plushButton;

	@FindBy(xpath="//font[text()='Filters :']/ancestor::table[@class='layerPopupTransport']/following-sibling::table[@class='small']//input[@class='crmbutton small delete']")
	private WebElement deleteButtonOnLeadLandingPage;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement hoverForLogout;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;

	@FindBy(xpath="//td[contains(text(),'LEA')]")
	private List<WebElement> allLead;

	@FindBy(xpath="//td[contains(text(),'LEA102')]/following-sibling::td//a[text()='Bind']")
	private WebElement leadLastName;

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchForLead;

	@FindBy(xpath="//input[@name='submit']")
	private WebElement clickOnSearch;

	@FindBy(xpath="//select[@id='viewname']")
	private WebElement dropdownFilter;



	public void clickOnLastNameOfLead() {
		webUtil.click(leadLastName);
	}

	public List<WebElement> allLeadId() {
		webUtil.threadSleep(1);
		List<WebElement> allLeadDetails = webUtil.find_Elements(allLead);
		return allLeadDetails;
	}
	public void clickOnLeadCreateButton() {
		webUtil.click(plushButton);
	}
	public void deleteLead() {
		webUtil.click(deleteButtonOnLeadLandingPage);
	}
	public void signOut() {
		webUtil.actions_MovetoElement(hoverForLogout);
		webUtil.threadSleep(1);
		webUtil.click(signOut);
	}
	public void searchForLead(String valueForSearchLead) {
		webUtil.sendKeys(searchForLead, valueForSearchLead);
	}
	public void clickOnSearchNow() {
		webUtil.click(clickOnSearch);
	}
	public void selectValueInFilter(String selectbyVisibleText) {
		webUtil.selectByVisibleText(dropdownFilter, selectbyVisibleText);
	}

	public void validateTitleByContains(String expectedTitle,String message) {
		webUtil.validateTitleContains(expectedTitle, message);
	}

	public void validateTitleByEquals(String expectedTitle,String message) {
		webUtil.validateTitleEquals(expectedTitle, message);
	}
	
	public void validateURLByEquals(String expectedTitle,String message) {
		webUtil.validateURLequals(expectedTitle, message);
	}
	public void validateLeadLandingPageURLByContains(String expectedTitle,String message) {
		webUtil.validateURLContains(expectedTitle, message);
	}

}
