package nonStatic;

public class Object_Creation {
	
	
	/////////////////////////////////////////// * Class By Arif Sir *///////////////////
	
	int a=10;/// int a [1]  // a=10; 
	{     ///// non static block [2]
		methodOne();
		System.out.println(" I am Non static block");
		System.out.println(y);
	}
	static {    /// static block   // execution 
		methodOneSt();
		System.out.println(" I am Static Block");
	}
	public Object_Creation() { 
		System.out.println(" I am Default Constructor");
	}
	public void methodOne() {   /// non static method [3]
		System.out.println(" I am Non static methodOne");
		System.out.println(a);
		System.out.println(b);
	}
	public static void methodOneSt() {/// method static 
		System.out.println(" I am Static methodOneSt ");
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		new Object_Creation();
	}
	int b=20;/// exe
	static int y=200;  /// static y  /// execution y=200;
}
