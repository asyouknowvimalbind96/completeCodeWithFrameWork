
public class Student {

	static String school_name;

	public static void main(String[] args) {
		 school_name=Student.getSchoolName();
		 Student.stu1();
		 Student.stu2();
		 Student.stu3();
		 Student.stu4();
		
	}
	public static String getSchoolName() {
		String getSchoolName;
		getSchoolName="expert view automation";
		// System.out.println("School name--"+getSchoolName);
		return getSchoolName;
	}

	public static void stu1() {
		String Student1="vimal";
		System.out.println(Student1+","+school_name);

	}

	public static void stu2() {
		String Student2="raj";

		System.out.println(Student2+","+school_name);

		

	}
	public static void stu3() {

		String Student3="raju";
		System.out.println(Student3+","+school_name);
		
		
	}
	public static void stu4() {
		String Student4="rahul";
		System.out.println(Student4+","+school_name);
		
		
		
	}
}
