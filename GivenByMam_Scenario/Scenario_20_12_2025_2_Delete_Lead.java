package GivenByMam_Scenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Scenario_20_12_2025_2_Delete_Lead extends LoginClass {

	public static void main(String[] args) throws InterruptedException {
		Login();
		WebElement weclickCheckBox=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']//ancestor::tr//following-sibling::tr[@bgcolor='white']//input"));    
		weclickCheckBox.click();
		boolean beforeDeleting=weclickCheckBox.isDisplayed();           //input[@id='29']
		System.out.println("before Deleting lead >>  "+beforeDeleting);

		Thread.sleep(4000);
		WebElement weDeleteButton=driver.findElement(By.xpath("//table[@class='small']//input[@class='crmbutton small delete']"));
		weDeleteButton.click();
		
		Alert alrt=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt.accept();
		Thread.sleep(6000);
		weclickCheckBox=driver.findElement(By.xpath("//input[@id='selectCurrentPageRec']//ancestor::tr//following-sibling::tr[@bgcolor='white']//input"));
		boolean afterDeleting=weclickCheckBox.isDisplayed();
		System.out.println("after Deleting lead >> "+afterDeleting);
		
		
		
	}

}
