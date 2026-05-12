package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class interview {



	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.get("https://www.amazon.in/");

		// Search Laptop
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
		.sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// Apply Price Filter (20k - 60k)
		// Amazon usually provides predefined ranges instead of sliders
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[text()='₹20,000 - ₹50,000' or text()='₹50,000 - ₹60,000']")))
		.click();

		// Apply RAM Filter (8 GB)
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[contains(text(),'8 GB')]")))
		.click();

		// Wait for results to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@data-component-type='s-search-result']")));

		// Get all results
		List<WebElement> results = driver.findElements(
				By.xpath("//div[@data-component-type='s-search-result']"));

		// Click 2nd product
		results.get(1).click();

		// Switch to new tab
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}

		// Verify product page (title visible)
		WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("productTitle")));

		if (title.isDisplayed()) {
			System.out.println("Product page opened successfully");
		} else {
			System.out.println("Product page NOT opened");
		}

	}

}
