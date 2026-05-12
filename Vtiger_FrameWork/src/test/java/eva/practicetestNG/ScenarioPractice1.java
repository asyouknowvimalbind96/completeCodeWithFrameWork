package eva.practicetestNG;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScenarioPractice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Apple iPhone 15");
		WebElement wesearchClick=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
		wesearchClick.click();

		String expectedFirstProductName="iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display";
		WebElement actualFirstProductName=driver.findElement(By.xpath("//span[text()='iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Deep Blue']"));
		String actualText=actualFirstProductName.getText();
		if(actualText.contains(expectedFirstProductName)) {
			System.out.println("Validation Passed : "+actualText);
		}else {
			System.out.println("Validation Failed : ");
		}
		String expectdFirstProductPrice="1,34,900";
		WebElement wefistproductPrice=driver.findElement(By.xpath("//span[text()='1,34,900']"));
		String actualTextOfPrice=wefistproductPrice.getText();
		if(actualTextOfPrice.contains(expectdFirstProductPrice)) {
			System.out.println("Validation Passed  : "+actualTextOfPrice);
		}else {
			System.out.println("Validation Failed");
		}
		
		
		int screenshotCount=1;
		for(int i=0;i<15;i++) {
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		TakesScreenshot screenshot=(TakesScreenshot)driver;	
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Vimal Bind\\Desktop\\New folder\\screenshot"+screenshotCount+".jpeg");
		FileUtils.copyFile(src, destination);
		screenshotCount++;
	}
	}
}
