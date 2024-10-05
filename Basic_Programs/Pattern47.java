/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

54321
4321
321
21
1

 */

 import java.util.*;
 class Pattern47{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j=row;
         while(row>0){
            i=1;
            j=row;
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