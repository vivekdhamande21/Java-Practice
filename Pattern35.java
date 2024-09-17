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
 class Pattern35{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         System.out.println("Enter col");
         int col = sc.nextInt();
         int colTemp = col;
         int temp=col;
         int i;
         while(row>0){ 
            i=1;
            while( i <= col){
               if( ((row==rowTemp) || (row == 1)) && (i ==1 || i ==rowTemp))
                 System.out.print(0);
               else{
                if(((row < rowTemp) && (row > 1)) && ((i>1) && (i< rowTemp))) 
                 System.out.print(0);
                else
                 System.out.print(1);
               }
               i++;
            }
            System.out.println("");
            row--;
        }
    }        
}