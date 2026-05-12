package oopsReletedScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	 static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		login();
		
		
	}
	public static void login() throws InterruptedException{	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin1");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}

}
