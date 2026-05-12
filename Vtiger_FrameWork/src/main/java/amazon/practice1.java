package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Actions act=new Actions(driver);
		WebElement weScroll=driver.findElement(By.xpath("//span[text()='Deals & Discounts']"));
		act.scrollToElement(weScroll).build().perform();
		WebElement weMinPrice=driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
		Thread.sleep(4000);
		//act.clickAndHold(weMinPrice).build().perform();
		for(int i=0;i<55;i++) {
			weMinPrice.sendKeys(Keys.ARROW_RIGHT);
		}
		WebElement weMax=driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
		for(int i=0;i<105;i++) {
			weMax.sendKeys(Keys.ARROW_LEFT);
		}
		
		
	}

}
