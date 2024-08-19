/*write a function in java to print following pattern
Note: Only number of rows shall be the input parameter to the 
function
Hollow inverted right triangle

*********
 *     *
  *   *
   * *
    *


*/

import java.util.*;
class Pattern16{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i,j=row-1;
  		while(row > 0) { 
            i  = 1;
            while( i <= ((rowTemp*2) -1) ){     //row < rowTemp
                if(row==rowTemp)
                    System.out.print("*");
                else{
                    if((i==rowTemp-j) || (i==rowTemp+j))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }   
                i++;
            }
            System.out.println("");
            row--;
            j--;
        }        
	}	
}