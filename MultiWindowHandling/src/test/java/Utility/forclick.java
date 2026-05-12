package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forclick {
	WebDriver driver;
	public static void main(String[] args) {

	

	}
	public void TC_01() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement	loginclick=expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		
		if(loginclick.isDisplayed()&&loginclick.isEnabled()) {
			loginclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}


	}
	public void TC_02() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement weclicklogin=expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));

		if(weclicklogin.isDisplayed()&&weclicklogin.isEnabled()) {
			weclicklogin.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
		
	}
	public void TC_03() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement weclickloginButton=expWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclickloginButton.isDisplayed()&&weclickloginButton.isEnabled()) {
			weclickloginButton.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_04() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_05() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement weclick=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_06() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_07() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_08() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}
	public void TC_09() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		
		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
		
	}
	public void TC_10() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebDriverWait expwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement weclick=expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));

		if(weclick.isDisplayed()&&weclick.isEnabled()) {
			weclick.click();
			System.out.println("Element Clickable");
		}else {
			System.out.println("Element not Clickable");
		}
	}

}
