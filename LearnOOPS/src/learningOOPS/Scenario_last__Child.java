package learningOOPS;

public class Scenario_last__Child extends Scenario_last__parent {
	int value=1000;
	public static void main(String[] args) {
		Scenario_last__Child child=new Scenario_last__Child();
		child.checkValue();

	}
	public void checkValue() {
		System.out.println(value);
		System.out.println(this.value);
		System.out.println(super.value);

	}

}
