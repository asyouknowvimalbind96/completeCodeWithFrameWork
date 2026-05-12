package test;

public class NumberReverse {

	public static void main(String[] args) {
		//reversNum1();
		//reverseNum2();
		//reverseNum3();
		//reverseNum4();
		//reverseNum5();
		reverseNum6();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void reverseNum6() {
		int number=76543;
		int store=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
			
		}
		System.out.println(store);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void reverseNum5() {
		long number=780062813;
		long store=0;
		long remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
			System.out.println(store);
		}
		System.out.println();
		System.out.println(store);
		
	}

	public  static void reverseNum4() {
		int number=813567;
		int store=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
		}
		System.out.println(store);
	}

	public static void reverseNum3() {
		int number=1234567;
		int store=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
			System.out.println(store);
		}
		System.out.println(store);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void reverseNum2() {

		int number=9876543;
		int store=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
			
		}
		System.out.println(store);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void reversNum1() {
		int number=3454399;
		int store=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			store=store*10+remainder;
			number=number/10;
		}
		System.out.println(store);
	}
	
	
	
	
	
	
}
