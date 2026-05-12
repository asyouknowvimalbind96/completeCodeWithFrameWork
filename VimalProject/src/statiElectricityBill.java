
public class statiElectricityBill {
	
	static int bill1;

	public static void main(String[] args) {


		 bill1=ElectricityBill.getUnitCharge();

		statiElectricityBill.printTotalBill();
		statiElectricityBill.sendNotification();
		statiElectricityBill.generatateRecipt();
		statiElectricityBill.applyTax();

	}
	public static int getUnitCharge() {

		int bill=250;
		return bill;

	}
	public static void printTotalBill() {
		System.out.println("print total bill--"+bill1);
	}

	public static void sendNotification() {

		System.out.println("send notification--"+bill1);
	}
	public static void generatateRecipt() {
		System.out.println("receipt generat amoung -"+bill1);
	}
	public static void applyTax() {

		System.out.println("gst applied (18%) tax --"+bill1*18/100);
	}




	}


