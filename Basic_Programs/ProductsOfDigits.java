/*Write a program to calculate Product of digits of any number.*/

import java.util.*;
class ProductsOfDigits{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int num = sc.nextInt();

        int product = 1;

        if (num < 10) {
            System.out.println(num);
        }
        else{
            while (num > 0) {
                product = product * (num%10);
                num = num/10;
            }
            System.out.println(product);
        }
       sc.close();
	}
}