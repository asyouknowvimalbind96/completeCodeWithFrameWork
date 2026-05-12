package GivenByMam_Scenario;

public class array_Practice {

	public static void main(String[] args) {
		
		
		SwipeP();
		
		
		//ArraySwipe();
//		ArrayMark();
//		System.out.println("===============");
//		StorSalary();
		
		//arrayObj();
		// ArrayDouble();
		//arrayString();
		
//		StudentRollNumberAndName();
//		StudentAge();
//		ProductPrice();
//		employeeSalary();
//		
//		StudentMark();
	}
	
	public static void SwipeP() {
		int []pra=new int [10];
		pra[0]=10;
		pra[1]=30;
		System.out.println("before Swiping  [0]  -  "+pra[0]);
		System.out.println("before Swiping  [1]  -  "+pra[1]);
		pra[0]=pra[1]+pra[0];
		pra[1]=pra[0]-pra[1];
		pra[0]=pra[0]-pra[1];
	
		System.out.println("After Swiping  [0]  -  "+pra[0]);
		System.out.println("After Swiping  [1]  -  "+pra[1]);

		
		
		
	}
	public static void ArraySwipe() {
		int [] Swap=new int[10];
		Swap[0]=5;
		Swap[1]=10;
		System.out.println("before Swaping [0] -"+Swap[0]);
		System.out.println("before Swaping [1] -"+Swap[1]);
		
		Swap[0]=Swap[1]+Swap[0];
		Swap[1]=Swap[0]-Swap[1];
		Swap[0]=Swap[1]+Swap[1];
		
		
		
		System.out.println("after Swaping [1] -"+Swap[1]);
		System.out.println("after Swaping [0] -"+Swap[0]);
	}
	
	public static void ArrayMark() {
		int []mark=new int[10];
		mark[0]=80;
		mark[1]=70;
		mark[2]=90;
		mark[3]=85;
		mark[4]=75;
		for(int i=0;i<10;i++) {
			int StudentMark=mark[i];
			System.out.println(StudentMark);
		}
		
	}
	public static void StorSalary() {
		int [] salary=new int[10];
		salary[0]=20000;
		salary[1]=25000;
		salary[2]=30000;
		for(int i=0;i<10;i++) {
			int empSal=salary[i];
			System.out.println(empSal);
		}
		
		
		
	}
	
	public static void arrayString() {
		
		String [] StudentName=new String[15];
		StudentName[0]="Vimal Bind";
		StudentName[4]="Ritesh";
		StudentName[3]="Aman pal";
		StudentName[5]="Dhruva Gupta";
		StudentName[7]="Anup yadav";
		StudentName[8]="Ram";
		StudentName[1]="Rahul";
		for(int i=0;i<15;i++) {
			String StuName=StudentName[i];
			System.out.println(StuName);
		}
	}
	public static void ArrayDouble() {
		double [] Student_Weight=new double[15];
		Student_Weight[2]=55.6;
		Student_Weight[0]=48.2;
		Student_Weight[6]=77.8;
		Student_Weight[5]=88.3;
		Student_Weight[3]=66.9;
		Student_Weight[1]=35.9;
		Student_Weight[9]=92.9;
		
		for(int i=0;i<15;i++) {
			double AllStuWeight=Student_Weight[i];
			System.out.println(AllStuWeight);
		}
		
		
		
		
	}
		public static void arrayObj() {
			int [] a=new int [10];
			a[4]=20;
			a[6]=66;
			a[2]=55;
			a[9]=99;
			a[7]=51;
			for(int i=0;i<=9;i++) {
				int number=a[i];
				System.out.println(number);
			}
			
		}
		
	
		public static void StudentRollNumberAndName() {
			
		
		int [] StudentRollNum= {10332,10367,10363,10334,10335,10336,10337,10338,10339,10440,10550};
		System.out.println(StudentRollNum);
		String []StudentName= {"Vimal","ritesh","aman","dhruv","jay","sandeep","deepak","abhijeet","shivam","raj"};
		System.out.println(StudentName);
		
		
	}

	public static void StudentAge() {
		
		int []StudentAge= {22,24,21,20};
		int SecontNumber=StudentAge[1];
	
		System.out.println("Student Age of Second Number Student  -"+SecontNumber);
		
	}
	public static void ProductPrice() {
		
		int []ProductPrice= {499,299,999};	
		int updatePrice=ProductPrice[2]=399;
		
	System.out.println("new price -"+updatePrice);
	
		
	}
	public static void employeeSalary() {
		int []salary= {54675,65987,120530};
		int salaryFirst=salary[0];
		int salarySecond=salary[2];
		System.out.println("first Employee salary  -"+salaryFirst);
		System.out.println("third employee salary  -"+salarySecond);
		
	
		
	}
	public static void StudentMark() {
		int []mark= {80,75,90,85,70};   //english  hindi  math  science
		
		System.out.println("Mark of Second Student  -"+mark[1]);
		System.out.println("Mark of forth student Number  -"+mark[2]);
	}
	
}
