
public class ShoppingA {

	public static void main(String[] args) {
		 ShoppingA.jeansShop(3, 5 ,25);
		
		 ShoppingA.jeansShop(15, 5, 13.5);

	}
	public static void jeansShop(int jeansCount,int shirtCount,int discount) {

			int jeans=1650;
			int totalJeans=jeans*jeansCount;
			
			int shirt=1350;
			int totalShirt=shirt*shirtCount;
			
			int totalPrice=totalJeans+totalShirt;
			int discountPrice=totalPrice*discount/100;
			
			int netPay=totalPrice-discountPrice;
			System.out.println("Net Payment of '3-jeans' and '5-shirt' - "+netPay);
			

	}

	public static void jeansShop(int towelCount,int capCount,double discount) {

			int towel=390;
			int totalTowel=towel*towelCount;
			
			int cap=180;
			int totalcap=cap*capCount;
			
			int totalPrice=totalTowel+totalcap;
			
			double discountP=totalPrice*discount/100;
			double netPay=totalPrice-discountP;
			System.out.println("Net payment of '15-towel. and '5-caps' - "+netPay);

	}


}
