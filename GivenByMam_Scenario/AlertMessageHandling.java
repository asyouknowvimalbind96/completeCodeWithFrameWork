package GivenByMam_Scenario;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AlertMessageHandling {

	public static void main(String[] args) throws InterruptedException {
		//Scenario_1_();
		Scenario_2_();





	}
	public static void Scenario_1_() throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Alert alrt= driver.switchTo().alert();
		String popupMessageText=alrt.getText();
		System.out.println("it's Text of Popup Message--   "+popupMessageText);
		Thread.sleep(2000);
		alrt.accept();
		String SecondPopMessage=alrt.getText();
		System.out.println("It's Second Text of Popup Message Only for OK  -- "+SecondPopMessage);
		Thread.sleep(2000);
		alrt.accept();




	}
	public static void Scenario_2_() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://localhost:8888/");
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		Alert alrt=driver.switchTo().alert();
	
		String foundTextonPopup=alrt.getText();
		System.out.println("print popup message ----  "+foundTextonPopup);
		Thread.sleep(2000);
		String pageTitle=driver.getTitle();
		System.out.println("page title before clicking ok  -- "+pageTitle);
		alrt.accept();
		String pageTitleafterclickingOk=driver.getTitle();
		System.out.println("page title of after clicking ok -- "+pageTitleafterclickingOk);
		
		
		
		
	}
}
