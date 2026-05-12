package oopsReletedScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login_And_Logout {
	WebDriver driver;
	Actions act;
	public static void main(String[] args) throws InterruptedException {
		login_And_Logout forlogin_logout=new login_And_Logout();
		forlogin_logout.login();
		forlogin_logout.logout();	
	}
	public void login() throws InterruptedException {	
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		 act=new Actions(driver);
		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		Thread.sleep(1000);
	}
	public void logout() throws InterruptedException {	
		WebElement weadminMouseOver=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		act.moveToElement(weadminMouseOver).build().perform();
		Thread.sleep(2000);
		WebElement welogout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		act.click(welogout).build().perform();
		
		
		
		
		
	}

}
