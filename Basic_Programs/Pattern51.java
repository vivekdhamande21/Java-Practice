/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

12345
2345
345
45
5

 */

 import java.util.*;
 class Pattern51{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         int j=1;
         while(row>0){
            i=j;
            while(i<=rowTemp){
                System.out.print(i);
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}