
// calculate sum, difference, product, division and remainder of two numbers, and print the result on the screen?
import java.lang.*;
import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your first number: ");
		int val1 = sc.nextInt();
		System.out.println("Type your second number: ");
		int val2 = sc.nextInt();
		System.out.println("Type 1 for Addition of two numbers: ");
		System.out.println("Type 2 for Difference  of two numbers: ");
		System.out.println("Type 3 for Product of two numbers: ");
		System.out.println("Type 4 for Division of two numbers: ");
		System.out.println("Type 5 for Remender:  ");
		int n = sc.nextInt();
		switch(n){
			case 1 : System.out.println("Addition : " + (val1 + val2));
				 break;
			case 2 : System.out.println("Difference : " + (val1 - val2));
				 break;
			case 3 : System.out.println("Product : " + (val1 * val2));
				 break;
			case 4 : System.out.println("Division : " + (val1/val2));
				 break;
			case 5 : System.out.println("Remender : " + (val1%val2));
				 break;
			default : System.out.println("Please enter valid number");
		}
      }
	
}