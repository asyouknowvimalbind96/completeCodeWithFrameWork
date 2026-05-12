package learnSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlePractice {
	static WebDriver driver;
	
	
	public void GoToWindow(String TitleName) {
		Set<String> feedbackWindow=driver.getWindowHandles();
				
				for(String allHandleValue:feedbackWindow) {
					driver.switchTo().window(allHandleValue);
					String titleofwindow=driver.getTitle();
					if(titleofwindow.contains(TitleName)) {
						break;
					}
				}
			}
	public void GoToMainWindow() {
		Set<String>feedbackWindow=driver.getWindowHandles();
		for(String allHandleValue:feedbackWindow) {
			driver.switchTo().window(allHandleValue);
			String titleofwindow=driver.getTitle();
			if(titleofwindow.contains("Home")) {
				break;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
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
		WindowHandlePractice practice=new WindowHandlePractice();
		practice.GoToWindow("feedback.php");
		WebElement wetextArea=driver.findElement(By.xpath("//textarea[@name='description']"));
		wetextArea.sendKeys("your service is very fast");
		practice.GoToMainWindow();
		Thread.sleep(3000);
		WebElement weorgnaze=driver.findElement(By.xpath("//a[text()='Organizations']"));
		weorgnaze.click();
	}

	
	
	
}
