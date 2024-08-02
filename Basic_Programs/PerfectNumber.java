/* Perfact Number */

import java.util.*;
class PerfectNumber{
	public static void main(String[] args){
		System.out.println("Choose your Number: ");
		Scanner sc = new Scanner(System.in);	
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(num+1 != i){
			if(num % i == 0){
				sum = sum + i;	
			}
			i++;
		}
		if(sum-num == num)
		    System.out.println("Your number is Perfact: " + num);
		else
		    System.out.println("Sorry your number is Not Perfact Please choose another number");
	}
}