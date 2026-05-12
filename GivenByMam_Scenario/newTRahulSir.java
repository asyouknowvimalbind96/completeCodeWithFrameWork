package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newTRahulSir {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");

		WebElement weLogIn=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogIn.click();

		Thread.sleep(2000);


		WebElement weSearch=driver.findElement(By.xpath("//input[@name='query_string']"));

		act.sendKeys(weSearch, "vimal").build().perform();

		WebElement weFindButton=driver.findElement(By.xpath("//input[@alt='Find']"));
		
		act.moveToElement(weFindButton).build().perform();
		Thread.sleep(2000);
		act.click().build().perform();
		driver.navigate().back();

		Thread.sleep(2000);

		WebElement weVtiger=driver.findElement(By.linkText("vtiger.com"));
		Thread.sleep(2000);

		act.scrollToElement(weVtiger).build().perform();

		Thread.sleep(2000);
		act.scrollByAmount(10, 40).build().perform();

		WebElement weOrginizition=driver.findElement(By.xpath("//a[text()='Organizations']")); 

		act.moveToElement(weOrginizition).build().perform();
		act.clickAndHold().build().perform();
		
		Thread.sleep(2000);
		
		

		WebElement weMore=driver.findElement(By.xpath("//a[text()='More']"));	
		act.moveToElement(weMore).build().perform();

		WebElement weDocument=driver.findElement(By.xpath("//a[text()='Documents']"));
		act.moveToElement(weDocument).build().perform();
		Thread.sleep(2000);
		act.click().build().perform();
		
		WebElement wePlush=driver.findElement(By.xpath("//img[@alt='Create Document...']"));
		
		act.click(wePlush).build().perform();
		
		driver.navigate().back();
		
		WebElement weDraw=driver.findElement(By.xpath("//a[text()='Read License']"));
		act.scrollToElement(weDraw).build().perform();
		act.moveToElement(weDraw);
		
		Thread.sleep(2000);
		driver.navigate().back();
	
		act.scrollByAmount(10, 150).build().perform();
		
		Thread.sleep(3000);
		WebElement weDragAndDrop1=driver.findElement(By.xpath("(//td[@align='left'])[7]"));
		WebElement weDragAndDrop2=driver.findElement(By.xpath("(//td[@align='left'])[11]"));
	
		act.dragAndDrop(weDragAndDrop1, weDragAndDrop2).build().perform();
		
		
	}

}
