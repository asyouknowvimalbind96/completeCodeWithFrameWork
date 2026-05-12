package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaping {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
//		WebElement wedismiss=driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]"));
//		wedismiss.click();
		WebElement weinput=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weinput.sendKeys("i phone 15 pro");
		WebElement wesearchClick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		wesearchClick.click();
		WebElement weFindAmount=driver.findElement(By.xpath("//div[@data-cy='price-recipe']//span[@class='a-price']//span[text()='42,022']"));
		String firstProductAmount=weFindAmount.getText();
		System.out.println(firstProductAmount);
		
		
		
		
		
		
		
		 
	}

}
