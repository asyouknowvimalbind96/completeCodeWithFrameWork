package amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);

		Actions actObj=new Actions(driver);


		WebElement min =driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
		actObj.scrollToElement(min).build().perform();
		actObj.clickAndHold(min).build().perform();
		for(int i=0;i<5;i++) {
			min.sendKeys(Keys.ARROW_RIGHT);
		}
		actObj.release(min).build().perform();

		WebElement max =driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
		actObj.clickAndHold(max).build().perform();
		for(int i=0;i<15;i++) {
			max.sendKeys(Keys.ARROW_LEFT);
		}
		actObj.release(max).build().perform();
		
		driver.findElement(By.xpath("//span[text()='8 GB']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[starts-with(text(),'Dell 14, Intel 14th Generation Intel Core 5, (16GB DDR5, 512GB) FHD+ 14\"/35.56cm 300 Nits, Backlit Keyboard ')]")).click();
		
		Set<String> handles=driver.getWindowHandles();
		for(String value:handles) {
			driver.switchTo().window(value);
			if(driver.getCurrentUrl().contains("Dell-Gen")) {
				break;
			}
		}
		
		WebElement laptop= driver.findElement(By.xpath("//span[@id='productTitle']"));
		if(laptop.isDisplayed()) {
			System.out.println("Validation passed");
		}else {
			System.out.println("Validation failed");
		}
	}

}
