package AdharPractice;

import java.util.Random;

public class Adhar {

	static int adhar;
	
	public static  int creatAdharCard(String name,int age) {
		adhar=new Random().nextInt(11111111, 99999999);
		
		 System.out.println("created adhar number -"+name+"- "+age+"- "+adhar);
		return adhar;
	}
	
	public static void getAdharPhoneNumber() {
		
		System.out.println("In adhar get phone number -"+adhar);
		
	}
	
	public static void changeMobileNumber() {
		
		System.out.println("change mobile number in adhar -"+adhar);
	}
	
	public static void changeAddress() {
		
		System.out.println("In adhar change address -"+adhar);
	}
	
	public static void changeDOB() {
		
		System.out.println("In adhar change date of birth -"+adhar);
	}
	
	public static void changegurdian() {
		
		System.out.println("in adhar change gurdian name -"+adhar);
	}
}





/*/* Create Adhar Card
 * Get adhar phone number
 * change mobile number
 * change address
 * change date of birth
 * change gurdian name
 * 
 */