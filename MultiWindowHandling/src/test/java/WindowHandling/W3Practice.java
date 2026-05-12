package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class W3Practice {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		WebElement weRemote=driver.findElement(By.xpath("//img[@class='ntc__chip-logo']/following-sibling::span[text()='Remote']"));
		act.scrollByAmount(0, 650);
		JavascriptExecutor java=(JavascriptExecutor)driver;
		java.executeScript("arguments[0].click();", weRemote);

		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String CurrentUrl=driver.getCurrentUrl();
			if(CurrentUrl.contains("https://www.naukri.com/remote-jobs?src=discovery_trendingWdgt_homepage_srch")) {
				break;
			}
		}
		
		WebElement weClick=driver.findElement(By.xpath("//span[text()='Fresher Jobs']"));
		weClick.click();



	}

}
