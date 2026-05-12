package GivenByMam_Scenario;

import org.openqa.selenium.By;

public class Scenario_20_12_2025_4_CreateLead extends LoginClass{

	public static void main(String[] args) throws InterruptedException {
		Login();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("GoogleIndia");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		
		
	}

}
