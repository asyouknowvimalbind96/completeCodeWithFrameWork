package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second_scenario_28_12_25 {
/*Launch browser
Open Amazon
Click on Mobiles tab
Verify Mobiles page
Navigate back
Print inner text of Today’s Deals
Click on Today’s Deals
Verify Deals page
Close browser
🔹 Expected Result:
User should successfully navigate to both Mobiles and Today’s Deals pages.
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement weName=driver.findElement(By.xpath(""));
		String strFirstProductName=weName.getText();
		System.out.println(strFirstProductName);
	}
}
