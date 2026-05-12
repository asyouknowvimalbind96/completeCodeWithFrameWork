package WindowHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitScnarios {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//  implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		//  dynamic wait 
		//Explicit Wait
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		//      Thread.sleep(30000);  ///  static wait   
		////   synchronization 
		WebElement ramSize=driver.findElement(By.xpath("//div[text()='4 GB']/preceding-sibling::div"));
		ramSize.click();
		
		
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");

		
		
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(300));
		
		expWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.name("xyz"))));
        
        
		driver.findElement(By.xpath("hightolow")).click();
		
		
		
		
		
		
		
	}

}
