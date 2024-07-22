/*Write a program to take number of days as input and convert it into years, months and weeks 
(Assume all years have 365 days and all months have 30 days) Input - 400 Output - 1 Year 1 Month 5 Days */

import java.util.*;
class DayToYear{
	public static void main(String[] args){
		//int arr[] = {365,30,1};
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day : ");
		int day = sc.nextInt();
		int year = 0;
		int month = 0;
		int days = 0;
		while(day >= 365){
			day = day - 365;
			year++;			
		}
         	while(day >= 30){
			day = day - 30;
			month++;			
		}
		while(day >= 1){
			day = day - 1;
			days++;			
		}
		System.out.println(year + " Year " + month + " Month " + days + " Day ");		
 	}
  
}