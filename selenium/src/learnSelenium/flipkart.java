package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.instagram.com/");
		WebElement instausername=driver.findElement(By.name("username"));
		instausername.click();
		instausername.sendKeys("vimalbind96");
		
		WebElement instaPassword=driver.findElement(By.name("password"));
		instaPassword.click();
		instaPassword.sendKeys("Vimal@723701");
		
		WebElement clicklogon =driver.findElement(By.xpath("(//div[@class='html-div xexx8yu xyri2b x18d9i69 x1c1uobl x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw x1xmf6yo x1e56ztr x11hdunq x11gldyt x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]"));
		clicklogon.click();
		
	}

}
