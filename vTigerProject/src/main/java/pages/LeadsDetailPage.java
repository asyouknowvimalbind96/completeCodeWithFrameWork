package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WebUtils;

public class LeadsDetailPage {
	protected WebDriver driver ;
	protected WebUtils utils ;


	
	public LeadsDetailPage(WebUtils utils) {
		this.utils = utils ;
		PageFactory.initElements(utils.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@class='hdrLink']")
	private WebElement leadText ;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLeadButton ;
	
	
	public String  validateLeadPage() {
		
	return 	utils.validationBygetText(leadText);
	
	}
	
	public void validateCreateLeadButton() {
		
		utils.isDisplayed(createLeadButton);
		utils.isEnabled(createLeadButton);
		
	}
	
	public void clickOnCreateLeadButton() {
		
		utils.click(createLeadButton);
	}
}
