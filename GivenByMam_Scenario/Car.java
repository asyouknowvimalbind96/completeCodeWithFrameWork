package GivenByMam_Scenario;

public class Car {

	String brand="";
	String color="";
	
	
	public static void main(String[] args) {
		Car obj1=new Car();
		Car obj2=new Car();
		obj1.brand="maruti";
		obj1.color="White";
		System.out.println("Name of Brand >> "+obj1.brand+" Color of Car  "+obj1.color);
		obj2.brand="BMW";
		obj2.color="Black";
		System.out.println("Name of Brand >> "+obj2.brand+"  Color of Car >>"+obj2.color);
		
	}

}
