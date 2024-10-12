/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

56789
4567
345
23
1

 */

 import java.util.*;
 class Pattern53{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j;
         while(row>0){
            i=1;
            j=row;
            while(i<=row){
                System.out.print(j);
                i++;
                j++;
            }
            System.out.println("");
            row--;
         }    
    }  
          
}