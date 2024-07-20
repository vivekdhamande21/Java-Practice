/* Factorial of Number */

import java.util.*;
class FactorOfNumber{
	public static void main(String[] args){
		System.out.println("Choose your Number: ");
		Scanner sc = new Scanner(System.in);	
		int num = sc.nextInt();
		int i = 1;
		while(num+1 != i){
			if(num % i == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}