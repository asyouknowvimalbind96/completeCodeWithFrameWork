package oopsReletedScenario;

import org.openqa.selenium.By;

public class ForContactsTest extends LoginClass {

	public static void main(String[] args) throws InterruptedException {
		
		Contact();	
	}
	public static void Contact() throws InterruptedException {
		//ForContactsTest contacts=new ForContactsTest();
		//contacts.login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7800628135");
		driver.findElement(By.xpath("/input[@accesskey='S']")).click();
	}
}
