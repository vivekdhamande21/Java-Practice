/*Write a program to input any letter and check whether it is a vowel or consonant*/
import java.util.*;
class VowelOrConsonent{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter");
		char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonent");
	}
}