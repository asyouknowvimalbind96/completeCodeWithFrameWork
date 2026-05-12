package learnSelenium;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String str = "";
		do {
			System.out.println("please enter your value ..");
			int n1 = sc.nextInt();
			switch (n1) {
			case 1:
				System.out.println("Hello i am case 1");
				System.out.println("January");
				break;
			case 2:
				System.out.println("Hello i am case 2");
				break;
			case 3:
				System.out.println("Hello i am case 3");
				break;
			case 4:
				System.out.println("Hello i am case 4");
				break;
			default:
				System.out.println("You are out of Range");

			}
			System.out.println("do you want another value ..");
			
			sc.nextLine();
			str = sc.nextLine();
		} while (str.equalsIgnoreCase("yes"));
		System.out.println("bye!!!");

	}
}
