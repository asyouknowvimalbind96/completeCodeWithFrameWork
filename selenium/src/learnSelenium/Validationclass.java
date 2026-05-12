package learnSelenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validationclass {

	public static void main(String[] args) {
//		 VerifyCreateLeadsFuctionality();
//		 equalse();
//		 Scenarioinclass();
//		 ScenariobyMam();

//		WorkingDay();
//
//		StudentMark();
//		WorkingDay1();40
		
//		StudentMark1();

		
		marks();




	}
	public static void dtest() {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		// driver.manage().window().minimize();

		String title=driver.getTitle();

		String pageSorce=driver.getPageSource();

		System.out.println("show html page ---"+pageSorce);

		System.out.println("Title Name----- "+title);
		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 
		weUserName.clear();

	}

	

	public static void equalse() {
		String name1="Vimal";
		String name2="VIMAL";

		if(name1.equals(name2)) {
			System.out.println("Text latter same  --  passed-");

		}else {
			System.out.println("Text latter not same  -- faild -");
		}


	}


	public static void Scenarioinclass() {
		String name="Rajan";
		String Surname="Kumar";

		if(name.equals(Surname)) {
			System.out.println("name matched Validation is --- passed - ");
		}else {
			System.out.println("name  Validation not matched is --- faild - ");
		}
	}
	public static void ScenariobyMam() {

		/*
		 * 1-using equalsIgnoreCase
			Username validation 
			(Admin, admin)

			2-Email id case insensitive match(equalsIgnoreCase)
			Test@Gmail.com
			test@gmail.com
		 */


		String name="admin";
		String name1="Admin";
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("name case same to -- Pass ");
		}else {
			System.out.println("name case not same to -- failed ");
		}

		String Email="Test@Gmail.com";
		String Emailnew="test@gmail.com";

		if(Email.equalsIgnoreCase(Emailnew)) {
			System.out.println("email case latter same to -- Pass");


		}else {
			System.out.println("email case latter not same to -- failed");
		}

		String name2="admin";
		String name3="Admin";
		if(name2.equals(name3)) {
			System.out.println("name case same to -- Pass ");
		}else {
			System.out.println("name case not same to -- failed ");
		}

		String Email2="Test@Gmail.com";
		String Emailnew3="test@gmail.com";

		if(Email2.equals(Emailnew3)) {
			System.out.println("email case latter same to -- Pass");


		}else {
			System.out.println("email case latter not same to -- failed");
		}
	}


	public static void WorkingDay() {

		String Day="Monday";

		if(Day.equals("Monday")) {
			System.out.println("work day   - Hard work ");
		}else {
			System.out.println("non working day   - Relax- ");
		}
	}


	public static void WorkingDay1() {

		String Day="Monday";

		if(Day.equals("Sunday")) {
			System.out.println("work day   - Hard work ");
		}else {
			System.out.println("non working day   - Relax- ");
		}
	}
	public static void StudentMark() {
		int studentTotalMark=50;
		if(studentTotalMark>33) {
			System.out.println("Congratulation  > Student - Pass");
		}	else {
			System.out.println("So Sad  Student - failed");
		}
	}	



	public static void StudentMark1() {
		int studentTotalMark=30;
		if(studentTotalMark>33) {
			System.out.println("Congratulation  > Student - Pass");
		}	else {
			System.out.println("So Sad  Student - failed");
		}
	}
public static void marks() {
	

	Scanner sc=new Scanner(System.in);
	System.out.println(sc);
		System.out.println("Enter your Marks -");
		int mark=sc.nextInt();
		int mark2=33;
		if(mark>=mark2) {
	System.out.println("Congratulation Dear Student you are  -  Passed");
		}else {
			System.out.println("So sad dear Student  you are failed");
		
		}
		
		
}
}	

