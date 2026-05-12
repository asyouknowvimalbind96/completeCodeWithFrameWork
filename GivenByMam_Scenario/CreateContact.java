package GivenByMam_Scenario;

import org.openqa.selenium.By;

public class CreateContact extends LoginClass {

	public static void main(String[] args) throws InterruptedException {
		Login();
		for(int i=0;i<5;i++) {
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("EVA Student");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		
		
		
		
		}
		
		
		
		
	}

}
