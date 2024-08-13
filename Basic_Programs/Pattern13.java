/*write a function in java to print following pattern
Note: Only number of rows shall be the input parameter to the 
function
Hollow inverted right triangle

   *
  ***
 *****
*******

*/

import java.util.*;
class Pattern13{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i,j=0;
  		while(row > 0) { 
            i  = 1;
            while( i <= ((rowTemp*2) -1) ){
                if((i<=rowTemp+j) && (i >=row))
                    System.out.print("*");
                else
                    System.out.print(" ");
                i++;
            }
            System.out.println("");
            row--;
            j++;
        }        
	}	
}