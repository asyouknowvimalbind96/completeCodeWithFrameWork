package PracticeForArrayTypewithloop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice11 {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//div[@class='GZVzXz yAfw1d']//input[@class='lNPl8b']")).sendKeys("I Phone");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='RjvT8t']//preceding-sibling::button")).click();
				Thread.sleep(2000);
//				driver.findElement(By.xpath("//span[text()='15 MORE']")).click();
//				Thread.sleep(3000);
				List<WebElement> listcheck=driver.findElements(By.xpath("//div[@class='kMXMaw']//div[@class='ybaCDx']"));
				for(int i=0;i<listcheck.size();i++) {
					WebElement wecheckclick=listcheck.get(i);
					wecheckclick.click();
					listcheck=driver.findElements(By.xpath("//div[@class='kMXMaw']//div[@class='ybaCDx']"));
					Thread.sleep(2000);
				}




	}

}
//for(int i=0;i<10;i++) {
//	for(int j=0;j<i;j++) {
//		System.out.print(j);
//	}
//	System.out.println();
//}
//for(int k=0;k<20;k++) {
//	for(int l=0;l<k;l++) {
//		System.out.print(l);
//	}
//	System.out.println();
//}