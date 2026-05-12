package org.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Invalid browser name");
		}	
	}
	public void get(String browserName,String url) {
		launchBrowser(browserName);
		driver.get(url);
	}
	public String getCurrentUrl() {
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	public void getPageSource() {
		driver.getPageSource();
	}
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}

	public void close() {
		driver.close();
	}
	public void quit() {
		driver.quit();
	}
	public void maximized() {
		driver.manage().window().maximize();
	}
	public void windoHandle() {
		String handleValue=driver.getWindowHandle();
		driver.switchTo().window(handleValue);
	}
	public void windoHandles(String nextWindowUrl) {
		Set<String> handleValues=driver.getWindowHandles();
		for(String handleValue:handleValues) {
			driver.switchTo().window(handleValue);
			String url=getCurrentUrl();
			if(url.contains(nextWindowUrl)) {
				break;
			}

		}
	}

	public void windoHandle(String urlOfNextWindow){
		Set<String> handleValues=driver.getWindowHandles();
		for(String handleValue:handleValues){
			driver.switchTo().window(handleValue);
			String url=getCurrentUrl();
			if(url.contains(urlOfNextWindow)){
				break;


			}
		}
	}

	public void fullScreenShot(String path) {
		try {
			TakesScreenshot take=(TakesScreenshot)driver;
			File src=take.getScreenshotAs(OutputType.FILE);
			File destination=new File(path);
			try {
				FileUtils.copyFile(src, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void specificScreenshot(WebElement webelement,String path) {
		TakesScreenshot take=webelement;
		File src=take.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebElement explicitWaitForVisiblityOf(WebElement webelement,int durationInSecond) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(durationInSecond));
		WebElement weWait=wait.until(ExpectedConditions.visibilityOf(webelement));
		return weWait;
	}
	
	public WebElement explicitWaitForElementToBeClickable(WebElement webelement,int durationInSecond) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(durationInSecond));
		WebElement weWait=wait.until(ExpectedConditions.elementToBeClickable(webelement));
		return weWait;
	}
	

	///////////////////////////// WebElement //////////////////////////////////////////
	public String getText(WebElement webelement) {
		String text=null;
		try {
			text=webelement.getText();
			return text;
		}catch(NoSuchElementException e) {
			explicitWaitForVisiblityOf(webelement,60);
			text=webelement.getText();
			return text;
		}catch(Exception e) {
			e.printStackTrace();
			return text;
		}
	}


	public String getTagName(WebElement webelement) {
		String tag=null;
		try {
			tag=webelement.getTagName();
			return tag;
		}catch(NoSuchElementException e) {
			explicitWaitForVisiblityOf(webelement, 60);
			tag=webelement.getTagName();
			return tag;
		}
	}
	public boolean isDisplay(WebElement webelement) {
		boolean display=true;
		try {
			webelement.isDisplayed();
			return display;
		}catch(NoSuchElementException e) {
			explicitWaitForVisiblityOf(webelement, 60);
			return display;
		}
	}
	
	public void click(WebElement webelement) {
		try {
		webelement.click();
		}catch(NoSuchElementException e) {
			explicitWaitForElementToBeClickable(webelement, 60);
			webelement.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void sendKeys(WebElement webelement,String value) {
		try {
			webelement.sendKeys(value);
		}catch(NoSuchElementException e) {
			explicitWaitForVisiblityOf(webelement, 60);
			webelement.sendKeys(value);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}

