package gov.Adhar;

public class nonTest {

	public static void main(String[] args) {


		nonAdhar vimal=new nonAdhar();
		nonAdhar neeraj=new nonAdhar();
		nonAdhar anuj=new nonAdhar();
		nonAdhar rohit=new nonAdhar();

		rohit.createAdharCard("Rohit yadav", 25);

		anuj.createAdharCard("anuj bind", 18);
		vimal.createAdharCard("vimal bind", 23);
		neeraj.createAdharCard("neeraj bind", 20);
		System.out.println(vimal.AdharNumber);
		System.out.println(neeraj.AdharNumber);
		System.out.println(anuj.AdharNumber);


		anuj.changeMobileNumber(anuj.AdharNumber);


		vimal.changeAddress(vimal.AdharNumber);



	}

}
