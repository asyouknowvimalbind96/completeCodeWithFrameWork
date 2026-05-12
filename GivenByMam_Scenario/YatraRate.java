package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YatraRate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions actobj=new Actions(driver);
		
		Thread.sleep(2000);

		WebElement wehideAd=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		wehideAd.click();

		WebElement weContinue=driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
		weContinue.click();
		
		
		WebElement weFlight=driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chFlights active')]"));
		weFlight.click();
		Thread.sleep(2000);
		actobj.click(weFlight).build().perform();
		
		
		
	}

}
