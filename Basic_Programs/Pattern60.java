/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
24
135
2468
13579


 */

 import java.util.*;
 class Pattern60{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int odd;
         int even;
         int j = 1;
         while(row>0){
            i=1;
            odd=1;
            even=2;
            while(i<=j){
                if(j%2==1){
                    System.out.print(odd);
                    odd=odd+2;
                }
                else{
                    System.out.print(even);
                    even=even+2;
                }
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}