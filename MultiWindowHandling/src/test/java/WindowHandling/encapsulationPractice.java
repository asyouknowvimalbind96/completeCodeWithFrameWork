package WindowHandling;

public class encapsulationPractice {

	private String name;
	private int age;
	public static void main(String[] args) {
		encapsulationPractice aa=new encapsulationPractice();
//		aa.setName("vimal");
//		String setN=aa.getName();
//		System.out.println(setN);
		aa.getAge();
		aa.SetAge(20);
		int age=aa.getAge();
		System.out.println(age);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String givenName) {
		name=givenName;
	}
	public int getAge() {
		return age;
	}
	public void SetAge(int setAge) {
		if(setAge>=18) {
		age=setAge;
		}else {
			System.out.println("now you are not eligible at time  ");
			
		}
	}
	
	
	
	
	
	
}
