/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
5
44
333
2222
11111
 */

 import java.util.*;
 class Pattern43{
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
                System.out.print(row);
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}