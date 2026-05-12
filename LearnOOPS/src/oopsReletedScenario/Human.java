package oopsReletedScenario;

public abstract class Human {

	public Human(int age) {
		System.out.println("I am Human "+age);
	}
	
	
	public abstract void eat() ;
	
	
    public void walk() {
		System.out.println("walk in garden");
	}
	
}
