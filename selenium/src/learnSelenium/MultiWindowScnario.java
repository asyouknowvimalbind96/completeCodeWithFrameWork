package learnSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiWindowScnario {

	public static void main(String[] args) throws IOException {
		//  File 
		
//		File fobj=new File("C:\\Users\\Vimal Bind\\Desktop\\rahul\\david\\john");
//		fobj.mkdirs();
		
		File fileObj=	new File("C:\\Users\\Vimal Bind\\Desktop\\intro.txt");
		boolean status=fileObj.exists();
		if(status==true) {
			System.out.println("faile hai");
		}else {
			System.out.println("File nhi hai");
		}
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost:8888/");
	
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		
		WebElement searchElement=driver.findElement(By.name("user_name"));
		
		jse.executeScript("arguments[0].value='admin'", searchElement);
		driver.findElement(By.name("user_password")).sendKeys("fstyagdxavhbvhhgfhgchgchgchgcghcgchchchgcgcgfcgchchgchhhhdhsvfhsahcvsahvcdsvhdhgivfzesxdrcfvu ghjkmqzxercdtfvbyghnjmzexrcdtfvybghunjmxrctvfybguhnijmk,qzwxecrvbyunimaswdefrtghjmo,asdfrgtyh");
//		WebElement password= driver.findElement(By.name("user_password"));
//        jse.executeScript("arguments[0].value='admin1gfgdgfcgcytcugvygvcgcgycuctucutctctrctctyvgbhjkjndde5rfvbuhnijmklderfgtyhnmky7ihkhesrrvgbhnjxcvbnjxcvtbynm4rbm,ertynmeryumi,rtghyujki3fghjkidfghujiko'", password);
//		
		TakesScreenshot tss= (TakesScreenshot)driver;
		File srcFile=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\Vimal Bind\\Desktop\\first.png");
		FileUtils.copyFile(srcFile, target);
		
		
		WebElement weblogin=driver.findElement(By.xpath("//input[@type='submit']"));//.click();
        jse.executeScript("arguments[0].click()", weblogin);
		
		//  scroll by pixel
      //  jse.executeScript("window.scrollTo(0, 2200)");
       WebElement weVtiger= driver.findElement(By.linkText("vtiger.com"));
       
       // scrollto element
        jse.executeScript("arguments[0].scrollIntoView(true);", weVtiger);
       
        //  scroll to bottom
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Actions act=new Actions(driver);
		
		WebElement we=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
        jse.executeScript("var event = new MouseEvent"
        		+ "('mouseover', { 'view': window, 'bubbles': true, 'cancelable': true });"
        		+ " arguments[0].dispatchEvent(event);", we);
		
		//driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		
        
        
		
		WebElement weFeedback=driver.findElement(By.xpath("//a[text()='Feedback']"));
		
		//  java script click -  jsclick
	
		jse.executeScript("arguments[0].click()", weFeedback);
		
		
		
		
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"))).build().perform();
		driver.findElement(By.linkText("Help")).click();
		
		///  2 
		
		driver.getWindowHandle();
		
		Set<String> handleValues=driver.getWindowHandles();
		
//		for(String handle : handleValues) {
//			
//			driver.switchTo().window(handle);
//			String windowUrl=driver.getCurrentUrl();
//			if(windowUrl.contains("feedback")==false) {
//		    
//				 driver.close();
//			}
//		}
//		
//		handleValues=driver.getWindowHandles();
//		for(String handle : handleValues) {
//			
//			driver.switchTo().window(handle);
//			String windowUrl=driver.getCurrentUrl();
//			if(windowUrl.contains("feedback")==true) {
//		       break;
//			}
//		}
		String feedbackHandleValue="";
		for(String handle : handleValues) {
			
			driver.switchTo().window(handle);
			String windowUrl=driver.getCurrentUrl();
			if(windowUrl.contains("feedback")==true) {
				feedbackHandleValue = driver.getWindowHandle(); 
			}else {

				 driver.close();
			}
		}
		
		
		driver.switchTo().window(feedbackHandleValue);
		driver.findElement(By.name("description")).sendKeys("hello");	
		
		
		
	}

}
