
public class WhileLoopPractice {

	public static void main(String[] args) {

		dowhileloop1();
		//whileloop2();

	}
	public static void whileloop1() {


		int a=1;
		while(a<10) {

			System.out.println(a);
			a=a+1;
			System.out.println();
		}
	}

	public static void whileloop2() {

		int a=1;
		while(a<=5) {
			a=a+2;
			System.out.println(a+"  - hello i am while loop");
			a=a+2;
		}

	}

	public static void dowhileloop1() {

		int a=1;
		while(a<=5) {
			System.out.print(a);
			a++;
		}
		int b=1;
		while(b<a) {
			System.out.println();
			b++;
		}

	}

}
