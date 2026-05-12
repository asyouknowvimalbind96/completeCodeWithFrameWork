package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Constructorclass {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		
	}

}
