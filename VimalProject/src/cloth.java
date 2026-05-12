public class cloth{
public static void main(String[] arge){
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
}