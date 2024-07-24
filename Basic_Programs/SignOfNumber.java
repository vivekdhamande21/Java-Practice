/*Write a program to check whether a number is negative, positive or zero.*/
import java.util.*;
class SignOfNumber{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		if(num == 0)
            System.out.println("Zero");
        else{
            if(num<0)
                System.out.println("Negative");
            else
                System.out.println("Positive");
        } 
	}
}