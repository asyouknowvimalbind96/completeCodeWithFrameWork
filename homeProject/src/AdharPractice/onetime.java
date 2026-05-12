package AdharPractice;

public class onetime {

	static String schoolName="Expert view automation";
	static int collageCode=1140;
	String studentname;
	String studentFatherName;
	int studentAge;
	String studentaddress;
	static int totalStudent;
	
	public void showStudentData() {
		
		System.out.println("student school name is  -"+schoolName);
		System.out.println("student collage code is -"+collageCode);
		System.out.println("student name is -"+studentname);
		System.out.println("student father name is -"+studentFatherName);
		System.out.println("student age -"+studentAge);
		System.out.println("student address is -"+studentaddress);
		System.out.println("-----------------------------------------------------");
		
		
	}
	
	public static void changeStudentCollageCode(int newCollageCode) {
		
		collageCode=newCollageCode;
		
	}
	
	
}
