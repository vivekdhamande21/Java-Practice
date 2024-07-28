
/*Write a program to enter any number, then store its reverse in another variable and
then print it */

/*Write a program to calculate Product of digits of any number.*/

import java.util.*;
class Palindrom{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        if (num < 10) {
            System.out.println("Yes Palindrom");
        }
        else{
            while (num > 0) {
                rev = rev*10 + (num%10);
                num = num/10;
            }
            if(temp==rev)
                System.out.println("Yes Palindrom");
            else
                System.out.println("Not Palindrom");
        }
       sc.close();
	}
}