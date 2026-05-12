
public class generalStore {

	public static void main(String[] args) {
		int totalPrice=generalStore.price();
		// System.out.println("Same Rate all product -"+totalPrice);
		generalStore.pulse(totalPrice, 9);
		generalStore.rice(totalPrice, 10);
		generalStore.wheat(totalPrice, 8);
		generalStore.peaPulse(totalPrice, 20);
		generalStore.jaisamineOil(totalPrice, 15);
		generalStore.sarsoOil(totalPrice, 18);
		generalStore.soyabeenOil(totalPrice, 110);
		generalStore.pulse(totalPrice, 12);
		
		
		
		
		
	}

	public static int price() {
		int priceA=150;

		return priceA;
	}
	public static void pulse(int rate,int weight) {
		int netPay=rate*weight;
		System.out.println("total amount is pulse -"+netPay);
	}
	public static void rice(int rate,int weight) {
		int netpay=rate*weight;
		System.out.println("total amount is rice -"+netpay);


	}
	public static void wheat(int rate,int weight) {
		int netpay=rate*weight;
		System.out.println("total amount is wheat -"+netpay);


	}
	public static void peaPulse(int rate,int weight) {
		int netpay=rate*weight;
		System.out.println("total amount is pea pulse -"+netpay);


	}
	public static void jaisamineOil(int rate,int quantity) {
		int netpay=rate*quantity;
		System.out.println("toal amount is jaismine Oil -"+netpay);


	}
	public static void sarsoOil(int rate,int weight) {
		int netpay=rate*weight;
		System.out.println("total amount is sarso oil -"+netpay);



	}
	public static void soyabeenOil(int rate,int weight) {
		int netpay=rate*weight;
		System.out.println("total amount is soyabeen Oil -"+netpay);


	}
}











