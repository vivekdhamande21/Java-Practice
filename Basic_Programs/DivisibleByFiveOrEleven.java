/*Write a program to check whether a number is divisible by 5 and 11 or not*/
import java.util.*;
class DivisibleByFiveOrEleven{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if( num%5 == 0 || num%11 == 0 )
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}