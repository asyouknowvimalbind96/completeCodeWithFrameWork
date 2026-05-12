package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathPractice_By_Rahul_Sir {

	public static void main(String[] args) throws InterruptedException {
		
		XpathPractice();
		
		//testA();
		
		//orangeHRM();
		
		
		
	}
	
	public static void XpathPractice() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		WebElement weUserName=driver.findElement(By.xpath("//form[@name='DetailView']//input[@name='user_name']"));
		weUserName.sendKeys("admin");
	
		WebElement wePassword=driver.findElement(By.xpath("//form[@name='DetailView']//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
	
		WebElement weLogin=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='submitButton']"));
		weLogin.click();
	
//		WebElement weLeads=driver.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[4]/a"));
//		weLeads.click();
	
	
	
	
	
	
	
	
	}
	public static void testA() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions actobj=new Actions(driver);
		
//		WebElement wehideAd=driver.findElement(By.xpath("//span[contains(@class,'__close')]"));
//		wehideAd.click();
		
		WebElement weMobile=driver.findElement(By.xpath("//input[@class='font14 fullWidth']"));
		Thread.sleep(2000);
		actobj.click().sendKeys(weMobile,"1234566777").build().perform();

		

		
//		WebElement weContinue=driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
//		weContinue.click();
//		
//		
//		WebElement weFlight=driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chFlights active')]"));
//		weFlight.click();
//		Thread.sleep(2000);
//		actobj.click(weFlight).build().perform();
	
		
	}
	public static void orangeHRM() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement weUserName=driver.findElement(By.xpath("//input[contains(@placeholder,'U')]"));
		weUserName.sendKeys("Admin");
		
		WebElement wePassword=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		wePassword.sendKeys("admin123");
		
		WebElement loginClick=driver.findElement(By.xpath("//button[starts-with(@type,'submit')]"));
		loginClick.click();

	}
	
	public static void ttry() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		
	
		List<WebElement> wePassword=driver.findElements(By.xpath("//form[@name='DetailView']//input[@name='user_password']"));
		((WebElement) wePassword).sendKeys("admin1");
	
		WebElement weLogin=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='submitButton']"));
		weLogin.click();
	}
	
}
