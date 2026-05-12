package nonStatic;

public class StudentClass {
	public static String collegename="EVA";
	
	public String studentname;
	
	//5 student name shradha,Vimal,Priya,Rajan,Dhruv,Jay, Raja

	public static void main(String[] args) {
	StudentClass stu1=new StudentClass();
	System.out.println(stu1.studentname);
	stu1.studentname="Shradha";
	System.out.println(stu1.studentname);
	
	
	

	}
	public void display() {
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
