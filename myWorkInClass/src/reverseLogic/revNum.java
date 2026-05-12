package reverseLogic;

public class revNum {
public static void main(String[] args) {
	int number=4321;
	int store=0;
	int remainder;
	while(number>0) {
		remainder=number%10;
		store=store*10+remainder;
		number=number/10;
		
	}
	System.out.println(store);
}
}
