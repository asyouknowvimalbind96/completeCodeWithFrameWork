package oopsReletedScenario;

import org.openqa.selenium.By;

public class LeadTest extends LoginClass{

	public static void main(String[] args) throws InterruptedException {
		lead();
		
	}
	public static void lead() throws InterruptedException {
		
		//LoginClass lead=new LeadTest();
		//lead.login();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vimal Bind");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("EVA");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
	}

}
