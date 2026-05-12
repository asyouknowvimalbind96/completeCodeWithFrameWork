public class shoppingmall{

public static void main(String[] args){


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
}