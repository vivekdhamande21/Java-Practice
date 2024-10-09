/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

5
45
345
2345
12345

 */

 import java.util.*;
 class Pattern50{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int k=1;
         int j;
         while(row>0){
            i=1;
            j = row;
            while(i<=k){
                System.out.print(j);
                i++;
                j++;
            }
            System.out.println("");
            row--;
            k++;
         }    
    }  
          
}