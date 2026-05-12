package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findAutoSuggetion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("mobile");
		
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		Thread.sleep(4000);
		List<WebElement> listAutoSuggested=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@role='row']"));
		for(int i=0; i<listAutoSuggested.size();i++) {
			WebElement weauto=listAutoSuggested.get(i);
			String findText=weauto.getText();
			System.out.println(i+" vimal -> "+findText);
		}
		
		
		
		
		
	}

}
