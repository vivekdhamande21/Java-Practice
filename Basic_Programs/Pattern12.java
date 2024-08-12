/*write a function in java to print following pattern
Note: Only number of rows shall be the input parameter to the 
function
Hollow inverted right triangle
*****
 *  *
  * *
   **
    *

*/

import java.util.*;
class Pattern12{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i,j=1;
  		while(row > 0) { 
            i  = 1;
            while( rowTemp >= i ){
                if(i >= j){
                    if((row < rowTemp && row > 2) && (i < rowTemp && i > j))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println("");
            row--;
            j++;
        }        
	}	
}