package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLunching {


	public static void main(String[] args) {
		VtigerOtherPractice();


	}

	public static void facebookLunching1() {
		ChromeDriver driver=new ChromeDriver();
		String url="http://www.facebook.com/";
		driver.get(url);
		By obj1=By.name("email");
		WebElement enterEmail= driver.findElement(obj1);
		enterEmail.click();
		enterEmail.sendKeys("Vimal Bind");

		By obj2=By.name("pass");
		WebElement enterPassword=driver.findElement(obj2);
		enterPassword.click();
		enterPassword.sendKeys("Vimal@");

		By obj3=By.name("login");
		WebElement clickloginButton=driver.findElement(obj3);
		clickloginButton.click();
	}


	public static void VtigerOtherPractice() {

		ChromeDriver driver=new ChromeDriver();	
		driver.get("http://localhost:8888/");

		WebElement weUserName=driver.findElement(By.name("user_name"));
		weUserName.sendKeys("admin");

		WebElement weUserPassword=driver.findElement(By.name("user_password"));
		weUserPassword.sendKeys("admin1");

		WebElement welogin=driver.findElement(By.id("submitButton"));
		welogin.click();

		WebElement weClickOrganation=driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		weClickOrganation.click();

		WebElement weclickPlush=driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
		weclickPlush.click();

		WebElement weOrganation=driver.findElement(By.xpath("//input[@name='accountname']"));
		weOrganation.sendKeys("Vimal Chand Bind");

		WebElement weClickWebsiteBox=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[2]"));
		weClickWebsiteBox.sendKeys("www.vimalpanshopadampurnigoh.com");

		WebElement wePhone=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]"));
		wePhone.sendKeys("+91 7800628135");

		WebElement weTicketSymble=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[4]"));
		weTicketSymble.sendKeys("I have don't idea for ticket Symble");

		WebElement weFax=driver.findElement(By.name("fax"));
		weFax.sendKeys("www.vimalchandbind.fax.com");

		WebElement weOtherPhone=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[6]"));
		weOtherPhone.sendKeys("2nd 7800628140 ");

		WebElement weEmployees=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[7]"));
		weEmployees.sendKeys("self employee");
		
		WebElement weEmail=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[8]"));
		weEmail.sendKeys("ramvimal8419@gmail.com");
		
		WebElement weOtherEmail=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[9]"));
		weOtherEmail.sendKeys("ramvimal7800@gmail.com");
		
		WebElement weOwener=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[10]"));
		weOwener.sendKeys("private");
		
		WebElement weSICCode=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[11]"));
		weSICCode.sendKeys("private");
		
		WebElement weAnnualRevenue=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[12]"));
		weAnnualRevenue.sendKeys("400");
		
		WebElement weBillingBox=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[13]"));
		weBillingBox.sendKeys("bill rorcing");
		
		WebElement weShippingPOBox=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[14]"));
		weShippingPOBox.sendKeys("name vimal chand bind");
		
		WebElement weBillingCity=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[15]"));
		weBillingCity.sendKeys("bhadohi");
		
		WebElement weShippingCity=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[16]"));
		weShippingCity.sendKeys("jaunpur");
		
		WebElement weBillingState=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[17]"));
		weBillingState.sendKeys("Maharastra");
		
		WebElement weShippingState=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[18]"));
		weShippingState.sendKeys("Uttar Pradesh");
		
		WebElement BillingPostalCode=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[19]"));
		BillingPostalCode.sendKeys("222163");
		
		WebElement weShippingPostalCode=driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[20]"));
		weShippingPostalCode.sendKeys("222162");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}		
}
/*  
 * 
 * 
 * 
 * 
 */


