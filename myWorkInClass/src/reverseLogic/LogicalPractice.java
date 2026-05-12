package reverseLogic;

public class LogicalPractice {

	public static void main(String[] args) {
		
	
		
		
		
//		arrReverse();
//		System.out.println();
//		arrForword();
//		System.out.println();
//		arrSplit();

	}
	public static void arrReverse() {
		int[] arrVal= {7685,9805,9857,3526,564,694,433};
		for(int i=arrVal.length-1;i>=0;i--) {
			int val=arrVal[i];
			System.out.println(val);
		}
	}
	
	public static void arrForword() {
		int[] arrVal= {7685,9805,9857,3526,564,694,433};
		for(int i=0;i<arrVal.length;i++) {
			int val=arrVal[i];
			System.out.println(val);
		}
	}
	
	public static void arrSplit() {
		String[] arrVal= {"7685","9805","9857","3526","564","694","433"};
	for(int i=arrVal.length-1;i>=0;i--) {
		String val=arrVal[i];
		System.out.println(val);
	}
	}

}
