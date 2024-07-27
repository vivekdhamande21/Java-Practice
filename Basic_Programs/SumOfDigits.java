/*Write a program to calculate sum of digits of any number.*/

import java.util.*;
class SumOfDigits{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int num = sc.nextInt();

        int sum = 0;

        if (num < 10) {
            System.out.println(num);
        }

       while (num > 0) {
            sum = sum + (num%10);
            num = num/10;
       }
       System.out.println(sum);
       sc.close();
	}
}