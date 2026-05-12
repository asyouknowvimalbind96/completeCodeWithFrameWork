package GivenByMam_Scenario;

public class Student1 {
	public static String collageName="Expert View Automation";
	String StudentName;

	public Student1(String Studendn){
		this.StudentName=Studendn;
	}

	public static void main(String[] args) {
		Student1 s=new Student1(collageName);
		s.data();
		
		//     or  /////
		
		Student1 Stu1=new Student1("vimal");
		Stu1.display();
		Student1 Stu2=new Student1("aman");
		Stu2.display();
		Student1 Stu3=new Student1("deepak");
		Stu3.display();
		Student1 Stu4=new Student1("jay");
		Stu4.display();
		Student1 Stu5=new Student1("Dhruv");
		Stu5.display();
		

	}	
	
	public  void data() {
		Student1 Stu1=new Student1("vimal");
		Stu1.display();
		Student1 Stu2=new Student1("aman");
		Stu2.display();
		Student1 Stu3=new Student1("deepak");
		Stu3.display();
		Student1 Stu4=new Student1("jay");
		Stu4.display();
		Student1 Stu5=new Student1("Dhruv");
		Stu5.display();
	}
	public void display() {
		System.out.println(StudentName+"   "+collageName);
}
}
