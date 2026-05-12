package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario_07_11_2025 {

	public static void main(String[] args) throws InterruptedException {
		//doubleframe();
		//a1();
		//W3School_Q_1();
		//System.out.println("================ ^^^^  Scenario 1st  ^^^^ =================");

		W3School_Q_2();
		System.out.println("================  ^^^^ Scenario 2nd ^^^^  =================");

//		W3School_Q_3();
//		System.out.println("================  ^^^^  Scenario 3rd  ^^^^  =================");
//
//		W3School_Q_4();
//		System.out.println("================  ^^^^  Scenario 4th  ^^^^  =================");


		
		
	}
	public static void W3School_Q_1() throws InterruptedException {
	/*Is page me ek main iframe hai jiska naam iframeResult hai — pehle uske andar jao.
	Ab is main iframe ke andar ek aur iframe hai — usko child iframe bolenge — uske andar jao.
	Child iframe ke andar jo heading likhi hoti hai:
	"This page is displayed in an iframe"
	→ Us text ko print karwana hai.
	*/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement weFirst_Iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weFirst_Iframe);
		WebElement weChild_iframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(weChild_iframe);
		
		WebElement wePrintText=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String printText=wePrintText.getText();
		System.out.println("Print Heading name  ->  "+printText);

	}

	/*Pehle main iframe (iframeResult) ke andar jao.
	Fir defaultContent() use karke iframe se bahar aao (poore original page par wapas aa jao).
	Ab iframe ke bahar jo heading likhi hui hai:
	"HTML Iframes"
	→ Is text ko print karwana hai.
	*/
	public static void W3School_Q_2() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement weFirst_Iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weFirst_Iframe);
		
		WebElement wePrintText=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		String printText=wePrintText.getText();
		System.out.println("Print Heading name name  ->  "+printText);
		
		driver.switchTo().defaultContent();
		
		driver.quit();

	}
/*Page open karo.    
Pehle iframe ke andar jao → phir uske child iframe me jao.
Usme jo heading text hai, usko print karo.
Phir parentFrame() use karke ek step upar aa jao.
Fir dobara child iframe me jao.
Aur text ko phir se print karna hai. 	
	*/
	
	public static void W3School_Q_3() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement weFirst_Iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weFirst_Iframe);
		WebElement weChildiframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(weChildiframe);
	
		WebElement wefoundText=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String text=wefoundText.getText();
		System.out.println("print heading text  ->  "+text);
		
		driver.switchTo().parentFrame();
		WebElement weChildiframe2=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(weChildiframe2);
		
		WebElement wefoundText2time=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String text1=wefoundText2time.getText();
		System.out.println("second time print heading text  ->  "+text1);
		
	}
	
	/*Pehle main iframe (iframeResult) ke andar jao.
	Phir andar wale child iframe me jao.
	Child iframe ke andar jo text likha hua hai:
	This page is displayed in an iframe
	Us text ko visible hai ya nahi, ye check karna hai
	(Output → true ya false).
	*/
	public static void W3School_Q_4() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement weFirst_Iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weFirst_Iframe);
		WebElement weChildiframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(weChildiframe);
		
		WebElement weChecktext=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		boolean textdisplay_or_not= weChecktext.isDisplayed();
		System.out.println("text is display ->  "+textdisplay_or_not);
	
	}
	
	public static void a1() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement wecleare=driver.findElement(By.xpath("//div[@class='tox-icon']"));
		wecleare.click();
		WebElement weframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(weframe);
		
		WebElement wefoundText=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		String text=wefoundText.getText();
		System.out.println("text print  ->  "+text);
	}
	
	
	
	
	
	public static void doubleframe() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		WebElement weiframe2=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weiframe2);
		WebElement weiframe1=driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		driver.switchTo().frame(weiframe1);
		
		
		Thread.sleep(2000);
		WebElement weclickHTML=driver.findElement(By.xpath("//a[text()='HTML']"));
		weclickHTML.click();
		driver.switchTo().parentFrame();
		
		WebElement weparentframe=driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		String printText=weparentframe.getText();
		System.out.println("print Text  ->  "+printText);
	}

}
