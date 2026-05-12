package WindowHandling;


import java.io.File;
import java.io.IOException;
import java.util.List;
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


public class Scenario_02_02_2026 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Scenario_1();
		Scenario_2();
		//Scenario_3();
		//ScenarioBySir();

	}

	public static void ScenarioBySir() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebElement loginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		loginClick.click();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String pagesource=driver.getPageSource();
		driver.get("https://validator.w3.org");
		Thread.sleep(2000);
		WebElement wedirectInput=driver.findElement(By.xpath("//a[@href='#validate_by_input']"));
		jse.executeScript("arguments[0].click();", wedirectInput);
		WebElement text_box= driver.findElement(By.xpath("//textarea[@id='fragment']"));
	
		jse.executeScript("arguments[0].value=arguments[1];",text_box,pagesource);




	}
	//	public static void Scenario_4() {
	//		WebDriver driver=new ChromeDriver();
	//		driver.manage().window().maximize();
	//		Actions act=new Actions(driver);
	//		driver.get("https://www.naukri.com");
	//		




	public static void Scenario_3() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("https://www.naukri.com");
		act.scrollByAmount(500, 300).build().perform();
		List<WebElement> weClicksomeFeature=driver.findElements(By.xpath("//div[@class='ntc__chips-row']//span[@class='ntc__chip-label']"));
		for(int i=0;i<weClicksomeFeature.size();i++) {
			WebElement weclickOneByOne=weClicksomeFeature.get(i);
			weclickOneByOne.click();
		}
		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String handle=driver.getTitle();
			if(handle.contains("Jobs - Recruitment - Job Search")==true) {
			}else {
				driver.close();
			}
		}

	}

	public static void Scenario_2() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("http://localhost:8888/");
		WebElement weuserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		WebElement loginClick=driver.findElement(By.xpath("//input[@type='submit']"));
		loginClick.click();
		Thread.sleep(2000);
		

		String ActualHomePageValue=driver.getTitle();
		String expectedHomePageValue="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(ActualHomePageValue.equalsIgnoreCase(expectedHomePageValue)) {
			System.out.println("home page titile matched   validation Passed ");
		}else {
			System.out.println("Home page title not matched    validation failded");
		}
		WebElement weHelpButtonforOver=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
			
		act.moveToElement(weHelpButtonforOver).build().perform();
		WebElement weHelp=driver.findElement(By.xpath("//a[text()='Help']"));
		
		
		TakesScreenshot printScreenShot=weHelp;
		File srcfile=printScreenShot.getScreenshotAs(OutputType.FILE);
		File DestinatonSave=new File("C:\\Users\\Vimal Bind\\Desktop\\rtttt1112.jpeg");
		FileUtils.copyFile(srcfile,DestinatonSave);
				
		JavascriptExecutor excutor=(JavascriptExecutor)driver;
		excutor.executeScript("arguments[0].click()", weHelp);

		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("http://wiki.vtiger.com/index.php/Main_Page")) {
				break;
			}
		}

		String actualtitleOnSecondWindow=driver.getTitle();
		String ExpectedTitle="vtiger.com | 522: Connection timed out";
		if(actualtitleOnSecondWindow.equals(ExpectedTitle)) {
			System.out.println("Second Window Title is matched   Validation Passed ");
			Thread.sleep(3000);
			driver.close();
		}else {
			System.out.println("Second Window Title is not matched   Validation Failed ");
		}
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String currentUrl=driver.getCurrentUrl();
			if(currentUrl.contains("http://localhost:8888/index.php?action=index&module=Home")) {
				System.out.println("Return parent window   i am stand parent window");
				break;
			}
		}
	}
	public static void Scenario_1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement weClick=driver.findElement(By.xpath("//button[text()='    click   ']"));
		weClick.click();

		Set<String> allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String titleValue=driver.getCurrentUrl();
			if(titleValue.contains("https://www.selenium.dev/")) {
				break;
			}
		}
		String actualTitleName="Selenium";
		String TitleOnSecondwin=driver.getTitle();
		if(TitleOnSecondwin.equalsIgnoreCase(actualTitleName)) {
			System.out.println("Page Title is matched       Validation Passed");
		}else {
			System.out.println("Page Title is not matched   Validation Failed");
		}
		allHandleValue=driver.getWindowHandles();
		for(String handleValue:allHandleValue) {
			driver.switchTo().window(handleValue);
			String URLValue=driver.getCurrentUrl();
			if(URLValue.contains("https://demo.automationtesting.in/Windows.html")) {
				break;
			}}
		WebElement wesoft=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		act.moveToElement(wesoft).build().perform();
		Thread.sleep(5000);	
	}
}

