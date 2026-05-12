package reverseLogic;

public class logical {

	public static void main(String[] args) {
		//reverseNumber();
		//samePlaceReverseWord();
		//reverseCharector();
		revName1();
	}

	public static void reverseNumber() {
		int [] arr= {56,7,8765,98,53};
		for(int i=arr.length-1;i>=0;i--) {
			int val=arr[i];
			System.out.print(val);
		}
	}

	public static void samePlaceReverseWord() {
		String name="Ashish kumar yadav";
		String []splitedName=name.split(" ");
		for(int i=0;i<splitedName.length;i++) {
			String splitValue=splitedName[i];
			for(int j=splitValue.length()-1;j>=0;j--) {
				char chr=splitValue.charAt(j);
				System.out.print(chr);
			}

		}
	}
		public static void reverseCharector() {
			String name="Vimal Chand Bind";
			for(int i=name.length()-1;i>=0;i--) {
				char chr=name.charAt(i);
				System.out.print(chr);
			}
		}
		public static void revName() {
			String name="Vimal Chand Bind jaunpur";
			String [] arrName=name.split("a");
			for(int i=arrName.length-1;i>=0;i--) {
				String val=arrName[i];
				System.out.println(val);
			}
		}
		
		public static void revName1() {
			String name="Vimal Chand Bind jaunpur";
			String [] arrName=name.split("a");
			for(int i=0;i<arrName.length;i++) {
				String val=arrName[i];
				System.out.println(val);
			}
		}
		
}
