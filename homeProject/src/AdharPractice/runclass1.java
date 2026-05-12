package AdharPractice;

public class runclass1 {
		
	public static void main(String[] args) {
		
	
		
		StudentData vimal=new StudentData();
		StudentData.changeSchoolName("-Shree ram PG collage adampur nigoh jaunpur  ");
		vimal.studentName="vimal";
		vimal.age=22;
		vimal.obtmark=350;	
		StudentData.totalstudent++;
//		System.out.println("total number of student -"+StudentData.totalstudent);
		vimal.display();
		
		
	
		
		
		StudentData dheeraj=new StudentData();
		dheeraj.studentName="dheeraj";
		dheeraj.obtmark=400;
		dheeraj.age=25;
//		StudentData.changeSchoolName("-st.joseph english medium school");
		StudentData.totalstudent++;
//		System.out.println("total number of student -"+StudentData.totalstudent);
		dheeraj.display();
		
		
		
		
		StudentData fardeen=new StudentData();
		StudentData.changeSchoolName("-Banaras Hindu University");
		fardeen.studentName="fardeen";
		fardeen.obtmark=310;
		fardeen.age=26;
		StudentData.totalstudent++;
// 		System.out.println("total number of student -"+StudentData.totalstudent);
		fardeen.display();
		
		
		
		
		
		StudentData jay=new StudentData();
		StudentData.changeSchoolName("-State University allahabad");
		jay.studentName="Jay";
		jay.age=23;
		jay.obtmark=350;
		StudentData.totalstudent++;
		jay.display();
		System.out.println("total number of student -"+StudentData.totalstudent);
	}

}
