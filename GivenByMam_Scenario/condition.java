package GivenByMam_Scenario;


public class condition {

	public static void main(String[] args) {
		
	
		int t[]={10,12,13,7,14,18,20,11,21};
		for(int a=0;a<t.length; a++){
		if(t[a]%2==0){
		System.out.println(t[a]);
		}
		}

	
		int yy[]= {9,4,7,6,1,3,12,5,16};
		for(int a=0;a<yy.length;a++) {
			if(yy[a]%2==0) {
				System.out.println("this is a even number   "+yy[a]);	
			}
		}
		for(int r=0;r<yy.length;r++) {
			if(yy[r]%2!=0) {
				System.out.println("this is a odd number      "+yy[r]);
			}
		}
	
		System.out.println();

		int  arr [] = {10,3,7,5,3,6,4,9,11,62};
		
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.println("it is a even number   "+arr[j]);
			}
		}
		
		
		
		
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("it is a odd number    "+arr[i]);
			}
		}
		
		}
	}


