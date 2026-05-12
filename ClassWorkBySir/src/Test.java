public class Test {
	
	public static void main(String[] args) {

		int pendrive=20;
		int pendriveRate=330;

		int pendrivePrice=pendrive*pendriveRate;

		int ram=15;
		int ramRate=600;

		int ramPrice=ram*ramRate;


		int hdd=13;
		int hddRate=2000;

		int hddPrice=hdd*hddRate;


		int ssd=17;
		int ssdRate=2300;

		int ssdPrice=ssd*ssdRate;

		int gstRate=18;
		int agstRate=12;

		int gstP=pendrivePrice+ramPrice*agstRate/100;
		int gstPay=hddPrice+ssdPrice*gstRate/100;

		int totalP=pendrivePrice+ramPrice+hddPrice+ssdPrice+gstP+gstPay;

		System.out.println(totalP);

	}
}