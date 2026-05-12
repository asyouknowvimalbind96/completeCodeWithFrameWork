package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethods.WebUtils;

public class CreateNewLeadPage {
	protected WebDriver driver ;
	protected WebUtils utils ;
	
	public CreateNewLeadPage(WebUtils utils) {
		this.utils = utils ;
		PageFactory.initElements(utils.getDriver(), this);
	}
	
	@FindBy(xpath ="//span[text()='Creating New Lead']")
	private WebElement creatingNewLeadText ;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName ;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName ;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName ;
	
	@FindBy(xpath="//input[@name='assigntype']")
	private WebElement assignToUser ;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement saveLeadButton ;
	
	
	public String  validateCreateNewLeadPage() {
	return 	utils.validationBygetText(creatingNewLeadText);
	}
	
	public void validateSaveButton() {
		utils.isDisplayed(saveLeadButton);
		utils.isEnabled(saveLeadButton);
	}
	
	public void fillFirstName(String firstname) {
		utils.sendkeys(firstName, firstname);
	}
	
	public void fillLastName(String lastname) {
		utils.sendkeys(lastName, lastname);
	}
	
	public void fillCompanyName(String companyname) {
		utils.sendkeys(companyName, companyname);
	}

	public void assignTo() {
		utils.click(assignToUser);
	}
	
	public void clickOnsaveLeadButton() {
		utils.click(saveLeadButton);
	}
}
