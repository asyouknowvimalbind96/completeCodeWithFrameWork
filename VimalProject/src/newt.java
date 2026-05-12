
public class newt {

	public static void main(String[] args) {
		




		annualfee();
		cloth();
		kiranaStore();
		movieT();
		priya();
		shop();
		shoppingmall();
		Travell();
		Try();
		shoppingMallDiscoung();
		

	}

	public static void annualfee() {	
		int annualS=3000;
		int certificateAdd=500;
		int totalA=annualS+certificateAdd;
		int gstPercent=5;
		int gstPrice=totalA*gstPercent/100;
		int netPay=totalA+gstPrice;

		System.out.println(netPay);

	}

	public static void hello() {
		
		System.out.println("i am sorry  your voice is jurring");
	}
	
	
	
	public static void cloth() {
		int jeans=1500;
		int jeansCount=3;
		int jeansPrice=jeans*jeansCount;
		int shirt=1200;
		int shirtCount=4;
		int shirtPrice=shirt*shirtCount;
		int shoes=4050;
		int shoesCount=4;
		int shoesPrice=shoes*shoesCount;
		int total=jeansPrice+shirtPrice+shoesPrice;
		int discountPercentage=37;
		int discount=total*discountPercentage/100;
		int net=total-discount;
		int gst=18;
		int netPrice=net*gst/100;
		int netA=total+gst;
		System.out.println(netPrice);
		System.out.println(netA);

	}
	public static void kiranaStore() {
		int parle=800;
		int parleCount=4;
		int parlePrice=parle*parleCount;
		int nirma=900;
		int nirmaCount=5;
		int nirmaPrice=nirma*nirmaCount;
		int lux=1000;
		int luxCount=24;
		int luxPrice=lux*luxCount;
		int santoor=899;
		int total=parlePrice+nirmaPrice+luxPrice+santoor;
		int discountPercentage=25;
		int discount=total*discountPercentage/100;
		int net=total-discount;
		
		System.out.println(net);

	}
	public static void movieT() {
		int ticket=250;
		int ticketPerson=5;
		int ticketPrice=ticket*ticketPerson;
		int snack=500;
		int Tsnack=ticketPrice+snack;
		int discount=300;
		int totalPay=Tsnack-discount;
		
		System.out.println(totalPay);


	}

	public static void priya() {
		int item=2000;
		int discount=10;
		int itemP=item*discount/100;

		int disPrice=item-itemP;

		int gst=5;
		int gstP=disPrice*gst/100;
		int netP=disPrice+gstP;
		
		System.out.println(netP);

	}
	public static void shop() {
		int sampoo=300;
		int sampooC=10;
		int sampooPrice=sampoo*sampooC;

		int shop=210;
		int shopC=15;
		int shopPrice=shop*shopC;

		int poweder=70;
		int powederC=15;
		int powederPrice=poweder*powederC;

		int rice=400;
		int riceC=15;
		int ricePrice=rice*riceC;

		int total=sampooPrice+shopPrice+powederPrice+ricePrice;

		int discountPercent=15;
		int discount=total*discountPercent/100;
		int net=total-discount;

		int gst=18;
		int finalPrice=net*gst/100;
		
		System.out.println(finalPrice);

	}

	public static void shoppingmall() {
		int shirt=1200;
		int shirtCount =3;
		int shirtPrice=shirt*shirtCount;

		int paint=1800;
		int paintCount=4;
		int paintPrice=paint*paintCount;

		int shoes=3500;
		int shoesCount=5;
		int shoesPrice=shoes*shoesCount;

		int total=shirtPrice+paintPrice+shoesPrice;
		int discountPercentage=27;
		int discount=total*discountPercentage/100;
		int net=total-discount;
		int gstPercentage=18;
		int gstP=net*gstPercentage/100;
		int netpricewithgst=net+gstP;
		
		System.out.println(netpricewithgst);

	}
	public static void Travell() {
		int hotal=1200;
		int hotalCount=3;
		int totalhotalD=hotal*hotalCount;

		int foodPrice=500;
		int foodCount=3;
		int totalfoodD=foodPrice*foodCount;

		int lTransport=300;
		int lTransportCount=3;
		int totaltransportD=lTransport*lTransportCount;

		int total=totaltransportD+totalfoodD+totalhotalD;
		int giveC=80;
		int netP;
		netP=total*giveC/100;
		int giveMe=total-netP;
		
		System.out.println(giveMe);
	}
	public static void Try() {
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

		public static void shoppingMallDiscoung() {
			int jeans=1200;
			int jeansCount=2;
			int jeansPrice=jeans*jeansCount;
			
			int shirt=800;
			int shirtCount=3;
			int shirtPrice=shirt*shirtCount;
			
			int jaicket=2500;
			
			int total=jeansPrice+shirtPrice+jaicket;
			
			int aboveAmount=5000;
			int onlyDisAmount=total-aboveAmount;
			
			int disParcenta=10;
			
			int netP=onlyDisAmount*disParcenta/100;
			int netPay=total-netP;
			
		
			System.out.println(netPay);
			
			
			
			
			
		
		}










}

		
		
		