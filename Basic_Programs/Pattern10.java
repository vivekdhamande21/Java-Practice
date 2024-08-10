/* write a function in java to print following pattern
Note: Number of rows and columns shall be the input parameters 
to the function
Rectangle

*****
****
***
**
*

*/
import java.util.*;
class Pattern10{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i;
  		while(row > 0) { 
            i  = 1;
            while(i < rowTemp+1){
                if(i <= row ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println("");
            row--;
        }        
	}	
} 