package genericMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {

	private WebDriver driver;

	public WebDriver getDriver( ) {
		return driver ;
	}
	
	public void hitURL(String Url) {
		driver.get(Url);
	}
public void closeBrowser() {
	driver.close();
}
	
public void ThreadSleep(int durationOfMiliSecond) {
	try {
		Thread.sleep(durationOfMiliSecond);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}


	public void clickWithActions(WebElement element) {

		try {
			element =	explicitWait(element);
			Actions action = 	new Actions(driver);
			action.moveToElement(element).build().perform();
			action.click(element).build().perform();
		} catch (Exception e) {
			System.out.println("element not clicked");
			e.printStackTrace();
		}


	}
	public void clickWithJS(WebElement element) {
		try {
//			JavascriptExecutor jse=(JavascriptExecutor)driver;
//			element = 	explicitWait(element);
//			jse.executeScript("arguments[0].click();", element);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(" element not clicked");
			e.printStackTrace();
		}
	}
	//   
	
	public boolean isEnabled(WebElement element) {
		element = explicitWait(element);
		if(!element.isEnabled()) {
			System.out.println(" element is not enabled ....");
		}
		return 	element.isEnabled();
	}

	public boolean  isDisplayed(WebElement element) {
		element = 	explicitWait(element);
		if(!element.isDisplayed()) {
			System.out.println(" element is not displayed ..");
		}
		return element.isDisplayed();
	}


	public String  validationBygetText(WebElement element) {
		element = explicitWait(element);
		String actualText =  element.getText();
		return actualText ;

	}

	public WebElement  explicitWait(WebElement element) {
		WebDriverWait wait =	new WebDriverWait(driver,Duration.ofSeconds(60));
		element=	wait.until(ExpectedConditions.visibilityOf(element));
		return element ;

	}
	public void sendkeys(WebElement element ,String value) {
		try {
			element =explicitWait(element);
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void takeScreenshot(String path){
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(path);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void windowHandle(String window ,int number) throws InterruptedException {
		try {
			Map<String,String> map = new HashMap<>();
			Set<String> windows =driver.getWindowHandles();
			int i =1;
			for(String windoww : windows) {
				map.put("window"+i, windoww);
				i++;
			}
			driver.switchTo().window(map.get(window+number));
		} catch (Exception e) {
			Map<String,String> map = new HashMap<>();
			Set<String> windows =driver.getWindowHandles();
			int i =1;
			for(String windoww : windows) {
				map.put("window"+i, windoww);
				i++;
			}
			driver.switchTo().window(map.get(window+number));
			Thread.sleep(60);
			e.printStackTrace();
		}
	}

	public void click(WebElement element ) {
		element =	explicitWait(element);
		element.click();

	}

	public void mouseHover(WebElement element) {

		try {
			//element = 	explicitWait(element);
			Actions action =	new Actions(driver);
			action.moveToElement(element).build().perform();;
		} catch (Exception e) {
			System.out.println("mouseHover failed");
			e.printStackTrace();
		}
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		try {
			Actions action =	new Actions(driver);
			WebElement 	src = explicitWait(source);
			WebElement 	dest  = explicitWait(source);
			action.dragAndDrop(src, dest);
		} catch (Exception e) {
			System.out.println("drag and drop failed");
			e.printStackTrace();
		}
	}

	public void dropDown(WebElement element,String value) {
		try {
			element =	explicitWait(element);
			Select select = new Select(element);
			select.selectByValue(value);
		} catch (Exception e) {
			System.out.println("drop down failed");
			e.printStackTrace();
		}
	}

	public WebDriver  launchBrowser(String browserName ) {

		if(browserName.equalsIgnoreCase("Chrome")) {
			driver =	new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browserName.equalsIgnoreCase("FireFox")) {
			driver =	new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver =		new EdgeDriver();
		}else {
			System.out.println("invalid browser name ");
		}
		return driver ;
	}

}