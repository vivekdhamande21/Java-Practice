/*Write a program to count minimum number of notes required for a given amount(valid notes are 
2000,500,100, 50, 20, 10, 5, 1). input - 4553  output - 7 */

import java.util.*;
class CountNotes{
	public static void main(String[] args){
		int arr[] = {2000,500,100,50,20,10,5,1};
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Choose your number:");
		int num = sc.nextInt();
		int count = 0;
		int i = 0;
		while(i < arr.length){
			while(num >= arr[i]){
				num = num - arr[i];
				count++;	
			}
			i++;
		}
		System.out.println(count);
		
 	}
  
}