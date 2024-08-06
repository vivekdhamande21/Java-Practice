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
class Pattern4{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter col");
        int col = sc.nextInt();
        int colTemp = col;
        int i = 4;
  		while(row > 0) { 
            col = colTemp;
            while(col + i >= 0){
                if(col > 0 && ((col + i) > 4)){
                    System.out.print(" ");
                }
                else{
                     if((row < 5 && row > 1 ) && ((col + i) < 4  && (col + i) > 0)){
                        System.out.print(" ");
                     }
                    else{
                        System.out.print("*");
                    }
                }
                col--;
            }
            System.out.println("");
            row--;
            i--;
        }        
	}	
}