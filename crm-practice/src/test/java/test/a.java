package test;


class ReverseNumPA{
	public static void main(String []args){
		//reverseForPractice();
		
	
	}
	

public static  void reverseForPractice() {
	int number=76543;
	int store=0;
	int remainder;
	while(number>0){
		remainder=number%10;
		store=store*10+remainder;
		number=number/10;

	}
	System.out.println(store);
}


}


