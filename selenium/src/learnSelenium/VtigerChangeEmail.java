package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerChangeEmail {

	public static void main(String[] args) {
	
				
				
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://localhost:8888/");
				
				By byUserName=By.xpath("//input[@name='user_name']");
				WebElement weUserName=driver.findElement(byUserName);
				weUserName.sendKeys("admin");
				
				By byUserPassword=By.xpath("//input[@name='user_password']");
				WebElement wepassword=driver.findElement(byUserPassword);
				wepassword.sendKeys("admin1");
				
				
				By byLoginClick=By.xpath("//input[@type='submit']");
				WebElement weLoginClick=driver.findElement(byLoginClick);
				weLoginClick.click();
				
				WebElement weclickAccount=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
				weclickAccount.click();
				
				By byClickReference=By.xpath("//a[@id='_my_preferences_']");
				WebElement weClickReference=driver.findElement(byClickReference);
				weClickReference.click();
				
				
				By byEditClick=By.xpath("//input[@class='crmButton small edit']");
				WebElement weEditClick=driver.findElement(byEditClick);
				weEditClick.click();
				
				
				By byClearEmailBox=By.xpath("//input[@name='email1']");
				WebElement weClearEmailBox=driver.findElement(byClearEmailBox);
				weClearEmailBox.clear();
				weClearEmailBox.sendKeys("admin123@gmail.com");
				
				By byClickSave=By.xpath("(//input[@accesskey='S'])[1]");
				WebElement weClickSave=driver.findElement(byClickSave);
				weClickSave.click();
				
				By byClickHomepage=By.xpath("(//img[@border='0'])[6]");
				WebElement weClickHomepage=driver.findElement(byClickHomepage);
				weClickHomepage.click();
				
				By byClickLead=By.xpath("(//a[@href='index.php?module=Leads&action=index'])");
				WebElement weClickLead=driver.findElement(byClickLead);
				weClickLead.click();
				
				By byClickCheckbox=By.xpath("(//input[@type='checkbox'])[2]");
				WebElement weClickCheckbox=driver.findElement(byClickCheckbox);
				weClickCheckbox.click();
				
				
				By byClickSendEmail=By.xpath("(//input[@class='crmbutton small edit'])[6]");
				WebElement weClickSendEmail=driver.findElement(byClickSendEmail);
				weClickSendEmail.click();
				
				
				By byClickCheckbox2=By.xpath("(//input[@type='checkbox'])[4]");
				WebElement weClickCheckbox2=driver.findElement(byClickCheckbox2);
				weClickCheckbox2.click();
	
				By byselectButton=By.xpath("(//input[@class='crmbutton small create'])[3]");
				WebElement weSelectbutton=driver.findElement(byselectButton);
				weSelectbutton.click();
				
				
	}

}
