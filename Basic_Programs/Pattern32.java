/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

11111
11011
11111

 */

 import java.util.*;
 class Pattern32{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = (row/2)+1;
         System.out.println("Enter col");
         int col = sc.nextInt();
         int colTemp = (col/2)+1;
         int temp=col;
         int i;
         while(row>0){ 
            i=1;
            while( i<=temp){
               if((row==rowTemp) && (i == colTemp))
                 System.out.print(0);
               else
                 System.out.print(1);
               i++;
            }
            System.out.println("");
            row--;
            col--;
        }
    }        
}