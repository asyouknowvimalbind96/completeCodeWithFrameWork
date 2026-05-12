
public class paramiterSenariyo {

	public static void main(String[] args) {
		
		paramiterSenariyo.display("Vimal");
		paramiterSenariyo.display("Vimal bind", 23);
		
		System.out.println();
	}

public static void display(String b) {
	
	System.out.println(b);
	
}
public static void display(String a,int b) {
	System.out.println("name-"+a);
	System.out.println("Age-"+b);
	
}

	
	
}



