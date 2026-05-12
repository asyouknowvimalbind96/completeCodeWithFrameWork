package learningOOPS;

public class ChildSC extends parentSC{
	
	public ChildSC(int a) {
		
		System.out.println("my name child parameter constractor   >  ");
	}
	
	public ChildSC() {
		this(1);
		System.out.println("my name child constractor  > ");
	}
	
	public static void main(String[] args) {
		parentSC child=new ChildSC(10);
		child.message();
	}
	public void message() {
		System.out.println("Child Message");
	}
	public void showMessage() {
		message();
	super.message();// use super keyword then execute 
		
	}

}
