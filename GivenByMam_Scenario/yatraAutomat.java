package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatraAutomat {

	public static void main(String[] args) throws InterruptedException {
		
		autoSuggetion();
		
		
	}
	
	public static void autoSuggetion() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		WebElement mobileNumber=driver.findElement(By.xpath("//img[@alt='cross']/ancestor::span[@class='style_cross__q1ZoV']//img"));
		mobileNumber.click();

		WebElement weHotal=driver.findElement(By.xpath("//span[text()='Hotels']/ancestor::button//i[@class='demo-icon ytfi-home-hotel me-1 me-4 css-s457os']"));
		weHotal.click();
		
		WebElement weSearch=driver.findElement(By.xpath("//div[@class='SearchPanel_travelInfo__0yz20']//button[text()='Search']"));
		weSearch.click();
		
		WebElement weClickCity=driver.findElement(By.xpath("//p[text()='Select City, Location or Hotel Name']/following-sibling::div[@class='SearchInputField_searchRegionValue__PmO8a']"));
		weClickCity.click();
		
		driver.findElement(By.xpath("//label[text()='Select City, Location or Hotel Name']/following-sibling::input[@type='text']")).sendKeys("Mumbai");
		
		
		
		
		
	}
	
	
	
	
	public static void yatra() throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		WebElement mobileNumber=driver.findElement(By.xpath("//img[@alt='cross']/ancestor::span[@class='style_cross__q1ZoV']//img"));
		mobileNumber.click();

		WebElement weHotal=driver.findElement(By.xpath("//span[text()='Hotels']/ancestor::button//i[@class='demo-icon ytfi-home-hotel me-1 me-4 css-s457os']"));
		weHotal.click();
//		WebElement weCity=driver.findElement(By.xpath("//p[text()='Select City, Location or Hotel Name']/following-sibling::div//img[@alt='Location Icon of hotels AND cities']"));
//		weCity.click();
		
//		WebElement weAddclose=driver.findElement(By.xpath("//button[@name='close']"));
//		weAddclose.click();
		
//		WebElement weCityInput=driver.findElement(By.xpath("//input[@placeholder='Select City, Location or Hotel Name']"));
//		weCityInput.click();
		
		WebElement weSearch=driver.findElement(By.xpath("//div[@class='SearchPanel_travelInfo__0yz20']//button[text()='Search']"));
		weSearch.click();
		
		Thread.sleep(2000);
		WebElement weNameByRate=driver.findElement(By.xpath("//h2[text()='The Zuri White Sands Goa Resort & Casino']/ancestor::div[@class='HotelListCard_hotelInfo___TpZO']/following-sibling::div[@class='HotelListCard_pricing__7CCDe']//h2[text()='₹']"));
		String rate=weNameByRate.getText();
		System.out.println(rate);
		

		WebElement weChoicRoom=driver.findElement(By.xpath("//h2[text()='The Zuri White Sands Goa Resort & Casino']/ancestor::div[@class='HotelListCard_hotelInfo___TpZO']/following-sibling::div[@class='HotelListCard_pricing__7CCDe']//button[text()='Choose Room']"));
		weChoicRoom.click();
		
	//	System.out.println(rate);
		
		
	
		Thread.sleep(3000);
		driver.quit();
	
	}
	
public static void array() {
	
	int []age= {10,99,67,98,56,44};
	int vi=age[3];
	
	System.out.println(vi);
	
	
	String[]studentName= {"vimal","aman","satyendra sir","sunil","jay","ram","dhruva gupta"};
	String aman=studentName[1];
	System.out.println(aman);
	String sunil=studentName[1];
			System.out.println(sunil);
			
			
			
	
	
	
	
	
	
	
	
}
}
