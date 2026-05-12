
public class ClassReturn {

	public static void main(String[] args) {
		int value=ClassReturn.maxvalue();
		System.out.println("max value is--:"+value);


		int total=ClassReturn.multiply(70,80,20);
		System.out.println("total multiply value-:"+total);


		int code=ClassReturn.collage(10);
		System.out.println("Collage code is -:"+code);

		
		int codea=ClassReturn.collage(100);
		System.out.println("Collage code is -:"+codea);

		
		String add=ClassReturn.vimal("vikas  ","nilesh77  ","11 ");
		System.out.println("name Print as-"+add);


	}
	public static int maxvalue() {

		int b=89;

		return b;
	}
	/*Q2- Create a static method name is multiplyThree that takes 
	 *   integers and prints the result and take return value
	 */

	public static int multiply(int a,int b, int c) {

		int d=a*b*c;
		return d;


	}
	/*Q3-Create a static variable collegeCode 
	 *and college code is 10 and Access and print it inside a non-static method.
	 */
	public static int collage(int collageCode ) {

		return collageCode;

	}


	public static String vimal(String a,String b,String c) {
		String e=a+b+c;
		return e;

	}




}
