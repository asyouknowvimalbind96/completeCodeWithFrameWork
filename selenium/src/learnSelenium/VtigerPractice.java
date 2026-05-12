package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerPractice {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");

		WebElement userPassword= driver.findElement(By.name("user_password"));
		userPassword.sendKeys("admin1");

		WebElement weblogin= driver.findElement(By.id("submitButton"));
		weblogin.click();
		
		WebElement searchBox=driver.findElement(By.name("query_string"));
		searchBox.sendKeys("shoes");
		
		WebElement searchButton=driver.findElement(By.className("searchBtn"));
		searchButton.click();
		
		WebElement changeNum=driver.findElement(By.name("pagenum"));
		changeNum.clear();
		changeNum.sendKeys("10");
		
		
		WebElement searchBox1=driver.findElement(By.name("query_string"));
		searchBox1.clear();
		searchBox1.sendKeys("Project Task");
		
		WebElement searchButton1=driver.findElement(By.className("searchBtn"));
		searchButton1.click();
		
		WebElement changeNum1=driver.findElement(By.name("pagenum"));
		changeNum1.sendKeys("00");
		
		WebElement page2on=driver.findElement(By.name("global_search_module"));
		page2on.click();
		
		
		
	}

}
