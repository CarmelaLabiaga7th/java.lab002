package java.lab002;
import java.util.Scanner;  
public class MyClass {

	public static void main(String[] args) {
		Scanner subtotalScanner = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter subtotal");
		String stringSubtotalAmount = subtotalScanner.nextLine();
		float subtotalAmount = Float.parseFloat(stringSubtotalAmount);
		
		Scanner discountPercentScanner = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter discount percent");
		String stringdiscountPercentAmount = discountPercentScanner.nextLine();
		float discountPercentAmount = Float.parseFloat(stringdiscountPercentAmount);
		
		
	}
}
