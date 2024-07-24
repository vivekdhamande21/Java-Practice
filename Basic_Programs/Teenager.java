/*Take the age of the user as input, print if the user is a teenager */
/*Take 3 numbers as input from user, print the largest number on the screen *//*ake 2 numbers as input from user, print the largest number on the screen*/
import java.util.*;
class Teenager{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>=18)
            System.out.println("Teenager");
        else
            System.out.println("Child");
	}
}