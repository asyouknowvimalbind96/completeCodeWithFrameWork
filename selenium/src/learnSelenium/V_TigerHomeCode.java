package learnSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class V_TigerHomeCode {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebElement loginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		loginClick.click();
		WebElement weHelpButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
		act.moveToElement(weHelpButton).build().perform();
		Thread.sleep(2000);
		WebElement weclickFeedback=driver.findElement(By.xpath("//a[text()='Feedback']"));
		weclickFeedback.click();
		
		Set<String>feedback=driver.getWindowHandles();
		for(String AllFeedback:feedback) {
			driver.switchTo().window(AllFeedback);
			String windowhandle=driver.getCurrentUrl();
			if(windowhandle.contains("https://www.vtiger.com/products/crm/feedback.php?uid")) {
				break;
			}
		}
		WebElement wetextBox=driver.findElement(By.xpath("//textarea[@name='description']"));
		wetextBox.sendKeys("my name is vimal chand bind i have completed graduation bsc in 2024");
		
		 feedback=driver.getWindowHandles();
		 for(String AllFeedback:feedback) {
			 driver.switchTo().window(AllFeedback);
			 String windowhandle1=driver.getTitle();
			 if(windowhandle1.contains(" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM")) {
				 break;
			 }
		 }
		 WebElement weMore=driver.findElement(By.xpath(""));
		 act.moveToElement(weMore).build().perform();
		 Thread.sleep(4000);
		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
		
		
		
	}

}
