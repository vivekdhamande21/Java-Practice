/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
01
010
1010
10101

 */

 import java.util.*;
 class Pattern57{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int j = 1;
         int k = 1;
         while(row>0){
            i=1;
            while(i<=j){
                if(k==1){
                    System.out.print(k);
                    k--;
                }
                else{
                    System.out.print(k);
                    k++;
                }
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}