package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameCheck {

	public static void main(String[] args) throws InterruptedException {

		abcd();

	}

	public static void abcd() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		WebElement weUser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUser.sendKeys("admin");
		String checkUser=weUser.getAttribute("value");
		System.out.println("Check user of send by me ----"+checkUser);

		WebElement wePassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword.sendKeys("admin1");
		String CheckUserP=wePassword.getAttribute("value");
		System.out.println("check password of send by me ----"+CheckUserP);

		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		weLogin.click();

		WebElement weLead=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLead.click();

		WebElement wePlush=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		wePlush.click();

		WebElement wenonclick=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		wenonclick.sendKeys("Mr.");


		WebElement weFirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		weFirstName.sendKeys("aman pal");
		String foundUserName=weFirstName.getAttribute("value");
		System.out.println("I want the name that I have sent User First Name---------"+foundUserName);
		Thread.sleep(3000);
		weFirstName.clear();	
		weFirstName.sendKeys("Vimal");
		String foundnewUserName=weFirstName.getAttribute("value");
		System.out.println("I want the name that I have Resent User First Name---------"+foundnewUserName);


		WebElement weLastName=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		weLastName.sendKeys("pal");
		String foundLastName=weLastName.getAttribute("value");
		System.out.println("I want the name i have send---------"+foundLastName);
		Thread.sleep(3000);
		weLastName.clear();
		weLastName.sendKeys("Bind");
		String foundNewLastName=weLastName.getAttribute("value");
		System.out.println("I want the name i have Resend User Last name--------- "+foundNewLastName);


		WebElement weCompany=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		weCompany.sendKeys("IICT institute miyachak barsathi");
		String foundCompanyName=weCompany.getAttribute("value");
		System.out.println("I want the name i have sent user company name ----------"+foundCompanyName);
		Thread.sleep(2000);
		weCompany.clear();

		weCompany.sendKeys("Expert View Automation Mondh");
		String foundNewCompanyName=weCompany.getAttribute("value");
		System.out.println("i want the name i have resend user Company Name----------"+foundNewCompanyName);

		WebElement wePhone=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		wePhone.sendKeys("7800628135");
		String foundPhoneNum=wePhone.getAttribute("value");
		System.out.println("i want the number i have send Number----------"+foundPhoneNum);
		Thread.sleep(2000);
		wePhone.clear();
		wePhone.sendKeys("7237014308");
		String foundNewPhone=wePhone.getAttribute("value");
		System.out.println("i want the number i have resend phone number----------"+foundNewPhone);

		WebElement weMobile=driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		weMobile.sendKeys("7800628135");
		String foundMobile=weMobile.getAttribute("value");
		System.out.println("I want mobile number i have sent mobile number----------"+foundMobile);
		Thread.sleep(2000);
		weMobile.clear();

		weMobile.sendKeys("7232916286");
		String foundNewMobileNumber=weMobile.getAttribute("value");
		System.out.println("I want mobile number i have Resend mobile number----------"+foundNewMobileNumber);







		Thread.sleep(8000);
		driver.close();
	}



























	public static void firstSenario() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.manage().window().maximize();

		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 

		weUserName.sendKeys("admin");


		By bypassword=By.xpath("//input[@name='user_password']");
		WebElement weUserpassword= driver.findElement(bypassword);
		weUserpassword.sendKeys("admin1");


		By bylogin=By.xpath("//input[@type='submit']");
		WebElement welogin=driver.findElement(bylogin);
		welogin.click();


		By bylead=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement weLead=driver.findElement(bylead);
		weLead.click();

		By byplushclick=By.xpath("//img[@alt='Create Lead...']");
		WebElement wePlushClick=driver.findElement(byplushclick);
		wePlushClick.click();

		By byTitleList=By.xpath("//select[@name='salutationtype']");
		WebElement weTitleList=driver.findElement(byTitleList);
		weTitleList.sendKeys("Mr.");

		By byfirstName=By.xpath("//input[@name='firstname']");
		WebElement wefirstName=driver.findElement(byfirstName);
		wefirstName.sendKeys("aman pal, jay gupta, etc.---");
		Thread.sleep(5000);
		String valueafterClear=wefirstName.getAttribute("value");		
		System.out.println("first enter wrong name--"+valueafterClear);
		wefirstName.clear();
		wefirstName.sendKeys("vimal bind");
		String valuerightName=wefirstName.getAttribute("value");
		System.out.println("right name of send name---"+valuerightName);




		By bylastName=By.xpath("//input[@name='lastname']");
		WebElement welastName=driver.findElement(bylastName);
		welastName.sendKeys("Bind");

		Thread.sleep(7000);


		driver.close();



	}


	
	
	
	
	public static void senario2() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.manage().window().maximize();

		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 

		weUserName.sendKeys("admin");


		By bypassword=By.xpath("//input[@name='user_password']");
		WebElement weUserpassword= driver.findElement(bypassword);
		weUserpassword.sendKeys("admin1");


		By bylogin=By.xpath("//input[@type='submit']");
		WebElement welogin=driver.findElement(bylogin);
		welogin.click();

		WebElement weseachBox=driver.findElement(By.xpath("//input[@name='query_string']"));
		weseachBox.sendKeys("Contact1");
		String getSearch=weseachBox.getAttribute("value");
		System.out.println("send value----"+getSearch);

		Thread.sleep(5000);

		weseachBox.clear();
		weseachBox.sendKeys("Lead1"); 
		String ClearValue=weseachBox.getAttribute("value");
		System.out.println("after clear value--"+ClearValue);


		By bylead=By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement weLead=driver.findElement(bylead);
		weLead.click();

		By byplushclick=By.xpath("//img[@alt='Create Lead...']");
		WebElement wePlushClick=driver.findElement(byplushclick);
		wePlushClick.click();

		By byTitleList=By.xpath("//select[@name='salutationtype']");
		WebElement weTitleList=driver.findElement(byTitleList);
		weTitleList.sendKeys("Mr.");

		By byfirstName=By.xpath("//input[@name='firstname']");
		WebElement wefirstName=driver.findElement(byfirstName);
		wefirstName.sendKeys("aman pal, jay gupta, etc.---");

		String valueafterClear=wefirstName.getAttribute("value");
		System.out.println("first enter wrong name--"+valueafterClear);
		wefirstName.clear();

		wefirstName.sendKeys("vimal bind");
		String valuerightName=wefirstName.getAttribute("value");
		System.out.println("right name after clear--"+valuerightName);

	}

}
