package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaPractice {
	
	
	public static void main(String[] args) {
		
		
		ChromeDriver insta=new ChromeDriver();
		insta.get("https://www.instagram.com/");
		
		WebElement webUser=insta.findElement(By.name("username"));
		webUser.sendKeys("vimalbind96");
		
		WebElement webPassword=insta.findElement(By.name("password"));
		webPassword.sendKeys("Vimal@.....");
		
		WebElement webloginButton=insta.findElement(By.name("login"));
		webloginButton.click();

	}
		

 }

