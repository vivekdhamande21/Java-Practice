/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

13579
3579
579
79
9

 */

 import java.util.*;
 class Pattern54{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j;
         int k=1;
         while(row>0){
            i=1;
            j=k;
            while(i<=row){
                System.out.print(j);
                i++;
                j=j+2;
            }
            System.out.println("");
            row--;
            k=k+2;
         }    
    }  
          
}