/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
11
101
1001
11111

 */

 import java.util.*;
 class Pattern58{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         int j = 1;
         while(row>0){
            i=1;
            while(i<=j){
               if(row>=rowTemp-1 || row<2){
                System.out.print(1);
               }
               else{
                if(i<2 || i==j){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
               }
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }    
    }  
          
}