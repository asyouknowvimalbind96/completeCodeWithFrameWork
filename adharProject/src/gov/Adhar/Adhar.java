package gov.Adhar;

import java.util.Random;

public class Adhar {

	
	 static int adharNumber;
	
	public static int createAdharCard(String name,int age){
		
		  adharNumber=new Random().nextInt(111111111, 999999999);
		System.out.println("Creating Adhar Card- "+name+" - age- "+age+" - Adhar number- "+adharNumber);
		
		return adharNumber;
		
	}
	public static void getAdharPhoneNumber(int adharNumber) {
		
		System.out.println("get adhar card in mobile number - "+adharNumber);
		
		
	}
	public static void changeMobileNumber(int adharNumber) {
		
		System.out.println("change mobile number - "+adharNumber);
		
		
		
	}
	public static void changeAddress() {
		
		System.out.println("change address - "+adharNumber);
		
		
		
	}
	
	public static void changeDOB(int adharNumber) {
		
		System.out.println("change date of birth"+adharNumber);
		
}










/*/* Create Adhar Card
	 * Get adhar phone number
	 * change mobile number
	 * change address
	 * change date of birth
	 * change gurdian name
	 * 
	 */
 

}
