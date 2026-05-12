package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioListWebElementReleted {
	/*Q1-How to get all links on a page?

Q2-How to count all buttons on a webpage?

Q3-How to select all checkboxes in a form?

Q4-How to count all images on a page?

Q5-How to click on a link based on its text?

Q6-How to print all options from a dropdown?

Q7-How to print all rows from a table?
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		work1();

	}

	public static void work1() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");


		WebElement UserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		UserName.sendKeys("admin");

		WebElement UserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		UserPassword.sendKeys("admin1");

		WebElement weLoginButton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		weLoginButton.click();
		
		Thread.sleep(5000);


		List<WebElement> weAllLinks=driver.findElements(By.xpath("//a"));
		int totalLinkOnPage=weAllLinks.size();
		for(int i=0; i<totalLinkOnPage;i++) {
			WebElement weLink=weAllLinks.get(i);
			String totalLink=weLink.getText();

			System.out.println(i+"  -  "+totalLink);


		}
		List<WebElement> weAllImage=driver.findElements(By.xpath("//img"));
		int totalimage=weAllImage.size();
		for(int i=0; i<totalimage;i++) {
			WebElement weimage1=weAllImage.get(i);
			String weTec=weimage1.getText();

			System.out.println(i+"  -  "+weTec+" ->  This is count of image on home page  ");	
		}

		Thread.sleep(3000);
		WebElement weClickLeads=driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Leads']"));
		weClickLeads.click();





		System.out.println("===========================================");


		List<WebElement> weAll=driver.findElements(By.xpath("//select[@id='bas_searchfield']//option"));
		int totalCount=weAll.size();
		for(int i=0;i<totalCount;i++) {
			WebElement webText=weAll.get(i);
			String Tect=webText.getText();
			System.out.println(Tect);


		}
		WebElement beforeweSelectAllCheckBox=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']"));
		boolean weWhatDo=beforeweSelectAllCheckBox.isSelected();
		System.out.println(weWhatDo);
		
		
		List<WebElement> ListweCheckBoxClick=driver.findElements(By.xpath("//input[@name='selected_id']"));
		int totalCheckBox=ListweCheckBoxClick.size();
		for(int i=0;i<totalCheckBox;i++) {
			WebElement weCheckBoxClick=ListweCheckBoxClick.get(i);
			Thread.sleep(1000);
			weCheckBoxClick.click();
			
			
			
		}
		WebElement afterweSelectAllCheckBox=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']"));
		boolean weWhatDo1=afterweSelectAllCheckBox.isSelected();
		System.out.println(weWhatDo1);

		
		List<WebElement> weTable=driver.findElements(By.xpath("//table"));
		int totalTable=weTable.size();
		for(int i=0; i<totalTable;i++) {
			
		System.out.println(i+"  -  "+" -> total table on the  home Page ");
		}
		
		
		
		
		
	}
		
}

