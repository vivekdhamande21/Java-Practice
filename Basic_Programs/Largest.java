/*ake 2 numbers as input from user, print the largest number on the screen*/
import java.util.*;
class Largest{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Take num1");
		int num1 = sc.nextInt();
		System.out.println("Take num2");
		int num2 = sc.nextInt();
		if(num1 > num2)
			System.out.println(num1 + " is greater");
		else{
			 if(num1 == num2)
			 	System.out.println(num1 + "and "+ num2 + " both are equal");
			else
				System.out.println(num2 + "is greaer");
		}
	}
}