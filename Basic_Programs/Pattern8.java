/* write a function in java to print following pattern
Note: Number of rows and columns shall be the input parameters 
to the function
Rectangle
*
**
* *
*  *
*****

*/
import java.util.*;
class Pattern8{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int rowTemp = row;
        int i=0,j;
  		while(row > 0) { 
            j=0;
            while(j <= i){
                if((rowTemp-1 > row && row > 1) && (j>0 && j<i)){
                    System.out.print(" ");   
                }
                else{
                    System.out.print("*");
                }
                j++;
            }
            System.out.println("");
            row--;
            i++;
        }        
	}	
}