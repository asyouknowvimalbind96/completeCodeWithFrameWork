package GivenByMam_Scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scenariobyMam29_10_2025 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		// Q1: Find how many lead records (rows) are displayed on the Leads page table and print the total count.

		System.out.println("->->->->->->->->->->find total row in lead page  ->->->->->->->->->->->->->->");

		List<WebElement> listrowonleads=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@bgcolor='white']"));
		int totalRowinLeadList=listrowonleads.size();
		
		System.out.println("total row on lead list ->  "+totalRowinLeadList);
	
		
		// Q2: Use findElements() to get all the lead names from the Leads table and print each name in the console.
	
		System.out.println("->->->->->->->->->->find  Total Name Of Lead List  ->->->->->->->->->->->->->->");

		List<WebElement> listNameOfLeadTable=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='firstname']/preceding-sibling::a"));
		for(int i=0;i<listNameOfLeadTable.size();i++) {
			WebElement weNameOflist=listNameOfLeadTable.get(i);
			String nameleadlist=weNameOflist.getText();
			System.out.println(" Total Name Of Lead List  ->  "+nameleadlist);
		}
		// Q3: Find all the checkboxes beside each lead name using findElements() and click on the first three checkboxes.
		
		System.out.println("->->->->->->->->->->find  Total Check Boxes of lead Page  ->->->->->->->->->->->->->->");

		Thread.sleep(3000);
		List<WebElement> listTotalCheckBox=driver.findElements(By.xpath("//input[@name='selected_id']"));
		int totalCountCheckBox=listTotalCheckBox.size();
		for(int i=0;i<totalCountCheckBox;i++) {
			WebElement checkBox=listTotalCheckBox.get(i);
			if(i<3) {
				checkBox.click();
			}
			
		}
		
		
		
		// Q4: Locate all the “Edit” buttons in the Leads table and print how many edit buttons are available.

		System.out.println("->->->->->->->->->->find  total edit button on lead table  ->->->->->->->->->->->->->->");

		List<WebElement> listEditButton=driver.findElements(By.xpath("//a[text()='edit']"));
		int totalCountofEditButton=listEditButton.size();
		for(int i=0;i<totalCountofEditButton;i++) {
			WebElement weEditsymbol=listEditButton.get(i);
			String text=weEditsymbol.getText();
			System.out.println(text);
		}
		System.out.println("Total Number of Edit Button  ->  "+totalCountofEditButton);

		// Q5: Get all the lead email IDs displayed in the email column and print them one by one.

		System.out.println("->->->->->->->->->->find Total Email id of lead page  ->->->->->->->->->->->->->->");

		
		List<WebElement> listofEmail=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='email']/preceding-sibling::a"));
		for(int i=0;i<listofEmail.size();i++) {
			WebElement weEmailId=listofEmail.get(i);
			String innerText=weEmailId.getText();
			boolean findemail=weEmailId.isDisplayed();
			System.out.println("Total Email id of lead page ->  "+innerText+"    Availabe Email on lead page -> "+findemail);		
		}
		
		//Q6: Use findElements() to count how many lead sources (like Website, Referral, Advertisement) are listed on the page.

		System.out.println("->->->->->->->->->->find Total Website of lead page  ->->->->->->->->->->->->->->");

		
		List<WebElement> listWebsiteonleadpage=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='website']/preceding-sibling::a"));
		int totalcountWebsite=listWebsiteonleadpage.size();
		System.out.println("Total Website on lead page ->  "+totalcountWebsite);
	
		// Q7: Find all the status values (like New, Contacted, Qualified, Lost) in the Leads table and print them.

		
		WebElement weplush=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		weplush.click();
		
		WebElement westatusValue=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		Select selobjStatusValue=new Select(westatusValue);
		selobjStatusValue.selectByIndex(1);
		String totalValueofStatus=westatusValue.getText();
		System.out.println("total text of Status Value   =====    "+totalValueofStatus);
		
		driver.navigate().back();
		
		//Q8: Locate all the lead phone numbers displayed in the table and print them in the console.

		System.out.println("->->->->->->->->->->find Total phone Number of lead page  ->->->->->->->->->->->->->->");
	
		List<WebElement> listphonenumberonleadpage=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='phone']/ancestor::td[@onmouseover]"));
		int totalcountphone=listphonenumberonleadpage.size();
		System.out.println("Total box of phone number ->  "+totalcountphone);
		for(int i=0;i<listphonenumberonleadpage.size();i++) {
			WebElement wephonenumber=listphonenumberonleadpage.get(i);
			String foundText=wephonenumber.getText();
			System.out.println("total phone number -> "+foundText);	
		}
		
		// Q9: Use findElements() to find all the lead names starting with the letter ‘A’ and print those names only.
		
		System.out.println("->->->->->->->->->->find Total Name and start with A of lead page  ->->->->->->->->->->->->->->");

		
		List<WebElement> listnameoflead=driver.findElements(By.xpath("//table[@class='lvtBg']//tr[@onmouseout]//span[@vtfieldname='firstname']/ancestor::td[@onmouseover]"));
		
		for(int i=0;i<listnameoflead.size();i++) {
			WebElement wename=listnameoflead.get(i);
			String foundname=wename.getText();
			if(foundname.startsWith("A")==true) {
				System.out.println(""+foundname);
			}else {
				System.out.println("Start with A name is not available ");
			}
		System.out.println();
		}
		// Q10: Find all Delete icons/buttons on the Leads list and click only on the last delete icon.
		
		List<WebElement> listofDeletButton=driver.findElements(By.xpath("//a[text()='del']"));
		int totalCountofDeletButton=listofDeletButton.size();
		System.out.println("Total number of delete Button ->  "+totalCountofDeletButton);
		if(!listofDeletButton.isEmpty()) {
		WebElement	lastDeletButton= listofDeletButton.get(totalCountofDeletButton-1);
		lastDeletButton.click();
		System.out.println(" clicked successfuly");
		}else {
			System.out.println("delet button is not available");
		}	
	
	}
	/*
	 * 
	 * 	List<WebElement> listofDeletButton=driver.findElements(By.xpath("//a[text()='del']"));
		int totalCountofDeletButton=listofDeletButton.size();
		System.out.println("Total number of delete Button ->  "+totalCountofDeletButton);
		if(!listofDeletButton.isEmpty()) {
		WebElement	lastDeletButton= listofDeletButton.get(totalCountofDeletButton-1);
		//lastDeletButton.click();
		}else {
			System.out.println("delet button is not available");
		}	
	
	}
	 */

	
	
}
