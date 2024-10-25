/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond


1
2 3
4 5 6 7
8 9 1 2 3 4 5 6
7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4

 */

import java.util.*;
 class Pattern66{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i = 1;
         int j=1;
         int k = 1;
         while(row>0){
           i=1;
           while (i<=j){ 
               System.out.print(" "+ k);
               i++;
               k++;
               if(k>9){
                k=1;
               }
           }
            System.out.println();
            j=j*2;
            row--;
        }     
   }  
          
}