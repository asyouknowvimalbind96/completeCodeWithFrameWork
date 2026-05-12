
public class ClassFive {

	public static void main(String[] args) {
		ClassFive.printbill("parle-G ", 24);
		ClassFive.printbill("Parle-G", 24, 5);
	

	}
public static void printbill(String itemName,int Quantity) {
	
	System.out.println("Name of item - "+itemName+"Number of Quantity - "+Quantity);

}
public static void printbill(String itemName,int Quantity,double priceParUnit) {
	
	System.out.println("name of item - "+itemName);
	System.out.println("Number of quantity - "+Quantity);
	System.out.println("price par 	unit - "+(priceParUnit));
	System.out.println("total price unit - "+(Quantity*priceParUnit));
	
}

}
