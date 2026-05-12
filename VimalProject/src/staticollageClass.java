
public class staticollageClass {

	static int semesterfees1;
	public static void main(String[] args) {
		 semesterfees1=collageClass.getSemesterfee();
		System.out.println("get semester fee is -"+semesterfees1);
		
		staticollageClass.printfeeReceipt();
		staticollageClass.calculateFine();
		staticollageClass.applySchoolarship();
		staticollageClass.sendEmailNotification();
		staticollageClass.generateFeeSummary();
	
	}
public static int getSemesterfee() {
	int semesterfee=5500;
	return semesterfee;
}
public static void printfeeReceipt() {
	System.out.println("print semester fee receipt -"+semesterfees1);

}
public static void calculateFine() {
	
	System.out.println("calculate late fine -"+semesterfees1);
	
}
public static void applySchoolarship() {
	System.out.println("apply schoolarship amount -"+semesterfees1);
	
}
public static void sendEmailNotification() {
	System.out.println("send notification by email -"+semesterfees1);
	
}
public static void generateFeeSummary() {
	
	System.out.println("generat summary fees is -"+semesterfees1);
}
}


