
public class ClassFour {

	public static void main(String[] args) {
		ClassFour.showMarks(600);
		ClassFour.showMarks(65, 28);
		
	}
public static void showMarks(int totalmarks) {
	
	System.out.println("total marks- "+totalmarks);
}
public static void showMarks(int theory,int practical) {
	
	
	System.out.println("theor marks- "+theory+"   practical marks-"+practical);
}
}
