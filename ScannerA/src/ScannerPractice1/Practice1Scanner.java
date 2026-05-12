package ScannerPractice1;

import java.util.Scanner;

public class Practice1Scanner {

	public static void main(String[] args) {

		scenario6();


	}
	public static void scenario6() {

		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		String sr="";
		do {
			System.out.println("enter new value");
			int nu=sc.nextInt();
			switch(nu) {
		

			case 1:
				System.out.println("case 1st-.");
				System.out.println("january");
				break;
			case 2:
				System.out.println("case 2nd-.");
				System.out.println("February");
				break;
			case 3:
				System.out.println("case 3rd-.");
				System.out.println("march");
				break;
			case 4:
				System.out.println("case 4th-.");
				System.out.println("april");
				break;
			case 5:
				System.out.println("case 5th-.");
				System.out.println("may");
				break;
			default:
				System.out.println("your value is not in creteria");


			}
			System.out.println("do you want enter another value");
			sc.nextLine();
			sr=sc.nextLine();


		}while(sr.equalsIgnoreCase("yes"));
		System.out.println("Good Bye");
	}


	public static void scenario5() {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		String stra="";
		do {
			System.out.println("enter your first value..");
			int num=sc.nextInt();

			switch(num) {

			case 1:
				System.out.println("I am Case 1st.");
				System.out.println("January");

				break;
			case 2:
				System.out.println("enter your first value..");
				System.out.println("mar");
				break;
			default :
				System.out.println("enter your value is not in your creteria..");


			}
			System.out.println("Do you want another value...");
			sc.nextLine();

			stra=sc.nextLine();


		}while(stra.equalsIgnoreCase("yes"));
		System.out.println("Good Bye Bye");
	}





	public static void scenario4() {

		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		String stra="";
		do {
			System.out.println("Enter your name-");
			String nam=sc.nextLine();
			System.out.println("my name is ..-"+nam);
			System.out.println("do you want enter your another name..");

			stra=sc.nextLine();


		}while(stra.equalsIgnoreCase("Yes"));
		System.out.println("Good Bye ");







	}


	public static void scenario3() {

		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		String val="";
		do {
			System.out.println("Enter your name ..");
			String name=sc.nextLine();
			System.out.println("My name is ..-"+name);
			System.out.println("Do you write your another name ..");

			val=sc.nextLine();



		}while(val.equalsIgnoreCase("yes"));
		System.out.println("Good Bye");


	}
	public static void scenario2() {

		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		String str="";
		do {

			System.out.println("Please Enter First value..");
			String vi=sc.nextLine();
			System.out.println("my first value is..-"+vi);
			System.out.println("Do you want enter another value..");

			str=sc.nextLine();

		}while(str.equalsIgnoreCase("yes"));
		System.out.println("Good Bye..");




	}	









	public static void scenario1() {


		//input from console
		Scanner	sc=new Scanner(System.in);
		System.out.println(sc);
		String st="";
		do {

			System.out.println("Enter any name");
			String name=sc.nextLine();
			System.out.println("your name is : "+name);
			System.out.println("Do you want to enter any other name Y/N ?");

			st=sc.nextLine();
		}while(st.equals("yes"));

		System.out.println("Go ahead");	


	}
}
