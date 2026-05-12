public class kiranaStore{
public static void main(String[] arge){

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
}