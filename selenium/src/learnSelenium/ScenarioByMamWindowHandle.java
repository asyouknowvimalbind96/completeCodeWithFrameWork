package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioByMamWindowHandle {

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
		//WebElement weHelpButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
		//act.moveToElement(weHelpButton).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor jare=(JavascriptExecutor)driver;
		WebElement weClickFeedBack=driver.findElement(By.xpath("//a[text()='Feedback']"));
		jare.executeScript("arguments[0].click();", weClickFeedBack);
		WebElement ReweHelpButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
		act.moveToElement(ReweHelpButton).build().perform();
		 WebElement weclickHelp=driver.findElement(By.xpath("//a[text()='Help']"));
		 weclickHelp.click();
		
		
		

	}

}
