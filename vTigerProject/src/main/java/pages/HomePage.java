package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WebUtils;

public class HomePage {

	
	 WebUtils utils ;

	public HomePage(WebUtils utils) {
		this.utils = utils ;
		PageFactory.initElements(utils.getDriver(), this);

	}

	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homeText;

	@FindBy(xpath="//a[text()='Leads']")
	private WebElement lead ;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout ;
	
	public String verifyHomePage() {
		 return utils.validationBygetText(homeText);
	}
	
	
//	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
//	private WebElement hoverForLogout;
//
//	@FindBy(xpath="//a[text()='Sign Out']")
//	private WebElement signOut;


//	public void signOut() {
//		utils.mouseHover(hoverForLogout);
//		utils.ThreadSleep(2);
//		utils.click(signOut);
//	}

	public void validateLeadButton() {
		utils.isDisplayed(lead);
		utils.isEnabled(lead);
	}

	public void clickOnLeadButton() {
		utils.click(lead);

	}
	//	
	public void clickOnSignOutJs() {
		utils.clickWithJS(logout);
	}
	//	
	//	public void clickOnSignOutActions() {
	//		utils.clickWithActions(logout);
	//	}

}
