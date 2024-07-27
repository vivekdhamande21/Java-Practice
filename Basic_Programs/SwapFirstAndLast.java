/*Write a program to swap first and last digits of any number. */
import java.util.*;

class SwapFirstAndLast{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int num = sc.nextInt();

        String str = Integer.toString(num);

        int length = str.length();

		if(length <= 1){
			System.out.println(num);
		}

		char first = str.charAt(0);

		char last = str.charAt(length-1);

		String SwappedString = last + str.substring(1,length-1) + first;

		System.out.println("Before swaping your Number is : " + SwappedString );

	}
}