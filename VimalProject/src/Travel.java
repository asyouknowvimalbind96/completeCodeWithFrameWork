public class Travel{
public static void main(String[] arge){

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

}