/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
55555
4444
333
22
1
 */

 import java.util.*;
 class Pattern41{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         while(row>0){
            i=1;
            while(i<=row){
                System.out.print(row);
                i++;
            }
            System.out.println("");
            row--;
         }    
    }  
          
}