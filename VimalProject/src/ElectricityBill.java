
public class ElectricityBill {
	

	public static void main(String[] args) {
		int bill1=ElectricityBill.getUnitCharge();

		ElectricityBill.printTotalBill(bill1);
		ElectricityBill.sendNotification(bill1);
		ElectricityBill.generatateRecipt(bill1);
		ElectricityBill.applyTax(bill1);

	}
	public static int getUnitCharge() {

		int bill=250;
		return bill;

	}
	public static void printTotalBill(int bill) {
		System.out.println("print total bill--"+bill);
	}

	public static void sendNotification(int bill) {

		System.out.println("send notification--"+bill);
	}
	public static void generatateRecipt(int bill) {
		System.out.println("receipt generat amoung -"+bill);
	}
	public static void applyTax(int tax) {

		System.out.println("gst applied (18 &) tax --"+tax*18/100);
	}

}
