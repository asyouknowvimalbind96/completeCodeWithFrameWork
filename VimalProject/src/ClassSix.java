
public class ClassSix {

	public static void main(String[] args) {
		ClassSix.PrintDetails("Vimal Bind");
		ClassSix.PrintDetails("Vimal Bind", "Adampur Nigoh Barsathi jaunpur 222162");
		
	}

public static void PrintDetails(String name) {
	
	System.out.println("Only Studen's name-: "+name);
}
public static void PrintDetails(String name,String Address) {
	
	System.out.println("Student's name-:  "+name+".  Student's Full Address-: "+Address);
}
}