package GivenByMam_Scenario;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggetionsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
		ScenarioMam04_11_2025();
		
		
		
		
		
		
		
	}
	public static void ScenarioMam04_11_2025() throws InterruptedException {
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
		
		


	}
	
	
	public static void IRCTC() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void autoSuggetion() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(4000);

		driver.get("https:/amazon.com/");
		
		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearchBox.sendKeys("phone");
		
		Thread.sleep(6000);

		
		List<WebElement> autoSuggetiondonPage= driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div[@role='row']"));
		for(int i=0;i<autoSuggetiondonPage.size();i++) {
			WebElement weSuggetion=autoSuggetiondonPage.get(i);
			String textFound=weSuggetion.getText();
			
			System.out.println("total auto Suggetion print ->  "+textFound);
		
		}

	}
	
	
public static void checkboxClick() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(4000);

		driver.get("https:/amazon.com/");
		
		Thread.sleep(6000);

		WebElement weSearchBox=driver.findElement(By.xpath("//input[@id='nav-bb-search']"));
		weSearchBox.sendKeys("phone");
		
		WebElement weClickButton=driver.findElement(By.xpath("//div[@id='nav-bb-searchbar']//input[@class='nav-bb-button']"));
		weClickButton.click();
	
		List<WebElement> listweCheckBox=driver.findElements(By.xpath("//div[@id='p_n_g-1003517064111/36816607011']//i[@class='a-icon a-icon-checkbox']"));
		for(int i=0;i<listweCheckBox.size();i++) {
			WebElement welist=listweCheckBox.get(i);
			welist.click();
			listweCheckBox=driver.findElements(By.xpath("//div[@id='p_n_g-1003517064111/36816607011']//i[@class='a-icon a-icon-checkbox']"));
			
			WebElement weclickSeeMore=driver.findElement(By.xpath("//div[@id='p_n_g-1003517064111-title']//following-sibling::ul//span[text()='See more']"));
			weclickSeeMore.click();
			listweCheckBox = driver.findElements(By.xpath("//div[@id='p_n_g-1003517064111/36816607011']//i[@class='a-icon a-icon-checkbox']"));
		}
//		WebElement weclickSeeMore=driver.findElement(By.xpath("//div[@id='p_n_g-1003517064111-title']//following-sibling::ul//span[text()='See more']"));
//		weclickSeeMore.click();
//		listweCheckBox = driver.findElements(By.xpath("//div[@id='p_n_g-1003517064111/36816607011']//i[@class='a-icon a-icon-checkbox']"));
		
		
	}

}
