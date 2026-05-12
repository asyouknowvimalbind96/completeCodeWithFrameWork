
public class calculateSalary {

	public static void main(String[] args) {
		
		//int val=calculateSalary.empsalary();
		int sal=calculateSalary.empsalary(20000,400);
		int valuetip=sal+100;
		System.out.println("well done--"+valuetip);
	}
	public static void empsalary(int basicsal) {
     System.out.println("only Salary  -"+ basicsal);

	}

	public static int empsalary(int basicsal,int bonus) {
//		int  basicsal=200;
//		int bonus=300;
		int totalsal=basicsal+bonus;
		System.out.println("Salary -"+basicsal);
		System.out.println("Bonus-"+bonus);
		return totalsal;
		
	}


}
