/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
10
101
1010
10101


 */

 import java.util.*;
 class Pattern55{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j=1;
         while(row>0){
            i=1;
            while(i<=j){
                if(i%2==1)
                 System.out.print(1);
                else
                 System.out.print(0);
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}