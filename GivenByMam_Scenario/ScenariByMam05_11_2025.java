package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenariByMam05_11_2025 {
	public static void main(String []arge) throws InterruptedException {

		//ForHeadPhone();
		//forShoes();
		//slide();
		practice2ByMam();
		
		
		
		

	}
	/*
	 * Amazon par “Headphones” search karke saare Product Ratings print karna
Scenario Explanation

	 */
	public static void ForHeadPhone() throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("Headphone");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);

		List<WebElement> listofHeadPhone=driver.findElements(By.xpath("//div[@class='a-row a-size-small']//span[@class='a-size-small a-color-base']"));
		for(int i=0;i<listofHeadPhone.size();i++) {
			WebElement weHeadphone=listofHeadPhone.get(i);
			String textoRating=weHeadphone.getText();
			System.out.println("Rating of all product headphone ->  "+textoRating);
		}
		System.out.println("==================================================================================");
		driver.navigate().back();

		WebElement weSearchBoxforSirt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBoxforSirt.sendKeys("Men T-Shirt");

		Thread.sleep(6000);



		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);

		List<WebElement> listofMenTshirt=driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span"));
		int TotalCountOfShirt=listofMenTshirt.size();
		System.out.println("total number of  Men T-Shirt"+TotalCountOfShirt);




	}
	/*
	 * Amazon me “Men T-Shirts” search karke product ke total count dikhana
Scenario Explanation

	 */
//	public static void ForMen_T_Sirt() throws InterruptedException {
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		Actions act=new Actions(driver);
//
//		driver.get("https:/amazon.com/");
//
//		Thread.sleep(6000);
//
//		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		weSearchBox.sendKeys("Men T-Shirt");
//
//		Thread.sleep(6000);
//
//		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
//
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		Thread.sleep(6000);
//
//		List<WebElement> listofMenTshirt=driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span"));
//		int TotalCountOfShirt=listofMenTshirt.size();
//		System.out.println("total number of  Men T-Shirt"+listofMenTshirt);
//
//
//
//
//
//	}
	/*
	 * Shoes” search karo → Product Names Alphabetical Order me sort karke print karo
Logic

Product names list me daalo

List ke String values ko Collections.sort() se sort karo

Alphabet order me print ho jayega
	 */
	public static void forShoes() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("Shoes");

		Thread.sleep(6000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);

		List<WebElement> listofShoes=driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span"));
		for(int i=0;i<listofShoes.size();i++) {
			WebElement weshoes=listofShoes.get(i);
			String sortTextofShoes=weshoes.getText();
			System.out.println(sortTextofShoes);
		}







	}
	public static void d() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/amazon.com/");

		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("Headphone");

		Thread.sleep(6000);

		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(6000);

		List<WebElement> listofHeadPhone=driver.findElements(By.xpath("//div[@class='a-row a-size-small']//span[@class='a-size-small a-color-base']"));
		for(int i=0;i<listofHeadPhone.size();i++) {
			WebElement weHeadphone=listofHeadPhone.get(i);
			String textoRating=weHeadphone.getText();
			System.out.println("Rating of all product headphone ->  "+textoRating);
		}

	}

	public static void slide() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);

		driver.get("https://www.w3schools.com/");

		act.scrollByAmount(0,12300).build().perform();
		driver.switchTo().frame(0);

		WebElement weClickNextButton=driver.findElement(By.xpath("//div[@class='slideshow-container']//a[@class='next']"));
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			weClickNextButton.click();
			Thread.sleep(2000);
		}
		driver.switchTo().defaultContent();		
		Thread.sleep(4000);
		WebElement welearnMore=driver.findElement(By.xpath("//div[@id='howto_padding']//a"));
		
		welearnMore.click();
	
		WebElement weFrame_8=driver.findElement(By.xpath("//iframe[@src='tryhow_css_bg_change_scroll.htm']"));
		
		driver.switchTo().frame(weFrame_8);
		Thread.sleep(3000);
	WebElement weclickTextBox=driver.findElement(By.xpath("//div[@class='bg-text']"));
	act.scrollToElement(weclickTextBox).build().perform();
	Thread.sleep(2000);
	act.doubleClick(weclickTextBox).build().perform();
	Thread.sleep(2000);
	WebElement weScrool=driver.findElement(By.xpath("//div[@class='bg-image img6']"));
	act.scrollToElement(weScrool).build().perform();
	
	
	}
public static void practice2ByMam() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	WebElement weFrameforClick=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(weFrameforClick);
	WebElement weclick=driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]"));
	Thread.sleep(2000);
	weclick.click();	
}






}

