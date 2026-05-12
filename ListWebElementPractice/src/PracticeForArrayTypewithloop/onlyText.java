package PracticeForArrayTypewithloop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class onlyText {

	public static void main(String[] args) throws InterruptedException {


		work_1_ByrahulSir();
		//work2();

		
		
	}
	public static void work3() {
		
	}
	
	public static void work_1_ByrahulSir() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("http://localhost:8888/");

		WebElement weUsername= driver.findElement(By.xpath("//input[@name='user_name']"));
		weUsername.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");


		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogin.click();
		
		Thread.sleep(2000);
		List<WebElement> wetab=driver.findElements(By.xpath("//a[text()='Calendar']/ancestor::td[@class='small']//td[@class='tabUnSelected']"));
		int totalTabText=wetab.size();
		for(int i=0;i<totalTabText;i++) {
			WebElement weHomeTab=wetab.get(i);
			String InnerText=weHomeTab.getText();
			System.out.println(i+1+"  - "+InnerText);
			
		}
		
		WebElement weMouseOver=driver.findElement(By.xpath("//a[text()='More']"));
		act.moveToElement(weMouseOver).build().perform();
		
		
		List<WebElement> weMoreText=driver.findElements(By.xpath("//div[@id='allMenu']//a"));
		int totalCountMore=weMoreText.size();
		for(int i=0; i<totalCountMore;i++) {
		WebElement weOverMore=weMoreText.get(i);
		String InnerTextFound=weOverMore.getText();
		System.out.println(i+1+"  -  "+InnerTextFound);
		
		
		}
		WebElement weLead=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLead.click();
		Thread.sleep(5000);
		List<WebElement> weclick_ABCD=driver.findElements(By.xpath("//td[@class='small']//table//tr//td[@class='searchAlph']"));
		int TotalABCD=weclick_ABCD.size();
		for(int i=0;i<TotalABCD;i++) {
			WebElement webclick=weclick_ABCD.get(i);
			//Thread.sleep(2000);

			webclick.click();
			
			
		}
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void work2() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");

		WebElement weUsername= driver.findElement(By.xpath("//input[@name='user_name']"));
		weUsername.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin1");


		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogin.click();


		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();

		WebElement wePlus=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		wePlus.click();

		List<WebElement> weForm=driver.findElements(By.xpath("//input[@name='firstname']/ancestor::table[@class='small']//tr//input[@type='text']"));
		for(int i=0; i<weForm.size();i++) {
			WebElement weInput=weForm.get(i);
			weInput.sendKeys("Hii I am vimal");

		}
		//		Thread.sleep(4000);
		//		WebElement weRadioButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//		weRadioButton.click();


		Thread.sleep(3000);
		List<WebElement> weDropdown=driver.findElements(By.xpath("//input[@name='firstname']/ancestor::table[@class='small']//tr//select[@class='small']"));
		//int TotalDropDown=weDropdown.size();
		for(int i=0;i<5;i++) {
			WebElement weselect=weDropdown.get(i);
			Select selobj=new Select(weselect);
			selobj.selectByIndex(1);

		}

		List<WebElement> weTextArea=driver.findElements(By.xpath("//textarea[@class='detailedViewTextBox']"));
		for(int i=0; i<weTextArea.size();i++) {
			WebElement wearea=weTextArea.get(i);
			wearea.sendKeys("God Grant  I want become software Tester ");


		}











	}
	public static void work1() {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		//Actions act=new Actions(driver);

		List<WebElement> weText=driver.findElements(By.xpath("//a"));
		int TotalCount=weText.size();
		int blank=0;
		int text=0;
		for(int i=0; i<TotalCount; i++) {

			WebElement textfound=weText.get(i);
			String innerText=textfound.getText();


			if(innerText.equalsIgnoreCase("")==true) {
				blank=blank+1;

			}else {
				System.out.println(i+1+"  -  "+innerText);
				text=text+1;
				if(innerText.equalsIgnoreCase("Read License,Privacy Policy")) {
					System.out.println();

				}else {
					System.out.println("else");
				}


			}



		}

		System.out.println("only blank inner text count   - "+blank);
		System.out.println("only inner text count - "+text);

	}

}
