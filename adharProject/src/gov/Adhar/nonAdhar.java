package gov.Adhar;

import java.util.Random;

public class nonAdhar {

	static String contry="India";
	
	int AdharNumber;
	
	
	
	public int createAdharCard(String name,int age){

		  AdharNumber=new Random().nextInt(111111111, 999999999);
		System.out.println("Creating Adhar Card- "+name+" - age- "+age+" "
				+ "- Adhar number- "+AdharNumber+contry);

		return AdharNumber;

	}
	public void getAdharPhoneNumber(int adharnum) {

		System.out.println("get adhar card in mobile number - "+AdharNumber+contry);


	}
	public void changeMobileNumber(int adharnum) {

		System.out.println("change mobile number - "+AdharNumber+contry);



	}
	public  void changeAddress(int adharnum) {

		System.out.println("change address - "+AdharNumber+contry);



	}

	public  void changeDOB(int adharnum) {

		System.out.println("change date of birth"+AdharNumber+contry);

	}
}
