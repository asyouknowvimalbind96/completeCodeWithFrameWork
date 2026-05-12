package learningOOPS;

public class parentSC {
	
	public parentSC(int a) {
		
		System.out.println("my name parent parameter constractor   >  ");
	}
	
	public parentSC() {
		this(1);
		System.out.println("my name parent constractor  > ");
	}
	
	
	
	public static void main(String[] args) {
		parentSC parentC=new parentSC();
		parentC.message();
	}
	public void message() {	
		System.out.println("parent message ");
		
	}

	}


