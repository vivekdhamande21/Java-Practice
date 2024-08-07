/* write a function in java to print following pattern
Note: Number of rows and columns shall be the input parameters 
to the function
Rectangle

*****
 *****
  *****
   *****
    *****

*/
import java.util.*;
class Pattern7{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        int i,k=0;
  		while(row > k) { 
            i = k;
            while( i >= 0){
                System.out.print("*");
                i--;
            }
            System.out.println("");
            k++;
        }        
	}	
}