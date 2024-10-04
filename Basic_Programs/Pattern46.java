/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
21
321
4321
54321

 */

 import java.util.*;
 class Pattern46{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j=1;
         int k;
         while(row>0){
            i=1;
            k=j;
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