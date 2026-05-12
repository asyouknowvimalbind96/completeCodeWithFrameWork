public class shop {
public static void main(String[] arge){

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
}