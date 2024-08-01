/*Write a program to print all Perfect numbers between 1 to n*/
import java.util.*;
class PerfactNumberOneToN{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
        int i = 1;
		System.out.println("Your number is perfact " + 1);
    	while(i<=num){
			int j = 1;
			int sum = 0;
	    	while(j < i){
		    	if(i%j == 0){
			    	sum = sum + j;	
		    	}
		    	j++;
	    	}
	    	if(sum == i){
	        	System.out.println("Your number is Perfact: " + i);
 
			}
           	i++;
        }
	}	
}