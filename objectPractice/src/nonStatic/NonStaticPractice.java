package nonStatic;

public class NonStaticPractice {
	
	
	
	static char y;
	
	static int num;
	String NameIs;
	
	static String collagename1=NonStaticPractice.collageName1();
			
			
	
	
	public static String collageName1() {
		 String collagename="Expert view automation";
		System.out.println("Student collage name is -"+collagename);
		 return collagename;
	}
	
	public static void name(String StudentName) {
		
		System.out.println("Studentname -"+StudentName+collagename1);
		
		
		
	}
	public  void age(int Studentage) {
		num=350;
		System.out.println("StudentAge -"+num+Studentage+collagename1);
		
		
	}
	public void mobile(double mobileNumber) {
		
		System.out.println("Student mobile number is -"+collagename1+num);
		
	}
	public void address(String StudentAddress) {
		
		System.out.println("Student address is -"+StudentAddress+collagename1+num);
		
	}

	
}
