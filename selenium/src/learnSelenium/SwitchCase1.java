package learnSelenium;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String name = "";
		do {
//			System.out.println("enter a new value");
//			int num = sc.nextInt();
//			switch (num) {
//			case 1:
//				System.out.println("Hello i am case 1.---");
//				String jan = sc.nextLine();
//				System.out.println("January");
//				break;
//			case 2:
//				System.out.println("Hello i am case 2.---");
//				String feb = sc.nextLine();
//				System.out.println("February");
//				break;
//
//			case 3:
//				System.out.println("Hello i am case 3.---");
//				String mar = sc.nextLine();
//				System.out.println("march");
//				break;
//
//			case 4:
//				System.out.println("Hello i am case 4.---");
//				String april = sc.nextLine();
//				System.out.println("april");
//				break;
//
//			case 5:
//				System.out.println("Hello i am case 5.---");
//				String may = sc.nextLine();
//				System.out.println("may");
//				break;
//
//
//
//			default:
//				System.out.println("your choice is wrong-");
//
//			}

			System.out.println("Do You want another Value ... ");

			sc.nextLine();
			name = sc.nextLine();

		} while (name.equalsIgnoreCase("yes"));
		System.out.println("bye!");
	}
}