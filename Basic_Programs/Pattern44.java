/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
12
123
1234
12345
 */

 import java.util.*;
 class Pattern44{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         int j=1;
         while(row>0){
            i=1;
            while(i<=j){
                System.out.print(i);
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}