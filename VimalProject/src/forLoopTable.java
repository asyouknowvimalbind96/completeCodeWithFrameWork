
public class forLoopTable{

	public static void main(String[] args){
		// table();
		// plush();
		 table2to10();
	}
	public static void table() {
		int a=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		int g=7;
		int h=8;
		int i=9;
		int j=10;
		for(int b=1; b<=10; b++) {
			System.out.println((a+"x"+b+"="+a*b)+"  "
					+ "  "+(c+"x"+b+"="+c*b)+"     "+(d+"x"+b+"="+d*b)+"    "+(e+"x"+b+"="+e*b)
					+"   "+(f+"x"+b+"="+f*b)+"   "+(g+"x"+b+"="+g*b)+"   "+(h+"x"+b+"="+h*b)+"   "+
					(i+"x"+b+"="+i*b)+"   "+(j+"x"+b+"="+j*b));
		}
		System.out.println(a);


	}

	public static void table2to10() {

		for(int a=1; a<=10;a++) {
			for(int b=2; b<=10;b++) {
				System.out.print(b+"x"+a+"="+(a*b)+"\t");
			}
			System.out.println();
		}



	}

	public static void plush() {

		for(int a=1; a<=10;a++) {
			for(int b=1; b<=100;b++) {
				System.out.print(a+"+"+b+"="+(a+b)+"\t");
			}
			System.out.println();
		}
	}


}




