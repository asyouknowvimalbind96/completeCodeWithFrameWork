package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class XpathPractice {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Amazon();
		
		//AutomationPractice();
		
		
		
		
	}
	

	/*
	 *  No | Question                                                          | Concept              |
| -- | ----------------------------------------------------------------- | -------------------- |
| 1  | Find XPath of the *search box*                                  | By attribute → @id |
| 2  | Find XPath of *search button*                                   | By attribute → @id |
| 3  | Find XPath of *first product name*                              | Relative XPath       |
| 4  | Find XPath of *first product price*                             | Index                |
| 5  | Find XPath of any product name using *contains(text(),'Shoes')* | contains()           |
	 * 
	 */
	
		public static void Amazon() throws InterruptedException {
			
		//  code runing susscusuful
			
			
			
		ChromeDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		WebElement weSearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		weSearch.sendKeys("wood land shoes");
		
		Thread.sleep(1000);

		WebElement weClickSearchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		weClickSearchButton.click();
		
		Thread.sleep(1000);

		act.scrollByAmount(0, 500).build().perform();
		
		Thread.sleep(3000);

		WebElement weFindPriceByName=driver.findElement(By.xpath("//span[text()='EVA Lite Sneakers']/ancestor::div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']/following-sibling::div[@data-cy='price-recipe']//span[@class='a-price']"));
		Thread.sleep(1000);

		String ActualPrice=weFindPriceByName.getText();
		Thread.sleep(1000);

		System.out.println(ActualPrice);
	
	}

		
		
		/*o	Question	Concept
6	Find XPath of First Name input field	Attribute
7	Find XPath of Gender Radio Button (Male)	text()
8	Find XPath of Mobile Number field	Attribute
9	Find XPath of Submit button using contains(@id, 'submit')	contains()
10	Find XPath of parent div of first name field	parent::
		 * 
		 */
		public static void AutomationPractice() throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			Actions act=new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			
			act.scrollByAmount(20, 400);
			WebElement weFirstName=driver.findElement(By.xpath("//form[@id='userForm']//input[@id='firstName']"));
			Thread.sleep(2000);
			weFirstName.sendKeys("Vimal");
			
			WebElement weLastName=driver.findElement(By.xpath("//form[@id='userForm']//input[@id='lastName']"));
			Thread.sleep(2000);

			weLastName.sendKeys("Bind");
			Thread.sleep(2000);

			WebElement weEmail=driver.findElement(By.xpath("//form[@id='userForm']//input[@id='userEmail']"));
			weEmail.sendKeys("ramvimal7800@gmail.com");
			Thread.sleep(2000);

//			WebElement weMaleGender=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
//			Thread.sleep(2000);
//			
//			weMaleGender.click();
//			Thread.sleep(2000);

			WebElement weMobileNumber=driver.findElement(By.xpath("//form[@id='userForm']//input[@id='userNumber']"));
			weMobileNumber.sendKeys("7800628135");
			Thread.sleep(2000);

			WebElement weDateOfBirth=driver.findElement(By.xpath("//form[@id='userForm']//input[@id='dateOfBirthInput']"));
			weDateOfBirth.click();
	
			
			WebElement weYearClick=driver.findElement(By.xpath("//div[@class='react-datepicker__header']//select[@class='react-datepicker__year-select']"));
			Select selForYear=new Select(weYearClick);
			selForYear.selectByVisibleText("2003");
			
			WebElement wemonthClick=driver.findElement(By.xpath("//div[@class='react-datepicker__day-names']/preceding-sibling::div//select[@class='react-datepicker__month-select']"));
			Select sel=new Select(wemonthClick);
			sel.selectByIndex(2);
			
			Thread.sleep(4000);
			WebElement weDaySelect=driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, March 23rd, 2003']/following-sibling::div[@aria-label='Choose Thursday, March 27th, 2003']"));
			act.doubleClick(weDaySelect);
			//weDaySelect.click();
			
			
			WebElement weSubject=driver.findElement(By.xpath("//div[@id='subjectsContainer']//input[@id='subjectsInput']"));
			weSubject.click();
			Thread.sleep(2000);
			weSubject.sendKeys("Hi everyone good morning my name vimal bind");
			
			
			
			Thread.sleep(2000);
			WebElement weHobbi=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
			weHobbi.click();
			
			
			WebElement weaddress=driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//textarea[@id='currentAddress']"));
			weaddress.sendKeys("Adampur nigoh jaunpur up");
			
			Thread.sleep(2000);

			WebElement weState=driver.findElement(By.xpath("//div[text()='Select State']"));
			Select selState=new Select(weState);
			weState.click();
			selState.selectByVisibleText("Uttar Pradesh");
			
			Thread.sleep(2000);

			WebElement weCity=driver.findElement(By.xpath("//div[text()='Select City']"));
			Select selCity=new Select(weCity);
			weCity.click();
			selCity.selectByVisibleText("Jaunpur");
			
			Thread.sleep(2000);

			WebElement weSubmit=driver.findElement(By.xpath("//div[@class='mt-4 justify-content-end row']//button[@id='submit']"));
			weSubmit.click();
			
			
			
			
			
			
			
			
			
			
			
		}
}
