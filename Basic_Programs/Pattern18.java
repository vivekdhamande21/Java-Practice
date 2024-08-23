/*write a function in C to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
     *
    **
   ***
  ****
 *****
  ****
   ***
    **
     *
 
 */

import java.util.*;
class Pattern18{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i,j=1,k=0,loop=row+(row-1);
  		while(loop >= 0 ){ 
            i  = 1;
            while( i <= rowTemp){     
                if(i>(rowTemp-j))
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }   
                i++;
            }
            System.out.println("");
            loop--;
            if(j==rowTemp){
                k=1;
            }
            if (k==1) {
                j--;
            }
            else{
                j++;
            }
        }        
	}	
}