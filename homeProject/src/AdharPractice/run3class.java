package AdharPractice;

public class run3class {

	public static void main(String[] args) {
		
		onetime obj1=new onetime();
		obj1.studentname="Vimal Bind .";
		obj1.studentFatherName="Ratan chand bind .";
		obj1.studentAge=22;
		onetime.totalStudent++;
		obj1.studentaddress="Adampur nigoh jaunpur Uttar Pradesh .";
		obj1.showStudentData();
		
		
		onetime obj2=new onetime();
		obj2.studentname="  ansh .";
		obj2.studentFatherName=" sachin .";
		obj2.studentAge=13;
		obj2.studentaddress=" adampur jaunpur .";
		onetime.totalStudent++;
		onetime.changeStudentCollageCode(1100);
		obj2.showStudentData();
		
		
		
		onetime obj3=new onetime();
		obj3.studentname="  ananya .";
		obj3.studentFatherName=" vikash kumar .";
		obj3.studentAge=1;
		onetime.totalStudent++;
		obj3.studentaddress=" adampur nigoh jaunpur .";
		
		//onetime.changeStudentCollageCode();
		obj3.showStudentData();
		
		
		
		
		System.out.println("all student -:   "+onetime.totalStudent);
	}

}
