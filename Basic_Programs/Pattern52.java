/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
23
345
4567
56789

 */

 import java.util.*;
 class Pattern52{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = 1;
         int i;
         int j;
         int k=1;
         while(row>0){
            i=1;
            j=k;
            while(i<=rowTemp){
                System.out.print(j);
                i++;
                j++;
            }
            System.out.println("");
            row--;
            rowTemp++;
            k++;
         }    
    }  
          
}