package WindowHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandleOnFlipkart {
	 static WebDriver driver;	
	 
	 public void GoToMainWindow(String GiveTitleName_ForMainWindow) {
			Set<String> windowS=driver.getWindowHandles();
			for(String windowHandleValue:windowS) {
				driver.switchTo().window(windowHandleValue);
				String WindowTitle=driver.getCurrentUrl();
				if(WindowTitle.contains(GiveTitleName_ForMainWindow)) {
					System.out.println("I am Standing at Main Window");
					break;
				}
			}
		}
		
		public void GoToSecondWindow(String GiveTitleName_ForSecondWindow) {
		Set<String> windowhandle=driver.getWindowHandles();
		for(String HandleValue: windowhandle) {
			driver.switchTo().window(HandleValue);
			String titleNameofWindow=driver.getCurrentUrl();
			if(titleNameofWindow.contains(GiveTitleName_ForSecondWindow)) {
				System.out.println("I am Standing at Second Window");
				break;
			}
		}
		}
		
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		new Actions(driver);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement weSearchBox=driver.findElement(By.xpath("//div[@class='GZVzXz yAfw1d']//input[@type='text']"));
		Thread.sleep(1000);
		weSearchBox.click();
		weSearchBox.sendKeys("motorola edge 50 fusion");
		
		WebElement weClickSearchICON=driver.findElement(By.xpath("//div[@class='GZVzXz yAfw1d']//button[@type='submit']"));
		weClickSearchICON.click();
		Thread.sleep(4000);
		List<WebElement>  allProductclick=driver.findElements(By.xpath("//div[@class='ZFwe0M row']//div[@class='RG5Slk']"));
		for(int i=0;i<allProductclick.size();i++) {                 //  //div[@class='ZFwe0M row']//div[@class='RG5Slk']
			WebElement weAllPro=allProductclick.get(i);
			weAllPro.click();
			
			Set<String> alle=driver.getWindowHandles();
			for(String str:alle) {
				driver.switchTo().window(str);
				String stt=driver.getCurrentUrl();
				if(stt.contains("")) {
					break;
				}
				
				}
			String currentURL=driver.getCurrentUrl();
			driver.switchTo().window(currentURL);
			windowHandleOnFlipkart obj=new windowHandleOnFlipkart();
			obj.GoToSecondWindow(currentURL);
			WebElement werate=driver.findElement(By.xpath("//div[@class='RnKcup']//div[@class='hZ3P6w bnqy13']"));
			String text=werate.getText();
			System.out.println(text);
			
			
		}
	}
	
}
