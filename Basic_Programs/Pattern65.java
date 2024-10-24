/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

 */

 import java.util.*;
 class Pattern65{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i = 1;
         int j;
         int k = 1;
         while(row>0){
            i=1;
            j=k;
            if(j%2==1){
                while(i<=j){
                    System.out.print(i);
                    i++;
                }
            }
            else{
                while(j>0){
                    System.out.print(j);
                    j--;
                }
            }
            System.out.println();
            k++;
            row--;
        }     
   }  
          
}