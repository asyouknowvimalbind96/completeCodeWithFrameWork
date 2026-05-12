package learnSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class neewSenario0409 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		
		String pageSource=driver.getPageSource();
		System.out.println("Page source of home paage  ."+pageSource);
		
		String Title=driver.getTitle();
		System.out.println("Title Of Login Pgae  ."+Title);
		
		
		Point loginLocation=username.getLocation();
		int  welogX=loginLocation.getX();
		System.out.println("location of X   ."+welogX);
		int weloginY=loginLocation.getY();
		System.out.println("location of Y   ."+weloginY);
		
		
		Dimension size=username.getSize();
		int actualaheight=size.getHeight();	
		System.out.println(actualaheight);
		int actualwidth=size.getWidth();
		System.out.println(actualwidth);
		
		int expetedHight=27;
		int expetedWidth=350;
		
		if(actualaheight==expetedHight && actualwidth==expetedWidth ) {
			
			System.out.println("pass");
			
		}else {
			System.out.println("faild");
		}

		Thread.sleep(3000);
		//driver.close();
		
		
		
		
		
		WebElement userPassword= driver.findElement(By.name("user_password"));
		userPassword.sendKeys("admin1");

		WebElement weblogin= driver.findElement(By.id("submitButton"));
		weblogin.click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();

		WebElement wefirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));//first name
		wefirstName.sendKeys("New Vimal");
		String foundfirstName=wefirstName.getAttribute("value");
		System.out.println("get first name check --"+foundfirstName);



		WebElement weLastName=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		weLastName.sendKeys("Bind");
		Dimension sizeoflastname=weLastName.getSize();
		int height=sizeoflastname.height;
		int width=sizeoflastname.width;

		System.out.println("Size of last name input box height --"+height);
		System.out.println("Size of last name input box width  --"+width);



		WebElement weCompany=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		weCompany.sendKeys("ABC pvt ltd");
		Thread.sleep(2000);
		weCompany.clear();
		weCompany.sendKeys("XYZ pvt Ltd");
		
		
		WebElement weemail=driver.findElement(By.xpath("//input[@id='email']"));
		weemail.sendKeys("");
		weemail.getAttribute("value");

		WebElement weSave=driver.findElement(By.xpath("//input[@class='crmButton small save']"));		
		weSave.click();

		WebElement weLeadPage=driver.findElement(By.xpath("//a[@href='index.php?action=ListView&module=Leads&parenttab=Marketing']"));
		weLeadPage.click();

		WebElement weCheckBox=driver.findElement(By.xpath("(//input[@name='selected_id'])[1]"));
		boolean check= weCheckBox.isSelected();
		System.out.println("Check box Selected or unselected  - "+check);

		
		
		boolean wedisplay=weCheckBox.isDisplayed();
		
		System.out.println(wedisplay);
		// driver.close();



	}

}
