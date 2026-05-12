package GivenByMam_Scenario;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_Taught_By_Mam{
	
	public void xyz() {
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {

		method();

		//Scenario1();
		
//	}
//	public  Scenario18_09_2025 doubleclick() {
//		int x;
//		return this;
//	}
//
//	public Scenario18_09_2025 moveToElemet() {
//		return this;
//	}
//
//	public Scenario18_09_2025 contextclick() {
//		return this;
//	}
//	public Scenario18_09_2025 build() {
//		return this;
//	}
//	public void perform() {
//
	}











	public static void method() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");
		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogin.click();
		WebElement weObj=driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[11]"));
		Actions actObj=new Actions(driver);
		//mouse hover
		actObj.moveToElement(weObj).build().perform();
		////Right click
		WebElement we_plusbutton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		actObj.contextClick(we_plusbutton).build().perform();

		////
		///////////double click
		Thread.sleep(2000);
		actObj.doubleClick(we_plusbutton).build().perform();
		/////////////// Drag and Drop
		


	}

}

	