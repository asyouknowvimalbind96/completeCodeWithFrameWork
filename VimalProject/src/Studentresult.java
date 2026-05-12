
public class Studentresult {


	/*Scenario 1--create a class name is studentresult
	And then create one method name is studentmark using two hard coded value 
	subject1-40 and subject 2-45 
	A student got marks in two subjects. Return the total marks.

	Scenario2: A customer buys two items. Return the total cost.
	Help--create a method name is gottotalcost , and then create two local variable name is 
	firstitem 500 and name is Seconditem 700
	Sum both price firstitem and second so we will get total price and then return a  
	totalcostval and then call it from main method and then print

	Scenario3: An employee worked 4 hours in 
	the morning and 5 in the evening. Return total hours

	Scenario4: Create a method that takes first name and 
	last name, and returns the full name.


	Second Method: calculateFinalBill(int total)
	This method takes the total price (returned by the first method) as a parameter.
	It multiplies the total price by 2 because the customer is buying 2 quantities of the items.
	It returns the final bill amount.
	Example: If the total price is ₹150, the final bill is ₹150 × 2 = ₹300.
	Using the Methods in main()
	First, we call the getTotalPrice() method by passing the prices of the two items.
	We store the returned total price in a variable.
	Then, we call the calculateFinalBill() method by passing the total price.
	Finally, we print the final bill amount.
	/*
	 * 
	 */

	public static void main(String[] args) {
		
		int allMark=Studentresult.StudentMark();
		int p=Studentresult.m2(allMark, 40);
		System.out.println(p);
		// System.out.println("Student two subject's mark-- "+allMark);

//		int totalcostval=Studentresult.gottotalcost();
//		System.out.println("total price first and second item-- "+totalcostval);
//
//		int totalWorkTime=Studentresult.empWork();
//		System.out.println("Empoloyee total work time-- "+totalWorkTime);
//
//		String FullName=Studentresult.FullNameData();
//		System.out.println("Full name print-- "+FullName);
//
//		int TotalPriceFinally=Studentresult.calculateFinalBill(150,2);
//		System.out.println("Buy 2 item Total Final Price-- "+TotalPriceFinally);

	}
	public static int StudentMark() {
		int subject1=40;
		int subject2=45;

		int total=subject1+subject2;
		
	
		
		return total;
	}
	public static int gottotalcost() {
		int FirstItem=500;
		int SecondItem=700;
		int totalPrice=FirstItem+SecondItem;

		return totalPrice;
	}
	public static int empWork() {
		int MorningWorkTime=4;
		int EveningWorkTime=5;
		int totalHour=MorningWorkTime+EveningWorkTime;

		return totalHour;
	}
	public static String FullNameData() {
		String name="Vimal ";
		String sirName="Bind";
		String fullName=name+sirName;

		return fullName;
	}

	public static int calculateFinalBill(int total,int quantity) {
		int totalAmount=total*quantity;

		return totalAmount;

	}
	public static int m2(int w,int q) {
		int r=w-q;
		return r;
	}
}
