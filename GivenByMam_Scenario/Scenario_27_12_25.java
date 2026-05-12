package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_27_12_25 {
	/*Launch browser
Open https://www.amazon.in
Enter product name (e.g., Apple iPhone 15)
Click on Search button
Wait for search results to load
Capture first product title
Capture first product price
📸 Take screenshot of the page showing first product
Print product title and price in console/log
(Optional) Assert that title and price are not empty
Close browser
	 * 
	 */

	public static void main(String []args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement weName=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//div[@class='a-row a-spacing-micro']/following-sibling::a//span"));
		String strFirstProductName=weName.getText();
		String expectedName="Mobile";
		
		if(strFirstProductName.contains(expectedName)) {
			System.out.println("first product name is in the list of search history "+strFirstProductName);
		}else {
			System.out.println("First Product name is not in the list >>     ");
		}
		WebElement weprice=driver.findElement(By.xpath(""));      //span[text()='52,790'])[1]
		String str=weprice.getText();
		if(str.equalsIgnoreCase("")) {
		System.out.println("Product is not listed    Verification failed");	
		}else {
			System.out.println("product is listed >> Verification  Passed  "+str);
		}
		driver.quit();
	}

}
