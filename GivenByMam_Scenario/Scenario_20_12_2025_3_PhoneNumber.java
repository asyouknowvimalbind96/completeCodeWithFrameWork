package GivenByMam_Scenario;

import org.openqa.selenium.By;

public class Scenario_20_12_2025_3_PhoneNumber extends LoginClass {

	public static void main(String[] args) throws InterruptedException {
		Login();
		driver.findElement(By.xpath("(//a[text()='edit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7800628135");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		

	}

}
