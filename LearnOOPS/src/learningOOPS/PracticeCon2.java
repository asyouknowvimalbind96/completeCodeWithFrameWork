package learningOOPS;

public class PracticeCon2 extends practiceCon1 {
	
	public PracticeCon2() {
		
		System.out.println("i am Child constractor without parameter ");
	}
	public PracticeCon2(int b) {
		super(10);
		System.out.println("i am Child parameterize constractor   ");
	}

}
