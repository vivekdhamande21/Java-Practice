/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

54321
5432
543
54
5

 */

 import java.util.*;
 class Pattern49{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         int j=row;
         while(row>0){
            i=1;
            j = rowTemp;
            while(i<=row){
                System.out.print(j);
                i++;
                j--;
            }
            System.out.println("");
            row--;
         }    
    }  
          
}