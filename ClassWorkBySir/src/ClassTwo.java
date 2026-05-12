
public class ClassTwo {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		ClassTwo.addition(a,b);//y=3,x=2 (3,2)
		//ClassTwo.addition("rohit", 29);
		ClassTwo.addition(20,"rav");


	}
	/*
	 * run to addition method with diffrent set of value 
	 *  
	 *  30,40
	 *  100,40,
	 */
	public static void addition(int x,int y) {

		int z=x+y;
		System.out.println("result of addition method"+z);

	}
	/* if you want to method name same(method overloading)
	 * condition 
	 * Number of parameter should be diffrent
	 * type odf parameter should be diffrent
	 * sequence of parameter should be diffrent
	 */
	public static void addition(int x,int y,int z) {

	}
	public static void addition(int x,String name) {

	}
	public static void addition(int x,short name) {


	}

	public static void addition(short name,int x) {


	}



}
