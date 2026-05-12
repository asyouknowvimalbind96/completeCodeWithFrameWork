package PracticeForArrayTypewithloop;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class vTiger {
	/*List<WebElement> weTag=driver.findElements(By.xpath("//a"));
		int blank=0;
		int text=0;
		for(int i=0; i<weTag.size();i++) {
		WebElement Tag=	weTag.get(i);
		String innerText=Tag.getText();	

		if(innerText.equalsIgnoreCase("")==true) {
			blank=blank+1;
		}else {
		System.out.println(i+1+"    -   "+innerText);
		text=text+1;

		}
		
		}
		System.out.println("========================");
		System.out.println("Inner Text count is  - "+text);
		System.out.println("Inner text in blank line is  - "+blank);
		
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		//work1();
		//work2();
		//work3();
		//work4();
		work5();
	}
	public static void work1() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		
		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		Thread.sleep(1000);
		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
		Thread.sleep(3000);
		
		WebElement wecheckSelected=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']"));
		boolean checkbox=wecheckSelected.isSelected();
		System.out.println("before clicking - "+checkbox);
		
		List<WebElement> CheckBoxes=driver.findElements(By.xpath("//input[@name='selected_id']"));
		for(int i=0; i<CheckBoxes.size();i++) {
			WebElement LeadsCheckBox =CheckBoxes.get(i);
			LeadsCheckBox.click();	
		}
		//Thread.sleep(5000);
		WebElement wecheckSelected1=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']"));
		boolean checkbox2=wecheckSelected1.isSelected();
		System.out.println("after click - "+checkbox2);

		driver.quit();
		
		
		
}
	public static void work2() throws InterruptedException {
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		Actions act=new Actions(driver);
		
		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		Thread.sleep(4000);
		WebElement wePick=driver.findElement(By.xpath("//table[@class='small showPanelBg']//div[@id='stuff_14']//tr[@id='headerrow_14']"));
		
		//WebElement weRelease=driver.findElement(By.xpath("//tr[@id='headerrow_32']//td//b"));
		WebElement weRelease=driver.findElement(By.xpath("//tr[@id='headerrow_32']//td//b"));

		
		//tr[@id='headerrow_10']//b
		//act.dragAndDrop(weDraw, weRelease).build().perform();
		
		act.clickAndHold(wePick).moveToElement(weRelease).release(weRelease).build().perform();
		
		
	}
	
	
	public static void work3() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		Actions act=new Actions(driver);
		
		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		Thread.sleep(3000);
		WebElement wehome=driver.findElement(By.xpath("//div[@id='notebook_31']"));
		act.doubleClick(wehome).doubleClick(wehome).build().perform();		
		
	}
	public static void work4() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement weSearchBox=driver.findElement(By.xpath("//div[@id='center']//input[@name='search_query']"));
		weSearchBox.sendKeys("mai jhuth nahi bolta");
		WebElement weClickSearch=driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']//span[@class='ytIconWrapperHost']"));
		weClickSearch.click();
		
		WebElement weClickPicture=driver.findElement(By.xpath("(//div[@id='overlays']//ancestor::a[@id='thumbnail']//img)[9]"));
		weClickPicture.click();
		
	}
	
	public static void work5() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		
		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		
		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		
		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLogin.click();
		
		Thread.sleep(4000);
		List<WebElement> wecheckTag=driver.findElements(By.xpath("//a"));
		int totalCount=wecheckTag.size();
		int blank=0;
		int Text=0;
		for(int i=0; i<totalCount; i++) {
			WebElement weTag=wecheckTag.get(i);
			String foundInnerText=weTag.getText();
			if(foundInnerText.equalsIgnoreCase("")==true) {
				blank=blank+1;
				System.out.println(blank);
				
			}else {
				System.out.println(i+1+"  -  "+foundInnerText);

				Text=Text+1;

			}	

		}
		System.out.println("------------------------------------");

		System.out.println("total Inner Text on home page  - "+Text);
		System.out.println("------------------------------------");
		System.out.println("total Inner Text is not available on this page -  "+blank);
		driver.quit();
		
	}
	}


