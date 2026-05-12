package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_21_11_2025 {

	public static void main(String[] args) throws InterruptedException {
		//navigatepractice();
		//laptopReleted();
		Scenario_5();
		
		
		

	}
	public static void navigatepractice() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement weClickDeals=driver.findElement(By.xpath("//div[@id='CardInstanceDtiH5QpHdZF0InQcq8T-4A']//div[@class='_desktop-tall-hero-video_style_lazy-video-wrapper__WM56t']"));      					
		Thread.sleep(2000);
		weClickDeals.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public static void laptopReleted() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement weFirstProduct=driver.findElement(By.xpath("//span[text()='$917.70']//ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
		String firstPro=weFirstProduct.getText();
		if(firstPro.toLowerCase().contains("laptop")) {
			System.out.println("on Searching laptop found first product >>    "+firstPro);			
		}else {
			System.out.println("laptop word is not available in searching  first product");
		}
		
	}
	public static void Scenario_3() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement weHPCheckboxClick=driver.findElement(By.xpath("//li[@id='p_123/308445']//i"));
		act.scrollToElement(weHPCheckboxClick).build().perform();
		Thread.sleep(2000);
		weHPCheckboxClick.click();
		Thread.sleep(3000);
		WebElement weRating=driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		act.scrollToElement(weRating).build().perform();
		
		weRating.click();
		
	}
	public static void Scenario_4() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		WebElement weAccounthover=driver.findElement(By.xpath("//div[@id='nav-link-accountList']//a"));
		act.moveToElement(weAccounthover).build().perform();
		Thread.sleep(3000);
		WebElement weClickOrder=driver.findElement(By.xpath("//a[@href='/gp/css/order-history?ref_=nav_orders_first']"));
		Thread.sleep(2000);
		act.click(weClickOrder).build().perform();
		
	}
	public static void Scenario_5() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='nav-tools']//span[@class='icp-nav-link-inner']")).click();
		
		
	}
}
