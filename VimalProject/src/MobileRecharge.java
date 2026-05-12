
public class MobileRecharge {

	public static void main(String[] args) {

		int total=MobileRecharge.getrechageamount(199);

		MobileRecharge.printRechargeDetails(total);
		int d=total+200;
	System.out.println("added amount 200 rupee-- "+d);	
	}
	public static int getrechageamount(int amount) {

		return amount;

	}
	/*Create a method getRechargeAmount() that returns ₹199. 
	 * Pass it to printRechargeDetails(int amount) which prints
	 *  “Recharge of ₹199 successful.”
	 */

	public static int printRechargeDetails(int amount) {
			
		System.out.println("Print recharge amount--"+amount);
		return amount;
	}


}
