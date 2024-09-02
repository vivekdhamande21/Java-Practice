/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
123
123
123
123

 */

 import java.util.*;
 class Pattern26{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         System.out.println("Enter col");
         int col = sc.nextInt();
         int i;
        while(row>0){ 
            i  = 1;
            while( i <= col){     
                System.out.print(i);
                i++;
            }
            System.out.println("");
            row--;
        }
        sc.close();
    }        
}