package GivenByMam_Scenario;

public class encapsulationPracticeTest {

	public static void main(String[] args) {
		encapsulationPractice practice=new encapsulationPractice();
		//System.out.println(practice.getStudentFristName());
		
		practice.setStudentFristName("ram");
		String str=practice.getStudentFristName();
		System.out.println(str);
		
		practice.setStudentDOB(7800628140l);
		long age=practice.getStudentDOB();
		System.out.println(age);
		
		practice.setStudentAddress("nnnnn");
		 String ram=practice.getStudentAddress();
		 System.out.println(ram);
		 practice.setStudentAddress("vimal");
		 String ram1=practice.getStudentAddress();
		 System.out.println(ram1);
	}

}
