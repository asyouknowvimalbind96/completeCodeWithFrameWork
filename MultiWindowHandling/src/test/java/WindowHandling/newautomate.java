package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class newautomate {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		Actions act=new Actions(driver);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//table[@class='small homePageButtons']//td//img[@src='themes/softed/images/tbarChat.gif']")).click();
		Set<String> all_handleValue=driver.getWindowHandles();
		for(String handle:all_handleValue) {
			driver.switchTo().window(handle);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("http://localhost:8888/index.php?module=Home&action=vtchat")) {
				break;
			}
		}
		WebElement weinputbox = driver.findElement(By.xpath("//input[@name='input']"));
		Thread.sleep(3000);
		act.moveToElement(weinputbox).build().perform();
		Thread.sleep(2000);
		weinputbox.sendKeys("my name is vimal bind i am currently working as a software tester");

		all_handleValue=driver.getWindowHandles();
		for(String handle:all_handleValue) {
			driver.switchTo().window(handle);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("index.php")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

	}

}
