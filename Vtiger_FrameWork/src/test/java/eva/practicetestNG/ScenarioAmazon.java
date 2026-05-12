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

public class ScenarioAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Apple iPhone 15");
		WebElement wesearchClick=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
		wesearchClick.click();

		WebElement forScrolling=driver.findElement(By.xpath("(//span[text()='iPhone 16e 512 GB: Built for Apple Intelligence, A18 Chip, Supersized Battery Life, 48MP Fusion. Camera, 15.40 cm (6.1″) Super Retina XDR Display; Black'])[1]"));
		act.moveToElement(forScrolling).build().perform();
		
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
		
		int screenShotCount=1;
		for(int i=0;i<5;i++) {
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		TakesScreenshot screenShotOfFullScree=(TakesScreenshot)driver;
		File src=screenShotOfFullScree.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Vimal Bind\\Desktop\\New folder\\multiple1 Screen Shot "+screenShotCount+".jpeg");
		FileUtils.copyFile(src, destination);
		screenShotCount++;
		
	}
	}
}
