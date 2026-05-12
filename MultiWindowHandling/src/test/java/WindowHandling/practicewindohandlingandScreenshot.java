package WindowHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practicewindohandlingandScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		WebDriverWait Expwait=new WebDriverWait(driver, Duration.ofSeconds(0));
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		//Expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Leads']")));
		
		
		WebElement loginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		loginClick.click();
		Thread.sleep(2000);
		WebElement weMore=driver.findElement(By.xpath("//a[text()='More']"));
		act.moveToElement(weMore).build().perform();
		WebElement weSupportClick=driver.findElement(By.xpath("//a[@name='Reports']"));
		weSupportClick.click();
		
		WebElement weTakeScreenshot=driver.findElement(By.xpath("//td[text()='Campaign Expectations and Actuals']//ancestor::table[@class='reportsListTable']"));
		TakesScreenshot screenshot=weTakeScreenshot;
		File Srcfile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("C:\\Users\\Vimal Bind\\Desktop\\ScenarionByJay11 .jpeg");
		FileUtils.copyFile(Srcfile, destinationFile);
		WebElement weClickFeedBack=driver.findElement(By.xpath("//a[text()='Feedback']"));
		JavascriptExecutor javaExecutor=(JavascriptExecutor)driver;
		javaExecutor.executeScript("arguments[0].click();", weClickFeedBack);
		Set<String>AllHandleValue=driver.getWindowHandles();
		for(String handleValue:AllHandleValue) {
			driver.switchTo().window(handleValue);
			String CurrentURl=driver.getCurrentUrl();
			if(CurrentURl.contains("feedback.php")) {
				break;
			}	
		}
		Thread.sleep(2000);
		WebElement weArea=driver.findElement(By.xpath("//textarea[@name='description']"));
		weArea.sendKeys("ASHISH YADAV I HAVE COMPLETED GRADUATION I AM CURRENTL WORKING AS A SOFTWARE TESTER");
		TakesScreenshot takeScr=weArea;
		File SrcFile=takeScr.getScreenshotAs(OutputType.FILE);
		File DestinationFile=new File("C:\\Users\\Vimal Bind\\Desktop\\ScenarionByJay 2feed .jpeg");
		FileUtils.copyFile(SrcFile, DestinationFile);
		
		WebElement wefind=driver.findElement(By.xpath(""));
		Expwait.until(ExpectedConditions.textToBePresentInElement(wefind, "Vimal"));
		Expwait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""), "vimal")));
		
	}

}
