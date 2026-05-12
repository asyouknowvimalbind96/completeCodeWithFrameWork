package learnSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario05092025 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		

		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("current URL  of page - "+CurrentURL);
		
		String PageTitle=driver.getTitle();
		System.out.println("title is Vtiger  -"+PageTitle);
		
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys(" admin & ");
		String usertexBox= username.getAttribute("value");
		System.out.println("value of user name after send --"+usertexBox);
		username.clear();
		
		String usernameClear=username.getAttribute("value");
		System.out.println("value of user name after cleare  --"+usernameClear);
		username.sendKeys("admin");
		
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userPassword.sendKeys("admin1");
		
		WebElement loginclick=driver.findElement(By.xpath("//input[@type='submit']"));
		boolean displayLogin=loginclick.isDisplayed();
		System.out.println("is the login button display -- "+displayLogin);
		
		boolean enableLogin=loginclick.isEnabled();
		System.out.println("is the login button enable -- "+enableLogin);
		
		String loginButton= loginclick.getText();
		System.out.println("get tex login button  -"+loginButton);
		
		Dimension loginsize=loginclick.getSize();
		int ExpetedHeight=loginsize.getHeight();
		System.out.println("this is actual height - "+ExpetedHeight);
		int exepetedWidth=loginsize.getWidth();
 		System.out.println("login button size of width  - "+exepetedWidth);
		
		int actualHeight=20;
		int actualedWidth=40;
		
		if (ExpetedHeight==actualHeight && exepetedWidth==actualedWidth) {		
			System.out.println("expected and actual value matched  ---   Pass ");	
		}else {
			System.out.println("expected and actual value not matched   -- Faild");	
		}
		Point Xlocation=loginclick.getLocation();
		int loginXlocation=Xlocation.getX();
		System.out.println("login button of X location -  "+loginXlocation);
		
		Point Ylocation=loginclick.getLocation();
		int loginButtonYlocation=Ylocation.getY();
		System.out.println("Login button of Y location  -  "+loginButtonYlocation);
		
		
		
		loginclick.click();
		
		
		
		
		
	}
/*
 * Scenario 1: Login Page Validation (Vtiger CRM)

Open the browser and launch Vtiger CRM login page.

Get and print the current URL, page title

In the username field, clear any existing text, type "admin", and then fetch the entered value using getAttribute("value").

In the password field, type "admin".

Check whether the Login button is displayed and enabled.

Get the text of the Login button.

Verify the size of the Login button using getSize().

If actual height = 20 and width = 40 → Print Pass.

Otherwise → Print Fail with expected vs actual.

Print the X and Y location of the Login button.

Finally, click the Login button.
 */
}
