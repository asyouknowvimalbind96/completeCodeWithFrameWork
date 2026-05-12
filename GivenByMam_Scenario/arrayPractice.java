package GivenByMam_Scenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class arrayPractice {

	public static void main(String[] args) {	
		//		product();
		//		System.out.println("------------------------------------------------------");
		//		even();
		//		System.out.println("------------------------------------------------------");
		//		salary();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.City();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.Fruit();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.Marks();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.Merge();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.order();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.Reverse();
		//		System.out.println("------------------------------------------------------");
		//		arrayPractice.Student();





		//Selfpractice();
		//productP();
		//evenNumber();
		//fruit();
		//StudentMark();
		//employeeSalary();

		//revNumber();
		//Batch();
		//city();
		//merge();
		list();
		
		
		

	}

	public static void Selfpractice() {

		ArrayList<String> StudentName=new ArrayList<String>();
		StudentName.add("ram");
		StudentName.add("syam");
		StudentName.add("lakshaman");
		StudentName.add("krishna");
		StudentName.add("hanuman");
		int totalStu=StudentName.size();

		for(int i=0;i<totalStu;i++) {
			String foundAllStu=StudentName.get(i);
			System.out.println(foundAllStu);
		}

	}
	public static void productP() {
		ArrayList<Double> price=new ArrayList<Double>();
		price.add(40.5);
		price.add(60.8);
		price.add(70.1);
		price.add(70.9);
	

		int TotalProduct=price.size();
		for(int i=0;i<TotalProduct;i++) {

			System.out.println(TotalProduct);
		}
	}
	public static void evenNumber() {
		int totalNumber=0;
		ArrayList<Integer> evenNum=new ArrayList<Integer>();
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		evenNum.add(8);
		evenNum.add(10);
		evenNum.add(12);
		evenNum.add(14);
		evenNum.add(16);
		evenNum.add(18);
		evenNum.add(20);

		for(int i=0;i<evenNum.size();i++) {
			totalNumber=totalNumber+evenNum.get(i);
		}
		System.out.println(totalNumber);
		System.out.println(evenNum);

	}
	public static void fruit() {
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("pineApple");
		fruit.add("guava");
		fruit.add("mango");
		fruit.add("litchi");

		boolean Present=fruit.contains("Apple");
		System.out.println(Present);

		if(fruit.contains("Apple")) {
			System.out.println("product is available in my shop   --Validation Passed-- ");
		}else {
			System.out.println("product is not available in my shop   --validation Failed--");
		}

	}
	public static void StudentMark() {
		ArrayList<Integer> mark=new ArrayList<Integer>();
		mark.add(67);
		mark.add(120);
		mark.add(89);
		mark.add(90);
		mark.add(110);

		int higest=mark.get(0);
		for(int i=0; i<5;i++) {
			if(mark.get(i)>higest)
				higest=mark.get(i);
		}
		System.out.println(higest);
	}

	public static void employeeSalary() {
		ArrayList<Integer> employee=new ArrayList<Integer>();
		employee.add(210000);
		employee.add(215000);
		employee.add(220000);
		employee.add(225000);
		System.out.println("Actual Salary is -- "+employee);
		employee.set(0, 2000);
		employee.set(1, 2000);
		employee.set(2, 2000);
		employee.set(3, 2000);
		System.out.println("Actual Salary with Increase Salary  - "+employee);


	}
	public static void revNumber() {
		ArrayList<Integer> revNum=new ArrayList<Integer>();
		revNum.add(10);
		revNum.add(30);
		revNum.add(45);
		revNum.add(20);
		revNum.add(15);

		for (int i=4;i>=0;i--) {			
			System.out.println(revNum.get(i));

		}


	}
	public static void Batch() {
		ArrayList<String> MorningTime=new ArrayList<String>();
			MorningTime.add("vimal");
			MorningTime.add("dheeraj");
			MorningTime.add("fariyad");

		ArrayList<String> eveningTime=new ArrayList<String>();
		eveningTime.add("ashish");
		eveningTime.add("jay");
			eveningTime.add("dhruv");

		eveningTime.addAll(0, eveningTime);






	}
	public static void city() {
		ArrayList<String> arrCity=new ArrayList<String>();
		arrCity.add("jaunpr");	
		arrCity.add("varansi");
		arrCity.add("pragRaj");
		arrCity.add("mirzapur");
		System.out.println(arrCity);
		arrCity.remove(2);
		System.out.println(arrCity);



	}
	public static void merge() {
		ArrayList<String> arrmerge=new ArrayList<String>();
		arrmerge.add("Vimal");
		arrmerge.add("bind");
		arrmerge.add("dheeraj");
		System.out.println(arrmerge);
		arrmerge.addAll(0, arrmerge);
		System.out.println(arrmerge);
		
		
		
		
	}

	public static void list() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("vimal");
		arr.add("adampur");
		arr.add("nigoh");
		// int atotal=arr.size();
		//System.out.println(atotal);
		System.out.println(arr);

		
		LinkedList<String> link=new LinkedList<String>();
		link.add("vimal");
		link.add("adampur");
		link.add("adame");
		link.add("yyy");
		link.add("tt");
		link.add("1122");
		link.add("vimal7800");
		//int alink=link.size();
		System.out.println(link);
	//	System.out.println(alink);

		
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("vimalq");
		set.add("chandq");
		set.add("bind");
		set.add("adampur");
		set.add("aa");
		set.add("bbb");
		set.add("");
		int aset=set.size();
		System.out.println(aset);
		System.out.println(set);
		
		HashSet<Integer> has=new HashSet<Integer>();
		
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		has.add(20);
		
		
		
		
		
		
		
		
		
		
	}



















	public static void product() {	
		double [] arr=new double [5];
		double TotalCount=arr.length;
		arr[0]=189.5;
		arr[1]=131.5;
		arr[2]=258.5;
		arr[3]=267.9;
		arr[4]=36.0;
		System.out.println("Array lenth - "+TotalCount);
	}
	public static void even() {
		int num=0;
		ArrayList<Integer>arrr=new ArrayList<Integer>();
		arrr.add(4);
		arrr.add(8);
		arrr.add(12);
		arrr.add(16);
		arrr.add(20);
		arrr.add(24);
		arrr.add(28);
		arrr.add(32);
		arrr.add(36);
		arrr.add(40);
		for(int i=0; i<10;i++) {
			num=num+arrr.get(i);
		}
		System.out.println("add even number - "+num);
		System.out.println("array List  - "+arrr);	
	}
	public static void salary() {

		ArrayList<Integer> salary=new ArrayList<Integer>();
		salary.add(20000);
		salary.add(40000);
		salary.add(60000);
		salary.add(80000);

		System.out.println("Actual Salary  - "+salary);
		salary.set(0, 22000);
		salary.set(1, 44000);
		salary.set(2, 66000);
		salary.set(3, 70000);

		System.out.println("Increse Salary - "+salary);	
	}
	public static void Merge() {

		ArrayList<String> name=new ArrayList<String>();
		name.add("Vimal");

		ArrayList<String> name1=new ArrayList<String>();
		name1.add("Bind");

		name.addAll(name1);
		System.out.println(name);

	}
	public static void Marks() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(30);
		arr.add(50);
		arr.add(80);
		arr.add(120);
		arr.add(300);

		int higest=arr.get(0);
		for(int i=0; i<5; i++) {
			higest=arr.get(i);
		}
		System.out.println(higest);	
	}
	public static void Fruit() {
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("pineApple");
		fruit.add("Guava");
		fruit.add("Litchi");
		fruit.add("Mango");
		fruit.add("Banana");

		boolean Li=fruit.contains("Litchi");
		System.out.println(Li);
	}
	public static void Reverse() {
		ArrayList<String> rev=new ArrayList<String>();
		rev.add("20");
		rev.add("19");
		rev.add("39");
		rev.add("28");
		rev.add("90");
		rev.add("110");
		rev.add("400");
		rev.add("900");
		rev.add("140");
		rev.add("160");

		for(int i=9; i>0;i--) {
			System.out.println("revers Number - "+rev.get(i));
		}
	}
	public static void Student() {
		ArrayList<String> stu=new ArrayList<String>();
		stu.add("vimal");
		stu.add("aman");
		stu.add("Ritesh");
		stu.add("Jay");
		stu.add("Dhruv Gupta");
		stu.add("Rahul Gupta");
		for(int i=0;i<6;i++) {
		}
		System.out.println("Diamond Student Name  - "+stu);
	}
	public static void City() {
		ArrayList<String> city=new ArrayList<String>();
		city.add("Machhalisahar");
		city.add("Jaunpur");
		city.add("Mirzapur");
		city.add("Varansi");

		System.out.println(city);
		String Remove_city=city.remove(2);
		System.out.println(Remove_city);
		System.out.println(city);

	}

	public static void order() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("3");
		arr.add("40");
		arr.add("8");
		arr.add("11");
		arr.add("30");
		System.out.println("desending order  - "+arr);
		Collections.sort(arr);
		System.out.println("acending order  - "+arr);

	}
}

