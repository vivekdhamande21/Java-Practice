/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

11111
10001
10001
11111

 */

 import java.util.*;
 class Pattern31{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         System.out.println("Enter col");
         int col = sc.nextInt();
         int i;
         while(row>0){ 
            i=1;
            while( i <= col){
               if((row > 1 && row < rowTemp) && (i > 1 && i < col ) )
                 System.out.print(0);
               else
                 System.out.print(1);
               i++;
            }
            System.out.println("");
            row--;
        }
        sc.close();
    }        
}