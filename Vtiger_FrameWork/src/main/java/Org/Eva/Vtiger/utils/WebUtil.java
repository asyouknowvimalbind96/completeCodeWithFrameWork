package Org.Eva.Vtiger.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;







public class WebUtil {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}


	/*@getHitUrl method is use to lunch Browser and hit Url
	 *@param Url String To hit The Url on Browser
	 *@param Browser Which Type Browser you want to lunch 
	 */
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("invalid browser   :"+browser);
		}
	}


	/* 
	 * @Get method is use to hit Url in browser
	 * @param url Url send in parameter for hit Url in the browser
	 */
	public void getURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//////////////////////// All WebDriver and WebElement Wrapper methods  /////////////////////////

	public  List<WebElement> find_Elements(List<WebElement> webElement) {
		List<WebElement> elements=findElements(webElement);
		return elements;
	
	}
	/*@ Click method is use to click any Element on Webpage
	 * @param xpath Xpath String to located the Element
	 */
	public void click(WebElement webElement)  {
		try {	
			webElement.click();
		}catch(NoSuchElementException e) {
			explicitWait_For_elementToBeClickable(webElement,60);
			webElement.click();
		}catch(ElementNotInteractableException e) {
			jsClick(webElement);
		}catch(Exception e) {		
			e.printStackTrace();
			throw e;
		}
	}
