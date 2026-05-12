package PracticeForArrayTypewithloop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartPractice {

	public static void main(String[] args) throws InterruptedException {
		
		work2();
	}
	public static void work2() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement weSearchBox=driver.findElement(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//input[@name='q']"));
		weSearchBox.click();
		weSearchBox.sendKeys("samsung Galaxy");

		WebElement weClickSearchIcon=driver.findElement(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//button[@class='_2iLD__']"));
		weClickSearchIcon.click();
		
		Thread.sleep(10000);
		List<WebElement> weName=driver.findElements(By.xpath("//a[contains(text(),'Samsung')]"));
		int totalCount=weName.size();
		
		for(int i=0; i<totalCount; i++) {
			WebElement wecheckName=weName.get(i);
			String TotalProductName=wecheckName.getText();
			
			System.out.println(i+1+"  -  "+TotalProductName);
		}
		
		System.out.println("==========================================================================================================");
		Thread.sleep(5000);
		List<WebElement> weRate=driver.findElements(By.xpath("//div[@class='slAVV4']/ancestor::div[@class='DOjaWF gdgoEp']//a[@class='wjcEIp']/following-sibling::a[@class='DMMoT0']//div[@class='Nx9bqj']"));
		int totalCountofRate=weRate.size();
		for(int i=0; i<totalCountofRate; i++) {
			WebElement RateofPhone=weRate.get(i);
			String totalAmount=RateofPhone.getText();
			System.out.println(i+1+"  -  "+totalAmount);
		}
		
		
		
		
		
		
		
	}
	public static void work3() throws InterruptedException {	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement weSearchBox=driver.findElement(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//input[@name='q']"));
		weSearchBox.click();
		weSearchBox.sendKeys("shoes for men");

		WebElement weClickSearchIcon=driver.findElement(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//button[@class='_2iLD__']"));
		weClickSearchIcon.click();

		Thread.sleep(10000);
		List<WebElement> ListweAmount=driver.findElements(By.xpath("//img[@class='_53J4C-']/ancestor::a[@class='rPDeLR']/following-sibling::div[@class='hCKiGj']//a[@class='WKTcLC']"));    //img[@class='_53J4C-']/ancestor::a[@class='rPDeLR']/following-sibling::div[@class='hCKiGj']//a[@class='WKTcLC']
		int totalCount=ListweAmount.size();
		int serialNum=0;
		for(int i=0; i<totalCount; i++) {
			WebElement we_all_Found=ListweAmount.get(i);
			String AllProductAmount=we_all_Found.getText();

			serialNum=serialNum+1;
			System.out.println(serialNum+"  -   "+AllProductAmount);

		}






	}
	public static void work1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		
		String weCheckPageTitle=driver.getTitle();
		
		String ActualHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"
;
		
		if(weCheckPageTitle.equalsIgnoreCase(ActualHomePageTitle)) {
			System.out.println("Expected and actual value match   validation Passed ");
		}else {
			System.out.println("expected and actual value not match validation failed");
		}
		System.out.println(weCheckPageTitle);

		
		
		List<WebElement> wetag=driver.findElements(By.xpath("//a"));
		
		int totalCount=wetag.size();
		int blank=0;
		int text=0;
		for(int i=0; i<totalCount;i++) {
			WebElement weCheck=wetag.get(i);
		String totalSameTagonHomePage=weCheck.getText();	
			if(totalSameTagonHomePage.equalsIgnoreCase("")==false) {
			blank=blank+1;
			}else {
				System.out.println(i+1+"    -   "+totalSameTagonHomePage);
				text=text+1;
				
			}
			
		}
		
		System.out.println("total text is  - "+text);
		System.out.println("total blank is  -  "+blank);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		

	}
}
