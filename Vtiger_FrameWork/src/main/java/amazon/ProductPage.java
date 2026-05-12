package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Eva.Vtiger.utils.WebUtil;

public class ProductPage {
	WebUtil weutil;
public ProductPage(WebUtil we) {
	this.weutil=we;
	PageFactory.initElements(weutil.getDriver(), this);
	
}
	@FindBy(xpath="//h2[text()='Results']/ancestor::div[@class='a-section a-spacing-none s-result-item s-flex-full-width s-border-bottom-none s-widget s-widget-spacing-large']/ancestor::div[@class='sg-col-inner']//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")
	private WebElement clickOnProduct;
	
	public void clickOnProductModual() {
		weutil.explicitWait_For_elementToBeClickable(clickOnProduct, 30);
		weutil.click(clickOnProduct);
	}
	
}
