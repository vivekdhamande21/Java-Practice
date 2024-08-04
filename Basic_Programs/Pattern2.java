/* write a function in java to print following pattern
Note: Number of rows and columns shall be the input parameters 
to the function
Rectangle
****
*  *
*  *
*  *
****

*/
import java.util.*;
class Pattern2{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter col");
        int col = sc.nextInt();
        int colTemp = col;
  		while(row > 0) { 
            col = colTemp;
            while(col > 0){
                if((row > 1 && row < 5) &&(col > 1 && col < 4)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                col--;
            }
            System.out.println("");
            row--;
        }        
	}	
}