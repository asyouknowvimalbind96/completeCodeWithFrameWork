package oopsReletedScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrgTest extends login_And_Logout {

	public static void main(String[] args) throws InterruptedException{
		OrgTest for_org=new OrgTest();
		for_org.CreateOrganization();
	}
	public void CreateOrganization() throws InterruptedException {
		//OrgTest orgObj=new OrgTest();
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Vimal bind");	
		WebElement weIndustry=driver.findElement(By.xpath("//select[@name='industry']"));
		Select selobj=new Select(weIndustry);
		selobj.selectByIndex(2);
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		Thread.sleep(2000);
		logout();
		
		
		
	}
}
