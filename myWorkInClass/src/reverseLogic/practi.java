package reverseLogic;

public class practi {


	public static void main(String[] args) {
		//revNamePK();
		asdfghhj();
		asdfghhjq();
	}
	public static void revNamePK(){
		String name="ansh kumar bind";
		String[] arr=name.split(" ");
		for(int i=0;i<arr.length;i++){
			String word=arr[i];
			//			System.out.println(word);
			for(int j=word.length()-1;j>=0;j--){
				char chr=word.charAt(j);
				System.out.print(chr);
			}
		}
	}


	public static void asdfghhj() {
		String name="ashish kumar yadav";
		String [] arr=name.split(" ");
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			for(int j=word.length()-1;j>=0;j--) {
				char chr=word.charAt(j);
				System.out.print(chr);
			}
			System.out.println(" ");
		}
	}

	public static void asdfghhjq() {
		String name="ashish kumar yadav";
		String [] arr=name.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			String word=arr[i];
			for(int j=0;j<word.length();j++) {
				char chr=word.charAt(j);
				System.out.print(chr);
			}
			System.out.println(" ");
		}
	}
	
	public void webObj() {
		
	}




}
