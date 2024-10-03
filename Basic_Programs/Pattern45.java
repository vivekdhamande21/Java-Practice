/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

12345
1234
123
12
1

 */

 import java.util.*;
 class Pattern45{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         while(row>0){
            i=1;
            while(i<=row){
                System.out.print(i);
                i++;
            }
            System.out.println("");
            row--;
         }    
    }  
          
}