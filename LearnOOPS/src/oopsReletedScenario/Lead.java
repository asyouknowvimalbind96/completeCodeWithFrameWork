package oopsReletedScenario;

import org.openqa.selenium.By;

public class Lead extends login_And_Logout{
	
	public static void main(String[] args) throws InterruptedException {
		Lead lead=new Lead();
		lead.CreatLead();
		
		
	}
	public void CreatLead() throws InterruptedException {
		Lead leadobj=new Lead();
		leadobj.login();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vimal Bind");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("EVA");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		Thread.sleep(4000);
		leadobj.logout();

	}
	
}
