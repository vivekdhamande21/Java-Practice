/*Write a program to check if a user input character is upper case of lower case letter*/
import java.util.*;
class UpperCase{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter");
		char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.println("Upper");
        else
            System.out.println("Lower");
	}
}