package learningOOPS;

public abstract class Vehicle {
	
	public abstract void start() ;
	
	public void stop() {
		System.out.println("Hi  I am stop ");
	}
	
	public void horn() {
		System.out.println("Hi  I am horn ");
	}
	public void Refuel() {
		System.out.println("Hi  I am Refule ");
	}
	public void repair() {
		System.out.println("Hi  I am repair ");
	}
	public void diesel() {
		System.out.println("Hi  I am diesel ");
	}

}
