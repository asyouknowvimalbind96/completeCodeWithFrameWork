package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioByMam {

	public static void main(String[] args) throws InterruptedException {

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
		Thread.sleep(1000);
		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
		
		
		WebElement wePlushButton=driver.findElement(By.xpath("//img[@title='Create Lead...']"));
		wePlushButton.click();
		
		List<WebElement> listwetotalTextBox=driver.findElements(By.xpath("//table[@class='dvtContentSpace']//input[@type='text']"));
		
		for(int i=0;i<listwetotalTextBox.size();i++) {
			WebElement wetextBox=listwetotalTextBox.get(i);
			
		boolean  checkTextBoxField=wetextBox.isDisplayed();
		System.out.println(i+" -> total Text box in Creat Lead Page  ->  "+checkTextBoxField);	
			
		}
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		System.out.println("===================code for leads page and find colam and name in colum ===============================");

		
		
		List<WebElement> listofTable=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='firstname']/preceding-sibling::a"));
		
			for(int i=0;i<listofTable.size();i++) {
				WebElement weNameofTable=listofTable.get(i);
				boolean displayedName=weNameofTable.isDisplayed();
				String wefindNameofTable=weNameofTable.getText();
				
				System.out.println(i+" -> "+wefindNameofTable+".      >>> name Properliy display or not -> "+displayedName);	
		}
		
			driver.navigate().forward();
			
			
			System.out.println("==============code for total Radio button in form ====================================");
			List<WebElement> listofRadioButton=driver.findElements(By.xpath("//input[@type='radio']"));
			int totalRaioButton=listofRadioButton.size();
			System.out.println("total Radio Butto on the form   ->   "+totalRaioButton);
			driver.navigate().back();
			driver.navigate().back();
			System.out.println("=================code for mouse over on more menu and find text =================================");

			WebElement weMore=driver.findElement(By.xpath("//a[text()='More']"));
			act.moveToElement(weMore).build().perform();
			
			List<WebElement> listofMoreOption=driver.findElements(By.xpath("//div[@id='allMenu']//a[@id='more']"));
			for(int i=0;i<listofMoreOption.size();i++){
				WebElement weListofName=listofMoreOption.get(i);
				String listMore=weListofName.getText();
				System.out.println("All name print of More dropDown  ->   "+listMore);
				
			}
//			System.out.println("=====================code for Hyperlint =============================");
//
//			List<WebElement> listofTarget=driver.findElements(By.partialLinkText("//a[@target='blank__']"));
//			for(int i=0; i<listofTarget.size();i++) {
//				WebElement wetotal=listofTarget.get(i);
//				System.out.println("total HyperLint of page  -> ");
//			}
			
			
			
			
			
	}

}
