package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTestGivenByMam {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
        driver.manage().window().maximize();
		// driver.manage().window().minimize();
        
      String title=driver.getTitle();
      
      String pageSorce=driver.getPageSource();
      
      System.out.println("show html page ---"+pageSorce);
      
        System.out.println("Title Name----- "+title);
		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 
		weUserName.clear();
		
		String valin_inputbox=weUserName.getAttribute("value");
		System.out.println("valin_inputbox after clear--"+valin_inputbox);
		weUserName.sendKeys("admin");
		String val_inputbox=weUserName.getAttribute("value");
		System.out.println("valin_inputbox afer entering a admin value---"+val_inputbox);
		
		String strobj=weUserName.getAttribute("name");
		System.out.println(strobj);
		
		
		

		By bypassword=By.xpath("//input[@name='user_password']");
		WebElement weUserpassword= driver.findElement(bypassword);
		weUserpassword.sendKeys("admin1");
		
		By bylogin=By.xpath("//input[@type='submit']");
		WebElement welogin=driver.findElement(bylogin);
		welogin.click();


		WebElement wetext=driver.findElement(By.xpath("//a[text()='Leads']"));
		String ab=wetext.getAttribute("href");
		System.out.println("Attributes Value of Leads---"+ab);		
		String showinnerText2=wetext.getText();
		System.out.println("InnerText of Products---"+showinnerText2);
		wetext.click();


		WebElement weOrgnazetion=driver.findElement(By.xpath("//a[text()='Organizations']"));
		String showOrganazation=weOrgnazetion.getAttribute("href");
		System.out.println("Attributes Value of Organizations ---"+showOrganazation);
		String showinnerText1=weOrgnazetion.getText();
		System.out.println("InnerText of Products---"+showinnerText1);
		weOrgnazetion.click();


		WebElement weHomeattributeVal=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		String OporatunitiesVal=weHomeattributeVal.getAttribute("href");
		System.out.println("Attributes Value of Opportunities---"+OporatunitiesVal);		
		String showinnerText=weHomeattributeVal.getText();
		System.out.println("InnerText of Products---"+showinnerText);
		weHomeattributeVal.click();



		WebElement weProducts=driver.findElement(By.xpath("//a[text()='Products']"));
		String ProductVal=weProducts.getText();
		System.out.println("InnerText of Products---"+ProductVal);
		weProducts.click();



		WebElement weDocument=driver.findElement(By.xpath("//a[text()='Documents']"));
		String Document=weDocument.getText();
		System.out.println("InnerText of Document---"+Document);
		weDocument.click();


		WebElement weEmail=driver.findElement(By.xpath("//a[text()='Email']"));
		String returnEmail=weEmail.getAttribute("href");
		System.out.println("Attributes Value of Opportunities---"+returnEmail);
		
		String showinnerText3=weEmail.getText();
		System.out.println("InnerText of Products---"+showinnerText3);
		weEmail.click();


		WebElement weEmail2=driver.findElement(By.xpath("//a[text()='Email']"));
		String Returnemail2=weEmail2.getText();
		System.out.println("InnerText of Email---"+Returnemail2);
		weEmail2.click();
		
		WebElement weDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		String Dashboard=weDashboard.getAttribute("href");
		System.out.println(Dashboard);
		String showinnerText4=weDashboard.getText();
		System.out.println("InnerText of Products---"+showinnerText4);
		weDashboard.click();
		
		
		
		
		
		
		 


		 Thread.sleep(9000);
		 driver.close();



	}

}
