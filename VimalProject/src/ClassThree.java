
public class ClassThree {

	public static void main(String[] args) {
		int val=ClassThree.add1();
		
		System.out.println("refrence of val is---"+val);
	
		
		int value1=ClassThree.add50value(val);
		System.out.println(value1);

	}
	public static int add1() {
		int a=20;
		int b=30;
		int z=a+b;
		System.out.println("refrence of z is---"+z);
		return z;
	}	
	
	public static int add50value(int a) {
	
		int b=a+50;
		System.out.println("add 50 value in b---"+b);
		return b;
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String value=ClassThree.student1("rohit");
//		ClassThree.print(value,"Mishra");
//		String value1=ClassThree.student1("Rahul");
//		ClassThree.print(value1,"Mishra");
//		
//	}
//
//	public static String  student1(String studentName) {
//		return studentName;
//	}
//	
//	public static void print(String name,String sirName) {
//		String val=name+sirName;
//	    System.out.println(val);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void empSal(String empName,int age) {
//		
//		System.out.println("employee name-"+  empName+"  employee age-"  +  age);
//		
//	}
	
	
}
