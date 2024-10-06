/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

5
54
543
5432
54321

 */

 import java.util.*;
 class Pattern48{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int k;
         int i;
         int j=1;
         while(row>0){
            i=1;
            k = rowTemp;
            while(i<=j){
                System.out.print(k);
                i++;
                k--;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}