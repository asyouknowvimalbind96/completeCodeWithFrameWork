package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newYatraAutomate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		WebElement mobileNumber=driver.findElement(By.xpath("//img[@alt='cross']/ancestor::span[@class='style_cross__q1ZoV']//img"));
		mobileNumber.click();

		WebElement weHotal=driver.findElement(By.xpath("//span[text()='Hotels']/ancestor::button//i[@class='demo-icon ytfi-home-hotel me-1 me-4 css-s457os']"));
		weHotal.click();
		
		WebElement weSearch=driver.findElement(By.xpath("//div[@class='SearchPanel_travelInfo__0yz20']//button[text()='Search']"));
		weSearch.click();
		
		Thread.sleep(40000);
		
		List<WebElement> allRate=driver.findElements(By.xpath("//div[@class='HotelListCard_priceInfo__S_CZ6']//h2"));
		int TotalCount=allRate.size();
		int text=0;
		int blank=0;

		for(int i=0;i<TotalCount;i++) {
			WebElement wefoundAllRate= allRate.get(i);
			String AllHotelAmount=wefoundAllRate.getText();
			if(AllHotelAmount.equalsIgnoreCase("")) {
				blank=blank+1;
			}else {
			
			System.out.println(i+1+"   -  "+"Amount of hotal  - "+AllHotelAmount);
			text=text+1;
			}
		}
		
		//driver.quit();
	}

}
