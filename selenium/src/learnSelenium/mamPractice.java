package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mamPractice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		By url=By.name("user_name");
		WebElement searchElement=driver.findElement(url);
		searchElement.sendKeys("admin");
		
		By webpassword=By.name("user_password");
		WebElement password= driver.findElement(webpassword);
		password.clear();
		password.sendKeys("admin1");
		
		By obj1=By.xpath("//input[@type=\"submit\"]");
		WebElement weblogin=driver.findElement(obj1);//.click();
		weblogin.click();
		
		
		
		
		
		
		
	}

}
