
public class Classtwo {

	public static void main(String[] args) {

		Classtwo.studentInfo(1897059);

		Classtwo.studentInfo(1897059, "Vimal Bind");


	}
	public static void studentInfo(int rollNumber) {

		System.out.println("Student roll Number-"+rollNumber);


	}

	public static void studentInfo(int rollNumber,String name) {


		System.out.println("Student name -"+name   +"    rollnumber-"+rollNumber);
		System.out.println();

	}





}
