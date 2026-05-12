package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArifSirClassPractice {

	public static void main(String[] args) throws InterruptedException {
		//marks1(81);

		//		recurtionPractice(21,51);
		//		System.out.println("=================================================================================");
		//		
		//		recurtionPractice(39,91);


		//reversNumber1(123456789);
		//re_practice(987654321);
		//Re_PracticeRevers(456328);

		forImageClick();
		//	forSuggetionClick();

	}

	public static void forImageClick() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		driver.findElement(By.xpath("//div[@class='gb_0 gb_1']//a[text()='Images']")).click();
		WebElement weSearchbox=driver.findElement(By.xpath("//div[@class='a4bIc']//textarea[@jsname='yZiJbe']"));
		weSearchbox.sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> listWeb=driver.findElements(By.xpath("//div[@class='OBMEnb']//div[@class='lnnVSe']"));
		//Thread.sleep(2000);
		for(int i=0;i<listWeb.size();i++) {
		WebElement wetext=listWeb.get(i);		
		String text=wetext.getText();
		//Thread.sleep(2000);
		if(text.equalsIgnoreCase("selenium webdriver")) {	
			wetext.click();
			Thread.sleep(2000);			
		}
		}


















	}	
	public static void recurtionPractice(int firstNum,int secondNum) {

		while(firstNum>secondNum) {
			return;	
		}
		System.out.println("Current Number  : =    "+firstNum);
		recurtionPractice(firstNum+1,secondNum);
	}








	public static void recurtion(int a,int b) {	
		while(a>b) {	

			return;
		}
		System.out.println("current number  = "+a);
		recurtion(a+1, b);
	}



	public static void reversNumber1(int number) {

		int orginal=number;
		int revNumber=0;

		while(number !=0) {
			int remaindor=number%10;
			revNumber=revNumber*10+remaindor;
			number=number/10;

		}
		System.out.println("1st Scenario- "+"reversNumber  -  "+revNumber);
		System.out.println("1st Scenario- "+"orginal  -  "+orginal);


	}

	public static void re_practice(int number) {
		int orginalNumber=number;
		int revNumber=0;
		while(number !=0) {
			int remaindor=number%10;
			revNumber=revNumber*10+remaindor;
			number=number/10;
		}
		System.out.println("2nd Scenario- "+"Revers Number of Orginal Number  =    "+revNumber);

		System.out.println("2nd Scenario- "+"My Orginal Number =  "+orginalNumber);
	}

	public static void Re_PracticeRevers(int number) {
		//int OrginalNum=number;
		int reversNumber=0;
		while(number !=0) {
			int remaindor=number%10;
			reversNumber=reversNumber*10+remaindor;
			number=number/10;


		}
		System.out.println("3rd Scenario- "+"Revers Number of Orginal Number =  "+reversNumber);
		System.out.println("3rd Scenario- "+"orginal number  =  "+number);
	}



	//	public static void reversNumber(){      			///  Question Solved by Rahul sir
	//	Integer number=123456;
	//	String strNumber=number.toString();
	//	  for(int i=strNumber.length()-1;i>=0;i--) {
	//		  strNumber.charAt(i);
	//	  }


	public static void evenodd1(int a,int b,int c,int d,int e) {
		if(a%2==0) {
			System.out.println("number is even "+a);
		}else {
			System.out.println("number is odd "+a);
		}

		if(b%2==0) {
			System.out.println("number is even "+b);
		}else {
			System.out.println("number is odd "+b);
		}

		if(c%2==0) {
			System.out.println("number is even "+c);
		}else {
			System.out.println("number is odd "+c);
		}


		if(d%2==0) {
			System.out.println("number is even "+d);
		}else {
			System.out.println("number is odd "+d);
		}



		if(e%2==0) {
			System.out.println("number is even "+e);
		}else {
			System.out.println("number is odd "+e);
		}


	}
	public static void marks1(int marks) {

		if (marks>=90) {
			System.out.println(" grade A "+marks);
		}else if(marks>=75) {
			System.out.println("Grade B    "+marks);
		}else if(marks>=45) {
			System.out.println("Grade C    "+marks);
		}else  {
			System.out.println("Grade Failed    "+marks);
		}
	}
}








