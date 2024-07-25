/*Write a program to count number of digits in any number.*/
/*Write a program to count number of digits in any number. */
import java.util.Scanner;
class FirstAndLastDigit{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        String str = "" + num;
        int strLength = str.length();
        System.out.println("First Digit : " + str.charAt(0) + " " + "Last Digit : " + str.charAt(strLength-1) ); 
    }
}