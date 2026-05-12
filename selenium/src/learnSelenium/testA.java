package learnSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testA {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.manage().window().maximize();
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL of Vtiger Web Base Appication  - "+CurrentURL);

		String PageTitle=driver.getTitle();
		System.out.println("found page Tittle of Vtiger  - "+PageTitle);

		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		String getUserName=weUserName.getAttribute("value");
		System.out.println("found userName after sending  - "+getUserName);

		// Thread.sleep(3000);

		weUserName.clear();
		String getClearUserName=weUserName.getAttribute("value");
		System.out.println("found userName after Clearing   - "+getClearUserName);

		weUserName.sendKeys("admin");

		String getTagName= weUserName.getTagName();
		System.out.println("found Tag name of username Input  - "+getTagName);

		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		String getUserPassword=wePassword.getAttribute("value");
		System.out.println("found user Password after sending  - "+getUserPassword);

		// Thread.sleep(3000);

		WebElement weLogin=driver.findElement(By.xpath("//input[@id='submitButton']"));
		Dimension SizeofLoginButton=weLogin.getSize();
		int ExpectedHeight=SizeofLoginButton.getHeight();
		System.out.println("Height of login Button  - "+ExpectedHeight);
		int Expectedwidth=SizeofLoginButton.getWidth();
		System.out.println("Width of login Button "+Expectedwidth);

		int actualheight=25;
		int actualwidth1=160;

		if(ExpectedHeight==actualheight && Expectedwidth==actualwidth1) {
			System.out.println("Expected Height and actualHeight matched - ' Pass' ");

		}else {
			System.out.println("Expected Height and actualHeight not matched - ' Faild' ");
		}


		Point LoginButtonLocation=weLogin.getLocation();
		int XLocation=LoginButtonLocation.getX();
		System.out.println("X Location of Login Button  - "+XLocation);
		int YLocation=LoginButtonLocation.getY();
		System.out.println("Y Location of Login Button  - "+YLocation);
		System.out.println("-----------------------------------------------------------------------------------------------");

//		String pageSource=driver.getPageSource();
//		System.out.println("page Source of vtiger "+pageSource);
		System.out.println("===========================================================================================");

		//Thread.sleep(3000);
		weLogin.click();



		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
//		String Tex1=weLeads.getText();
//		System.out.println("Leads text - "+Tex1);

		WebElement wePlush=driver.findElement(By.xpath("//img[@title='Create Lead...']"));
		Dimension PlushButton=wePlush.getSize();
		int height=PlushButton.getHeight();
		System.out.println("Plush button of height  - "+height);
		int width=PlushButton.getWidth();
		System.out.println("Plush button of width  - "+width);

		Point PlushLocation=wePlush.getLocation();
		int xlocation=PlushLocation.getX();
		System.out.println("Plush of height  - "+xlocation);
		int yLocation=PlushLocation.getY();
		System.out.println("Plush of widht  - "+yLocation);
		
		wePlush.click();
		
		//  driver.close();

	}
}
