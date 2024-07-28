/*Write a program to enter any number, then store its reverse in another variable and
then print it */

/*Write a program to calculate Product of digits of any number.*/

import java.util.*;
class PrintReverseDigits{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int num = sc.nextInt();

        int rev = 0;

        if (num < 10) {
            System.out.println(num);
        }
        else{
            while (num > 0) {
                rev = rev*10 + (num%10);
                num = num/10;
            }
            System.out.println(rev);
        }
       sc.close();
	}
}