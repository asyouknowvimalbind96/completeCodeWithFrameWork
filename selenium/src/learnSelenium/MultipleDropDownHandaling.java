package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownHandaling {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();

	driver.get("file:///C:/Users/Vimal%20Bind/Desktop/multiple%20.html");
	
	WebElement weSelectBox=driver.findElement(By.xpath("//select[@name='cars']"));
	
	Select seleobj=new Select(weSelectBox);
	
//	seleobj.selectByIndex(1);
//	Thread.sleep(2000);
//	seleobj.selectByIndex(3);
//	Thread.sleep(2000);
//	seleobj.selectByIndex(0);
//	Thread.sleep(2000);
//	seleobj.selectByVisibleText("Vimal");
//	Thread.sleep(2000);
//	seleobj.selectByValue("neeraj");
//	Thread.sleep(2000);
//	seleobj.selectByValue("dheeraj");
//	Thread.sleep(2000);
//	seleobj.selectByIndex(5);
//	Thread.sleep(2000);
//	seleobj.selectByIndex(4);
//	seleobj.selectByValue("vikash");
//	seleobj.selectByIndex(10);

	seleobj.selectByContainsVisibleText("Volvo");
	seleobj.selectByVisibleText("Opel");
	seleobj.selectByIndex(3);
	}

}
