package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioByMam04_11_2025_ {
	public static void main(String [] args) throws InterruptedException {




		//forMobile();
		//laptop();
      	//forSuggetionName();
		alllinkTagonHomePage();




	}
	public static void forMobile() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("Android Mobile phones");

		Thread.sleep(6000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);


		List<WebElement> listofAllProduct=driver.findElements(By.xpath("//div[@class='puisg-row']//div[@class='a-section a-spacing-small a-spacing-top-small']//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
		for(int i=0; i<listofAllProduct.size();i++) {
			WebElement weProductName=listofAllProduct.get(i);
			String textName=weProductName.getText();

			System.out.println("All Product Name ->   "+textName);
		}
		System.out.println("================================================================================================");

	}

	public static void laptop() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("Laptop");
		Thread.sleep(6000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);

		List<WebElement> listofAllLaptop=driver.findElements(By.xpath("//div[@class='puisg-row']//span[@class='a-color-base']"));
		for(int i=0;i<listofAllLaptop.size();i++) {
			WebElement wePriceofLaptop=listofAllLaptop.get(i);
			String PriceofAllLaptop=wePriceofLaptop.getText();
			System.out.println("Price of All Laptop do Searching  ->    "+PriceofAllLaptop);
		}
		System.out.println("================================================================================================");

	}
	public static void forSuggetionName() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("mob");
		Thread.sleep(6000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

		

		List<WebElement> listofSuggetionPriting= driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@role='row']"));
		for(int i=0;i<listofSuggetionPriting.size();i++) {
			WebElement weNameSuggest=listofSuggetionPriting.get(i);
			String allSuggetionName= weNameSuggest.getText();
			System.out.println("all Suggested name of mob ->   "+allSuggetionName);

		}
		System.out.println("================================================================================================");
	}
	public static void alllinkTagonHomePage() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);
		List <WebElement> listofAllLinkonHomePage=driver.findElements(By.xpath("//a"));
		int blank=0;
		int linkcount=0;
		for(int i=0;i<listofAllLinkonHomePage.size();i++) {
			WebElement weLinkOnPage=listofAllLinkonHomePage.get(i);
			String link=weLinkOnPage.getText();

			if(link.equalsIgnoreCase("")) {
				
				blank=blank+1;	
				//System.out.println(i+1);
				
			}else {
			System.out.println(i+1+"   -   "+link);
			linkcount=linkcount+1;
		}
		
		}
		System.out.println("total number of blank  ->  "+blank);
		System.out.println("total number of linkText  "+linkcount);
		
		
	}


}
