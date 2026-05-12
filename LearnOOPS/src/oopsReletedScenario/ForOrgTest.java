package oopsReletedScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ForOrgTest extends LoginClass{

	public static void main(String[] args) throws InterruptedException {
		Organizations();
	}
	public static void Organizations() throws InterruptedException {
		
		//ForOrgTest orgobj=new ForOrgTest();
	//	orgobj.login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Vimal");	
		WebElement weIndustry=driver.findElement(By.xpath("//select[@name='industry']"));
		Select selobj=new Select(weIndustry);
		selobj.selectByIndex(2);
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		
	}

}
