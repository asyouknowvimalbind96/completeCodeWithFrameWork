package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginLunching {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		String url="http://www.gmail.com/";
		driver.get(url);
		By obj1=By.name("identifier");
		
		WebElement enterEmailId= driver.findElement(obj1);
		enterEmailId.sendKeys("ramvimal7800@gmail.com");
		
		By obj2=By.xpath("(//span[@jsname='V67aGc']) [2]");
		WebElement clickNextButton=driver.findElement(obj2);
		clickNextButton.click();
	}

}
