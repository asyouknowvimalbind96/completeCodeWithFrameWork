package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPractice1 {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("http:www.flipkart.com");
		
		driver.findElement(By.xpath("//form[@class='_2rslOn header-form-search']//div[@class='_2SmNnR']//input")).sendKeys("Defendor Car");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		act.scrollByAmount(0, 1500).build().perform();
		
		WebElement wefirstName=driver.findElement(By.xpath("//div[text()='₹591']//ancestor::div[@class='RGLWAk']//a[@class='pIpigb']"));
		String strName=wefirstName.getText();
		
		
		
		System.out.println(strName);
		
		
		
		
		
		
		
		
		
		
	}

}
