package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertR {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).sendKeys("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://localhost:8888/");
//		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
//		weuserName.sendKeys("admin");
//		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
//		wePassword.sendKeys("admin1");
//		WebElement loginClick=driver.findElement(By.xpath("//input[@type='submit']"));
//		loginClick.click();
//		
//		String titlehomePage=driver.getTitle();
//		String ExpectedTitle=titlehomePage;
//		
//		if(titlehomePage.equals(ExpectedTitle)) {
//			System.out.println("at home page  validation Passed ");
//		}else {
//			System.out.println("not present home page   validation Failed");
//		}
		
		
		
		
		
//		driver.findElement(By.xpath("//a[text()='Leads']")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
//		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
	}

}
