package WindowHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trrrrrrr {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		
		WebDriverWait Expwait1=new WebDriverWait(driver, Duration.ofSeconds(100));
		Expwait1.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//input[@name='user_name']"), 50));
		weuserName.sendKeys("admin");
		
		
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("");
		
		WebElement weloginButton=driver.findElement(By.xpath("//input[@type='submit']"));
		int expectedXlocation=756;
		int expectedYlocation=313;
		 Point location = weloginButton.getLocation();
		 int xCordinate=location.x;
		 int yCordinate=location.y;
		
		
		if(xCordinate==expectedXlocation) {
			System.out.println("X cordinate Size is matched    Validation Passed ");
		}else {
			System.out.println("X cordinate Size is not matched     Validation Failed");
		}
		
		if(yCordinate==expectedYlocation) {
			System.out.println("Y cordinate Size is matched    Validation Passed ");
		}else {
			System.out.println("Y cordinate Size is not matched     Validation Failed");
		}
		
		

	}

}
