package learningOOPS;

public class Scenario_03_12_2025_1 {
	String name="class lavel";
	public static void main(String[] args) {
		Scenario_03_12_2025_1 sce=new Scenario_03_12_2025_1();
		sce.showname();
	}
	public void showname() {
		String name="local name";
		System.out.println(name);
		System.out.println(this.name);	
	}

}
