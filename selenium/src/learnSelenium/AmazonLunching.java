package learnSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLunching {

	public static void main(String[] args) {
     new AmazonLunching();
		ChromeDriver driver=new ChromeDriver();
		String url="http://www.Amazon.com";
		driver.get(url);

		try {
			driver.findElement(By.name("field-keywords")).sendKeys("iphone 15 pro max");
			System.out.println("successfully entered iphone pro max  on search button");

		}catch(NoSuchElementException e) {
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));
			wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@value='Go']")));
			driver.findElement(By.name("field-keywords")).sendKeys("iphone 15 pro max");
			
		}catch(StaleElementReferenceException e) {
			driver.findElement(By.xpath("//input[@value='Go']")).click();

		}catch(ElementNotInteractableException e) {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value='iphone 15 pro max'", driver.findElement(By.xpath("//input[@value='Go']")));
		}
		
		
		

		try {
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			System.out.println("successfully clicked on search button");

		}catch(NoSuchElementException e) {
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(60));
			wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@value='Go']")));
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			
		}catch(StaleElementReferenceException e) {
			driver.findElement(By.xpath("//input[@value='Go']")).click();

		}catch(ElementNotInteractableException e) {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click", driver.findElement(By.xpath("//input[@value='Go']")));
		}catch(Exception e) {
			System.out.println("");
			
		}
		
		
		


		


		/* sabse pahale ham chromeDriver ka object bana kar ke lunch kiye hai
		 *  
		 * fir ham ek String class ka object bana kar ek url name
		 *  ke variable me amazon ka URL store kiye hai fir ham 
		 *  chromeDriver ke object ke Reference ke sath dot laga kar 
		 *  chromeDriver ke ek "Get"method  ko call kiye hai aur fir parameter 
		 *  me ham String class ka object bhejte hai 
		 *  
		 *  fir ham By class object banata nahi hai lekin alag tarike se By class 
		 *  ka object bana ke ham By class ke static "name"  naam ke method ko call
		 *  kiye hai aur usame ham parameter me String class ka object bhejte hai 
		 *  String class ke object matlab  "Atribute ki value bhejte hai "
		 *  
		 *  fir ham 
		 *  chromeDriver ke object ke Reference ke sath dot laga kar 
		 *  chromeDriver ke ek "findElement "naam ke method  ko call kiye hai aur fir parameter 
		 *  me ham String class ka object bhejte hai jo ki hamane upar vali line me
		 *  object bana ke usme uska variable daal diye hai aur fir findElement
		 *  WebElement class ka object return karta hai tab ham esiliye uska type
		 *  WebElement dete hai fir ham use kisi variable me store kar lete hai 
		 *  
		 *  
		 *  
		 *  
		 *   
		 * 
		 * 
		 * 
		 */


	}

}
