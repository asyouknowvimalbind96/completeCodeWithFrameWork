
public class collageClass {

	public static void main(String[] args) {
		int semesterfees1=collageClass.getSemesterfee();
		System.out.println("get semester fee is -"+semesterfees1);
		
		collageClass.printfeeReceipt(semesterfees1);
		collageClass.calculateFine(semesterfees1);
		collageClass.applySchoolarship(semesterfees1);
		collageClass.sendEmailNotification(semesterfees1);
		collageClass.generateFeeSummary(semesterfees1);
	
	}
public static int getSemesterfee() {
	int semesterfee=5500;
	return semesterfee;
}
public static void printfeeReceipt(int semesterfees) {
	System.out.println("print semester fee receipt -"+semesterfees);

}
public static void calculateFine(int finalbill) {
	
	System.out.println("calculate late fine -"+finalbill);
	
}
public static void applySchoolarship(int schoolarship) {
	System.out.println("apply schoolarship amount -"+schoolarship);
	
}
public static void sendEmailNotification(int sendnotifiation) {
	System.out.println("send notification by email -"+sendnotifiation);
	
}
public static void generateFeeSummary(int summaryfee) {
	
	System.out.println("generat summary fees is -"+summaryfee);
}
}
