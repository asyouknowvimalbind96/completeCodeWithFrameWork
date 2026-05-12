package GivenByMam_Scenario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartPractice {

	public static void main(String[] args) throws InterruptedException  {
		
		
		///  abcd , aman , ajay , aaaahaSHAS,  Zfjjjff
		///  Zfjjjff, aaaahaSHAS,  abcd, ajay, aman  , dfjjjff
		///  
		///
		/// 6546, 45 12, 56766, 345
		
		Set<String>  hs=new TreeSet<String>();
		hs.add("ram");
		hs.add("abcd");
		hs.add("xyz");
		hs.add("aab");
		
		for(String xyz : hs) {
			System.out.println(xyz);
		}
		
		
		
		
		
		int[] xyz= {324, 677, 677, 54645};
		for(int i=0;i<=xyz.length-1;i++) {
			int num=xyz[i];
			System.out.println(num);
		}
		
		for(int num : xyz) {
			System.out.println(num);
		}
		
		
		
		
		  		  
		  List<String> al= new ArrayList<String>();  ///  growable 
		  al.add("snxjadkj");
		  al.add("snxjadkj");
		  
		  for(int i=0; i<=al.size()-1;i=i+2) {
			    String val=al.get(i);
			    System.out.println(val);
		  }
		  
		  for(String value : al) {
			  System.out.println(value);
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  al.get(57635);
		  
		  
		  
		  ///
		  ///
		  ///ArrayList ,  LinkedList

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.flipkart.com/");

		driver.findElement(By.xpath("//div[@class='_2SmNnR']//input[@name='q']")).sendKeys("Laptop core i9 12th gen");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		Thread.sleep(5000);
		List<WebElement> listofPrice=driver.findElements(By.xpath("//div[@class='yKfJKb row']//div[@class='Nx9bqj _4b5DiR']"));
		List<WebElement> listofName=driver.findElements(By.xpath("//div[@class='col col-7-12']//div[@class='KzDlHZ']"));
		List<WebElement> listofDetail=driver.findElements(By.xpath("//div[@class='_6NESgJ']"));
		for(int i=0;i<listofName.size();i++) {
		WebElement weNameofLaptop= listofName.get(i);
			String textisLaptop=weNameofLaptop.getText();
			System.out.println(i+1+"    Print Name of laptop  ->   "+textisLaptop);

		WebElement weprice=listofPrice.get(i);
			String foundtext=weprice.getText();
			System.out.println(" rate of  laptop -> "+foundtext);
		WebElement weDetail=listofDetail.get(i);
			String forDetail=weDetail.getText();
			System.out.println("Details of laptop ->  "+forDetail);
			System.out.println("   ");
			System.out.println("                                 ");



		}	
	}

}
