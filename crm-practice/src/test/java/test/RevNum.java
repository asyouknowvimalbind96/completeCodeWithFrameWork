package test;

public class RevNum {

	public static void main(String[] args) {
		reverseWordNotCharactor();
		
		//reverseName();
	}
	
	
	public static void reverseWordNotCharactor1(){
		String name="Vimal Chand Bind Adampur Nigoh Jaunpur";
		String[] arr=name.split(" ");
		for(int i=arr.length-1;i>=0;i--){
		String arrValue=arr[i];
		for(int j=0;j<arrValue.length();j++){
		char chrWord=arrValue.charAt(j);
		System.out.print(" "+chrWord);
		}
		}
		}
	
	
	
	public static void reverseWordNotCharactor(){
		String name="Vimal Chand Bind Adampur Nigoh Jaunpur";
		String[] arr=name.split(" ");
		for(int i=arr.length-1;i>=0;i--){
		String val=arr[i];
		for(int j=0;j<val.length();j++) {
			char chr=val.charAt(j);
			System.out.print(chr);
		}
		System.out.println(" ");
		}
		}
	
	
	
	
	public static void reverseName() {
		String name="Ravi";
		for(int i=name.length()-1;i>=0;i--) {
			char chr=name.charAt(i);
			System.out.print(chr);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void ReverseNumber() {
		int number=54321;
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