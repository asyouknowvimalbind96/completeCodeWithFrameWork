package oopsReletedScenario;

import org.openqa.selenium.By;

public class ContactTest extends login_And_Logout {
   
	public String name;  //  null  
    
	public ContactTest() {
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ContactTest contact=new ContactTest();
		contact.CreateContact();
	}
	public void CreateContact() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		Thread.sleep(2000);
		logout();
	}
}
