/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

0110
1001
1001
1001
0110

 */

 import java.util.*;
 class Pattern36{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         System.out.println("Enter col");
         int col = sc.nextInt();
         int j=1;
         int i;
         while(row > 0){ 
            i=1;
            while( i <= col){
                System.out.print(j);
                i++;
                j++;
            }
            System.out.println("");
            row--;
        }
    }        
}