public List<WebElement> findElements(List<WebElement> webElement) {
	return webElement;
}

	/* @SendKeys method is use to send text value in input box 
	 * @param xpath  Xpath String to the located Element
	 * 	@param SendValue SendValue string  for value send in field
	 */
	public void sendKeys(WebElement webElement ,String value) {
		try {
			webElement .clear();
			webElement.sendKeys(value);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			webElement.sendKeys(value);
		}catch(ElementNotInteractableException e) {	
			jsSendKeys(webElement, value);
		}catch(Exception e) {
		e.printStackTrace();
		throw e;
		}	
	}
	/**@o method is use to bring InnerText on HTML Code
	 *@param xpath Xpath string to the located Element
	 *@return returns Inner text of Element
	 */
	public String getText(WebElement webElement) {
		try {
			String text=webElement.getText();
			return text;
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			String wetextget=webElement.getText();
			return wetextget;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	public void verifyAllElement(String xpath) {
		List<WebElement> allCount=driver.findElements(By.xpath(xpath));
		System.out.println(allCount.size());
	}

	/**@param xpath Xpath string to the located Element 
	 *@return returns TagName name in HTML code of Element
	 *
	 */
	public String getTagName(WebElement webElement) {
		try {
			String tagName=webElement.getTagName();
			return tagName;
		}catch(NoSuchElementException e) {
			WebElement weTagname=explicitWait_For_visibilityOf(webElement ,60);
			String tag=weTagname.getTagName();
			return tag;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/**
	 * @getCurrentUrl method is use to take the value of Current Url on WebPage
	 *@return  value of object of String class  
	 */
	public String getCurrentUrl()  {
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	/**@getPageSource method is use to take HTML code of Current Page
	 *@return  value of object of String class  
	 */
	public String getPageSource() {
		String pageSource=driver.getPageSource();
		return pageSource;
	}
	/* @IsDisplayed method is use to Element Visible or not on WebPage and this method return true or false
	 * @param xpath Xpath string to the locate element
	 * @return if Element is Enable on UI page then return True otherwise false
	 */
	public boolean isDisplayed(WebElement webElement) {
		boolean display=webElement.isDisplayed();
		return display;
	}
	/*@isEnabled method is use to Element able for working or not on WebPage and this return true or false
	 *@param xpath Xpath String to the locate the Element on webPage
	 *@return if Element able to working then return true otherwise false
	 */
	public boolean isEnabled(WebElement webElement) {
		boolean isEnable=webElement.isEnabled();
		return isEnable;
	}
	/*@IsSelected method is use to check box or Radio button Selected or not on WebPage
	 *@param xpath to the locate Element of on webPage
	 *@return if check box or radio button selected then return true otherwise false
	 */
	public boolean isSelected(WebElement webElement) {
		boolean IsSelect=webElement.isSelected();
		return IsSelect;
	}
	/*@GetAttribute method is used to bring value of written text in the Input field
	 *@param xpath  Xpath string to the locate Element
	 *@param Value  Value string to send in the field
	 *@return returns written text of input Box
	 */
	public String getAttribute(WebElement webElement,String Value) {
		try {
			String attributeValue=webElement.getAttribute(Value);
			return attributeValue;
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			String getvalue=webElement.getAttribute(Value);
			return getvalue;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*@GetLocation method is use to get location of Element on Webpage
	 *@param xpath Xpath string to the locate Element
	 *@return returns locations of UI Page 
	 */ 
	public Point getLocation(WebElement webElement) {
		Point location;
		try {
			 location=webElement.getLocation();
			return location;
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			 location=webElement.getLocation();
			return location;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}


	/*@ GetSize method is used to give size of any Element on UI Page
	 *@ param xpath Xpath string to the locate Element
	 *@ return returns  size of Element On UI Page
	 */ 
	public Dimension getSize(WebElement webElement) {
		Dimension size;
		try {
			size=webElement.getSize();
			return size;
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			 size=webElement.getSize();
			return size;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*@Clear method is used to cleare Value in input box
	 *@param xpath Xpath string to the locate Element
	 *
	 */
	public void clear(WebElement webElement) {
		try {
			webElement.clear();
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			webElement.clear();
		}catch(ElementNotInteractableException e) {
			jsCleare(webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
	}
	/*@GetTitle method is used to give Title Name on present page
	 *@param xpath Xpath string to the locate Element
	 */
	public  String getTitle() {

		try {
			String get_Title=driver.getTitle();
			return get_Title;
		}catch(NoSuchElementException e) {
			String title=driver.getTitle();	
			return title;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * @close method is use to close all window
	 */
	public void closeBrowser() {
		try {
			driver.close();
		}catch(NoSuchSessionException e) {
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * @quit method is use to quit present window
	 */
	public void quit() {
		driver.quit();
	}
	/*
	 * @maximize method is use to maximize window
	 */
	public void maximized() {
		driver.manage().window().maximize();
	}
	/*@ThreadSleep method is use to break for Script of given time by ScriptExecutor
	 *@param durationIn_Milli_Second in int to stop script
	 */
	public void threadSleep(int durationInSecond)  {
		try {
			Thread.sleep(durationInSecond*1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

	//18
	////////////   All Select Class generic methods  /////////////////////

	/* @selectByVisibleText method is use to Select Text in DropDown By Send Text In String formate
	 * @param xpath Xpath String to the locate Element
	 * @param value Value String for select value on the DropDown list
	 */
	public void selectByVisibleText(WebElement webElement,String value) {
		Select sel;
		try {
			sel=new Select(webElement);
			sel.selectByVisibleText(value);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			sel=new Select(webElement);
			sel.selectByVisibleText(value);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * @selectByIndex method is use to Select text in DropDown By Indexing
	 * @param xpath Xpath String to the locate Element
	 * @param value  Value int for select text on the dropDown list By indexing
	 */
	public void selectByIndex(WebElement webElement,int value) {
		Select sel;
		try {
			sel=new Select(webElement);
			sel.selectByIndex(value);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			sel=new Select(webElement);
			sel.selectByIndex(value);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@selectByValue method is use to select Text in DropDown Select By Attribute name Value
	 * @param xpath Xpath String to the locate Element
	 *@param valueOfAttributeValue   valueOfAttributeValue String for select text on the DropDown list By Value
	 */
	public void selectByValue(WebElement webElement,String valueOfAttributeValue) {
		Select sel;
		try {
			sel=new Select(webElement);
			sel.selectByValue(valueOfAttributeValue);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			sel=new Select(webElement);
			sel.selectByValue(valueOfAttributeValue);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@GetFirstSelected method is use to  Which text already Selected in the dropDown
	 *@param xpath Xpath String to the locate Element on WebPage
	 *@return this method return WebElement of the  Element 
	 */
	public WebElement getFirstSelected(WebElement webElement) {
		Select sel;
		try {
			sel=new Select(webElement);
			WebElement wefirst1 = sel.getFirstSelectedOption();
			return wefirst1;
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			sel=new Select(webElement);
			WebElement wegetFirst=sel.getFirstSelectedOption();
			return wegetFirst;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/////////// All Actions wrapper methods  /////////////////////////////

	/*@Click method is use to Click on particular Element on WebPage
	 *@param xpath Xpath string to the locate element 		
	 */
	public  void actions_Click(WebElement webElement) {
		try {
			Actions act=new Actions(driver);
			act.click(webElement).build().perform();
		}catch(NoSuchElementException e) {
			Actions act=new Actions(driver);
			WebElement weclick=explicitWait_For_visibilityOf(webElement,60);
			act.click(weclick).build().perform();
		}catch(ElementNotInteractableException e){
			jsClick(webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;		
		}
	}
	/*@MoveToElement method is use to mouse Over on Element on WebPage 
	 *@param xpath Xpath string to the locate Element
	 * 
	 */
	public  void actions_MovetoElement(WebElement webElement) {

		try {
			Actions act=new Actions(driver);
			act.moveToElement(webElement).build().perform();
		}catch(NoSuchElementException e) {
			Actions act=new Actions(driver);
			explicitWait_For_visibilityOf(webElement,60);
			act.moveToElement(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@contextClick method is use to Right click on particular Element on WebPage
	 * @param xpath Xpath string to the locate Element
	 */

	public  void actions_ContaxtClick(WebElement webElement) {
		try {
			Actions act=new Actions(driver);
			act.contextClick(webElement).build().perform();
		}catch(NoSuchElementException e) {
			Actions act=new Actions(driver);
			explicitWait_For_visibilityOf(webElement,60);
			act.contextClick(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@
	 *@param xpath Xpath string to locate the Element
	 *@param value Value string to send in the field
	 */
	public void actions_SendKeys(WebElement webElement,String value) {
		Actions act;
		try {
			 act=new Actions(driver);
			act.sendKeys(webElement,value).build().perform();
		}catch(NoSuchElementException e) {
			 act=new Actions(driver);
			explicitWait_For_visibilityOf(webElement,60);
			act.sendKeys(webElement,value).build().perform();
		}catch(ElementNotInteractableException e) {
			jsSendKeys(webElement, value);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 *@param xpath  Xpath string to the locate Element 
	 */
	public void actions_ClickAndHold(WebElement webElement) {
		Actions act;
		try {
			act=new Actions(driver);
			act.clickAndHold(webElement).build().perform();
		}catch(NoSuchElementException e) {
			explicitWait_For_elementToBeClickable(webElement,60);
			act=new Actions(driver);
			act.clickAndHold(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 *@param xpath Xpath String to the locate Element 
	 */
	public void actions_release(WebElement webElement) {
		Actions act;
		try {
			act=new Actions(driver);
			act.release(webElement).build().perform();
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			act=new Actions(driver);
			act.release(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 *@param xpath Xpath String to the locate Element
	 * 
	 */
	public void actions_DoubleClick(WebElement webElement) {
		Actions act;
		try {
			act=new Actions(driver);
			act.doubleClick(webElement).build().perform();
		}catch(NoSuchElementException e) {
			explicitWait_For_elementToBeClickable(webElement,60);
			act=new Actions(driver);
			act.doubleClick(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@param Source_xpath  Source_xpath String to Element pick here 
	 *@param Target_xpath  Target_xpath String to Element Drop there 
	 * 
	 */
	public void actions_DragAndDrop(WebElement webElement_Source,WebElement webElement_Target ) {
		Actions act;
		try {
			 act=new Actions(driver);
			act.dragAndDrop(webElement_Source, webElement_Target).build().perform();
		}catch(NoSuchElementException e) {
			 act=new Actions(driver);
			explicitWait_For_visibilityOf(webElement_Source,60);
			explicitWait_For_visibilityOf(webElement_Target,60);
			act.dragAndDrop(webElement_Source, webElement_Target).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 *@param xpath Xpath string to the locate Element
	 */	
	public void actions_ScrollToElement(WebElement webElement) {
		Actions act;
		try {
			 act=new Actions(driver);
			act.scrollToElement(webElement).build().perform();
		}catch(NoSuchElementException e) {
			 act=new Actions(driver);
			explicitWait_For_visibilityOf(webElement,60);
			act.scrollToElement(webElement).build().perform();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*@ImplicitlyWait method is use to Wait for all FindElement time
	 *@param DurationInSecond in int for you need to Choice Duration and give in parameter
	 */
	public void implicitlyWait(int DurationInSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DurationInSecond));
	}
	
	
	
	
	/*@wait_For_visibilityOfElement method is use to until wait of visibility of element
	 *@param xpath Xpath String to the locate Element
	 *@param DurationInSecond int to the use of time wait
	 */
	public WebElement explicitWait_For_visibilityOf(WebElement webElement,int durationInSecond) {
		WebDriverWait waitVisibile=new WebDriverWait(driver, Duration.ofSeconds(durationInSecond));
		WebElement weWait=waitVisibile.until(ExpectedConditions.visibilityOf(webElement));
		return weWait;
	}
	/*@wait_For_elementToBeClickable method is use to until wait of element To Be Clickable
	 *@param xpath Xpath String to the locate Element
	 *@param DurationInSecond int to the use of time wait
	 * 
	 */
	public WebElement explicitWait_For_elementToBeClickable(WebElement webElement,int durationInSecond) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(durationInSecond));
		WebElement wewait=wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return wewait;
	}
	

	/*@WindowHandles method is use to if multiple window open then which do you want go to window 
	 *            then do matched  window handle value and title or url and switch to window
	 *@param Url_Of_Next_Window String in send value of do you want matched and switch to windows
	 */
	public void windoHandlesByUrl(String Url_Of_Next_Window) {
		try {
			Set<String> all_handle_value=driver.getWindowHandles();
			for(String handleValue:all_handle_value) {
				driver.switchTo().window(handleValue);
				if(getCurrentUrl().contains(Url_Of_Next_Window)) {
					break;
				}
			}
		}catch(NoSuchWindowException e) {
			System.out.println("New window not found  ");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
	}

	public void windoHandlesByText(WebElement webElement,String expectedText) {
		try {
			Set<String> all_handle_value=driver.getWindowHandles();
			for(String handleValue:all_handle_value) {
				driver.switchTo().window(handleValue);
				String  getText=webElement.getText();
				if(getText.contains(expectedText)) {
					break;
				}

			}
		}catch(NoSuchWindowException e) {
			System.out.println("New window not found  ");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
	}

	public void windoHandlesByTitle(String title_Of_Next_Window) {
		try {
			Set<String> all_handle_value=driver.getWindowHandles();
			for(String handleValue:all_handle_value) {
				driver.switchTo().window(handleValue);
				if(driver.getCurrentUrl().contains(title_Of_Next_Window)) {
					break;
				}
			}
		}catch(NoSuchWindowException e) {
			System.out.println("New window not found  ");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
	}

	/*@windowHandle when open only two window then method is use to Switch To Window only one window to second window 
	 */
	public void windohandle() {

		String handleValue=driver.getWindowHandle();
		driver.switchTo().window(handleValue);
	}

	///////////////////////////   JavascriptExecuter method  //////////////////////////////////////////


	/*@javascriptClick method is use to click when not work 
	 * WebElement click and actions click then use to this click method By javascriptExecuter
	 *@param xpath String to the locate Element
	 */
	public void jsClick(WebElement webElement) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*jsCleare method is use to Cleare input box By javascriptExecuter
	 *@param xpath String to the locate Element
	 */
	public void jsCleare(WebElement webElement) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='';", webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@jsMoveToElement method is use to MouseOver on the Element By javascriptExecuter
	 *@param xpath String to the locate Element on webPage
	 */
	public void jsMoveToElement(WebElement webElement) {
		JavascriptExecutor jse;
		try {
			jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].dispatchEvent(new MouseEvent('mouseover', {bubbles:true}));", webElement);
		}catch(NoSuchElementException e) {
			jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].dispatchEvent(new MouseEvent('mouseover', {bubbles:true}));", webElement);
		}catch(ElementNotInteractableException e) {
			jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].dispatchEvent(new MouseEvent('mouseover', {bubbles:true}));", webElement);
		}catch(StaleElementReferenceException e) {
			jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].dispatchEvent(new MouseEvent('mouseover', {bubbles:true}));", webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*@javascriptSendkeys method is use to Sendkeys when not work WebElement sendkeys and Actions then use to this sendkeys method
	 *@param xpath String to the located Element
	 *@param Value String to the send Text in field
	 */
	public void jsSendKeys(WebElement webElement,String Value) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value=arguments[1];", webElement,Value);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value=arguments[1];", webElement,Value);
		}catch(StaleElementReferenceException e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value=arguments[1];", webElement,Value);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/////////////////////////// IFrame  ////////////////////////////////////

	/*@iFrame method is use to one Frame to switch To child Frame or Parent Frame
	 *@param xpath String to the locate Element
	 */
	public void iFrame(WebElement webElement) {
		try {
			driver.switchTo().frame(webElement);
		}catch(NoSuchElementException e) {
			WebElement weiframe=explicitWait_For_visibilityOf(webElement,60);
			driver.switchTo().frame(weiframe);
		}catch(StaleElementReferenceException e) {
			driver.switchTo().frame(webElement);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@parentFrame method is use to jump child Frame to Parent Frame
	 */
	public void parentFrame() {
		try {
			driver.switchTo().parentFrame();
		}catch(StaleElementReferenceException e) {
			driver.switchTo().parentFrame();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 *@defaultContent method is use to when work in child Frame then need work on parent then use defaultContent method
	 */
	public void defaultContent() {
		try {
			driver.switchTo().defaultContent();
		}catch(StaleElementReferenceException e) {
			driver.switchTo().defaultContent();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	///////////////////////////    For_ScreenShot  ///////////////////////////////////////

	/*@Full_Screenshot method is use to take Screenshot of full page with driver
	 *@param xpath String to the locate Element on WebPage
	 */
	public void take_Full_Screenshot(String path) throws Exception {
		try {
			TakesScreenshot  screenshot=(TakesScreenshot)driver;
			File srctake=screenshot.getScreenshotAs(OutputType.FILE);
			File destination= new File(path);
			FileUtils.copyFile(srctake, destination);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*@particularElementScreenShot method is use to take Screenshot on particural Element on the webPage with WebElement
	 *@param xpath String to the located Element on WebPage
	 *@param path String to the Decide where are store screenshot 
	 */
	public void take_ParticularElementScreenShot(WebElement webElement,String path) throws IOException {
		try {
			TakesScreenshot screenshot=webElement ;
			File scrtake=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File(path);
			FileUtils.copyFile(scrtake, destination);
		}catch(NoSuchElementException e) {
			explicitWait_For_visibilityOf(webElement,60);
			TakesScreenshot screenshot=webElement ;
			File scrtake=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File(path);
			FileUtils.copyFile(scrtake, destination);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	////////////////////////Alert   //////////////////////////
	/*
	 * @Accept_Alert method is use to Accept of Alert on working WebPage
	 */
	public void accept_Alert() {
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
	}
	/*
	 *@dismiss_alert method is use to Cancle or Close Alert on WebPage
	 */
	public void dismiss_Alert() {
		Alert alrt=driver.switchTo().alert();
		alrt.dismiss();
	}
	/*
	 *@SendKeys_Alert method is use to send text in alert Popup Box on Webpage
	 *@param Text String to the send Text in text box
	 */
	public void alert_SendKeys(String Text) {
		Alert alrt=driver.switchTo().alert();
		alrt.sendKeys(Text);
	}
	
	public String alert_getText() {
		Alert alrt=driver.switchTo().alert();
		String textMessage=alrt.getText();
		return textMessage;
	}





	/////////////////////////  Validation ////////////////////////////////////////////////////////////////

	/*
	 *@validateTitleContains method is use to validate Element to the Element By Containts with Title
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element for use
	 */
	public void validateTitleContains(String expTitle,String message) {
		String actTitle=getTitle();
		Assert.assertEquals(actTitle.contains(expTitle), message);
	}
	/*@validateTitleEquals method is use to validate Element to the Element By Equals with Title
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 * 
	 */
	public void validateTitleEquals(String expectedTitle,String message)  {
		String actTitle=getTitle();
		Assert.assertEquals(actTitle, expectedTitle,message);
	}

	/*@validateURLContains method is use to validate Element to the Element By Contains with URL
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 */
	public void validateURLContains(String ExpectedURL,String message) {
		String actUrl=getCurrentUrl();
		Assert.assertTrue(actUrl.contains(ExpectedURL),message);
		
		}
	
	/*
	 *@validateURLequals method is use to validate Element to the Element By equals with URL
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 */
	public void validateURLequals(String ExpectedURL,String message) {
		String actUrl=getCurrentUrl();
		Assert.assertEquals(actUrl, ExpectedURL,message);
	}


	/*
	 *@validateGetTextequals method is use to validate Element to the Element By equals with Text
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 */
	public void validateGetTextEquals(WebElement webElement,String Expected,String message) {
		String actText=getText(webElement);
		Assert.assertEquals(actText, Expected, message);
	}
	/*
	 *@validateGetTextContains method is use to validate Element to the Element By Contains with Text
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 */
	public void validateGetTextContains(WebElement webElement,String Expected,String message) {
		String actualText=getText(webElement);
		Assert.assertTrue(actualText.contains(Expected),message);
	}


	/*
	 *@validateIsEnabled method is use to validate Element able for working mode or not By Contains
	 *@param expTitle String send by parameter for matching with actual title
	 *@param message String to the send message of element 
	 */
	public void validateIsEnabled(WebElement webElement,String message) {
		boolean	actEnable=isEnabled(webElement);
		Assert.assertTrue(actEnable,message);
	}
	/* @IsSelected method is use to Check Box and Radio button already Selected or not
	 * @param xpath  Xpath string to the locate Element
	 * @ return if Element is selected on UI Page then return True Otherwise false
	 */
	public void validateIsSelected(WebElement webElement,String message) {
		boolean actSelected=isSelected(webElement);
		Assert.assertTrue(actSelected,message);
		
	}
	/*@Is Display method is use to Element Display or not on WebPage
	 *@param xpath Xpath string to the locate Element
	 *@return if Element is Display on UI page then return True otherwise False
	 *
	 */
	public void validateIsDisplayed(WebElement webElement,String message) {
		boolean Display=isDisplayed(webElement);
		Assert.assertTrue(Display,message);
	}

	public void validateGetAttributeWithEquals(WebElement webElement,String expAttribute,String message) {
		String actAttributeValue=getAttribute(webElement, "value");
		Assert.assertEquals(actAttributeValue, expAttribute,message);
	}
	public void validateGetAttributeByContains(WebElement webElement,String expattributeValue,String message) {
		String actAttributeValue=getAttribute(webElement,"value");
		Assert.assertTrue(actAttributeValue.contains(expattributeValue),message);
	
	
	}
}

//////      total 61 generic method created





