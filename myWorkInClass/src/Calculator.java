


public class Calculator {
	
	
	
	
	public static void plus() {
		
		int a=1000;
		int b=2300;
		 minus();
		int c=a+b;
		System.out.println(c);
	   
		///  plus method is calling minus method so minus method will run

	}
	
	public static void minus() {
		int x=2000;
		int y=1245;
		int z=x-y;
		System.out.println(z);
		
	}
	
	public static void multiply() {
		int x=2000;
		int y=1245;
		int z=x*y;
		System.out.println(z);
		
	}
	
	
	public static void main(String[] args) {
		///  main method is calling plus method so plus method will run
		minus();
		plus();
	}
	

}
