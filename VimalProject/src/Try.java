public class Try{
	public static void main(String[] arge){

		int jeans=1250;
		int jCount=120;
		int jeansPrice=jeans*jCount;

		int shirt=1400;
		int sCount=80;
		int shirtPrice=shirt*sCount;

		int total=jeansPrice+ shirtPrice;

		int discount=25;
		int discountPrice=total*discount/100;

		int disPrice=total-discountPrice;

		int gst=18;
		int netP=disPrice*gst/100;
		int netPrice=disPrice+netP;
		System.out.println(netPrice);




	}
}