package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookPractice {

	public static void main(String[] args) {
		ChromeDriver insta=new ChromeDriver();
		insta.get("https://www.Facebook.com/");
		
		WebElement webUser=insta.findElement(By.name("email"));
		webUser.sendKeys("vimalbind");
		
		WebElement webPassword=insta.findElement(By.name("pass"));
		webPassword.sendKeys("Vimal@7800");
		
		WebElement webloginButton=insta.findElement(By.name("login"));
		webloginButton.click();
	}

}
