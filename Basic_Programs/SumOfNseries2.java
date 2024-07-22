/*Take a number (say 'n') , calculate sum of first 'n' terms of following series, print it on the screen
3 7 11 15 19 23 .......*/

import java.util.*;
class SumOfNseries2{
	public static void main(String[] args){
		System.out.println("Chhose n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 5;
		while(n>0){
			if(i%2==1){
				sum = sum + i;
				n--;
			}
			i++;
		}
		System.out.println(sum);
	}
}