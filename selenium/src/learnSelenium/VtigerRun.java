package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerRun {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		driver.manage().window().maximize();
		
		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 
		weUserName.clear();
		String findval=weUserName.getAttribute("value");
		System.out.println("find text after clear --"+findval);
		weUserName.sendKeys("admin");
		String SendKey=weUserName.getAttribute("value");
		System.out.println("find text after send---"+SendKey);
		
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
		wefirstName.sendKeys("Vimal");
		
		By bylastName=By.xpath("//input[@name='lastname']");
		WebElement welastName=driver.findElement(bylastName);
		welastName.sendKeys("Bind");
		
		By byCompanyName=By.xpath("//input[@name='company']");
		WebElement weCompanyName=driver.findElement(byCompanyName);
		weCompanyName.sendKeys("Expert view automation ");
		
		
		
		By byTitleName=By.xpath("//input[@name='designation']");
		WebElement weTitleName=driver.findElement(byTitleName);
		weTitleName.sendKeys("Software tester ");
		
		By byleadsourceName=By.xpath("//select[@name='leadsource']");  
		WebElement weleadsourceName=driver.findElement(byleadsourceName);
		weleadsourceName.sendKeys("Self Generater ");
		
		By byIndustryName=By.xpath("//select[@name='industry']");
		WebElement weIndustryName=driver.findElement(byIndustryName);
		weIndustryName.sendKeys("Education");
		
		By byAnnualRevenue=By.xpath("//input[@name='annualrevenue']");
		WebElement weAnnualRevenue=driver.findElement(byAnnualRevenue);
		weAnnualRevenue.clear();
		weAnnualRevenue.sendKeys("2000");
		
		By byNoOfEmp=By.xpath("//input[@name='noofemployees']");
		WebElement weNoOfEmp=driver.findElement(byNoOfEmp);
		weNoOfEmp.clear();
		weNoOfEmp.sendKeys("10");
		
		By bySecondEmail=By.xpath("//input[@name='secondaryemail']");
		WebElement weSecondEmail=driver.findElement(bySecondEmail);
		weSecondEmail.sendKeys("ramvimal7800@gmail.com ");
		
		By byPhone=By.xpath("//input[@name='phone']");
		WebElement wePhone=driver.findElement(byPhone);
		wePhone.sendKeys("7800628140");
		
		By byMobile=By.xpath("//input[@name='mobile']");
		WebElement weMobile=driver.findElement(byMobile);
		weMobile.sendKeys("7800628135");
		
		By byFax=By.xpath("//input[@name='fax']");
		WebElement weFax=driver.findElement(byFax);
		weFax.sendKeys("ramvimal7800@Fax.com ");
		
		By byEmail=By.xpath("//input[@id='email']");
		WebElement weEmail=driver.findElement(byEmail);
		weEmail.sendKeys("vimalbind96@gmail.com ");
		
		By byWebsite=By.xpath("(//input[@type='text'])[11]");
		WebElement weWebsite=driver.findElement(byWebsite);
		weWebsite.sendKeys("www.vimalbindadampur.com");
		
		By byLeadStatus=By.xpath("//select[@name='leadstatus']");
		WebElement weLeadStatus=driver.findElement(byLeadStatus);
		weLeadStatus.sendKeys("Junk Lead ");
		
		By byRating=By.xpath("//select[@name='rating']");
		WebElement weRating=driver.findElement(byRating);
		weRating.sendKeys("Active");
		
		By byStreet=By.xpath("//textarea[@name='lane']");
		WebElement weStreet=driver.findElement(byStreet);
		weStreet.sendKeys("Vill-Adampur Post-Nigoh Thana- Barsathi District-Jaunpur UP ");
		
		By byPOBox=By.xpath("(//input[@type='text'])[15]");
		WebElement wePOBox=driver.findElement(byPOBox);
		wePOBox.sendKeys("Nigoh");
		
		By byPostalCode=By.xpath("(//input[@type='text'])[16]");
		WebElement wePostalCode=driver.findElement(byPostalCode);
		wePostalCode.sendKeys("222162");
		
		By byCity=By.xpath("(//input[@type='text'])[17]");
		WebElement weCity=driver.findElement(byCity);
		weCity.sendKeys("Jaunpur");
		
		By byState=By.xpath("(//input[@type='text'])[18]");
		WebElement weState=driver.findElement(byState);
		weState.sendKeys("Uttar Pradesh");
		
		By byCountry=By.xpath("(//input[@type='text'])[19]");
		WebElement weCountry=driver.findElement(byCountry);
		weCountry.sendKeys("India");
		
		By byDiscripation=By.xpath("(//textarea[@class='detailedViewTextBox'])[2]");
		WebElement weDiscripation=driver.findElement(byDiscripation);
		weDiscripation.sendKeys("today i practice automation code for "
		+ "best responce and best experience and i want tailent boy for coading");
		
		
		By bySaveClick=By.xpath("//input[@class='crmbutton small save']");
		WebElement weSaveClick=driver.findElement(bySaveClick);
		weSaveClick.click();
		
		By bySavebutton=By.xpath("//input[@type='submit']");
		WebElement weSavebutton=driver.findElement(bySavebutton);
		weSavebutton.click();
	
		driver.close();

	}

}
