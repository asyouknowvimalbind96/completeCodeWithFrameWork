
public class ClassOne {

	public static void main(String[] args) {

		ClassOne.addNumber(20, 30);

		ClassOne.addNumber(10,20,30);
		
ClassOne.addNumber(2,3);


	}
	public static void addNumber(int b,int a) {


		 

		int c=a+b;
		System.out.println("Sum two number -"+c);

	}
	public static void addNumber(int a,int b,int c) {

		int d=a+b+c;
		System.out.println("Sum three number-"+d);

	}


}
