/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
111
000
111
000
111

 */

 import java.util.*;
 class Pattern28{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         System.out.println("Enter col");
         int col = sc.nextInt();
         int i;
         while(row>0){ 
            i=1;
            while( i <= col){ 
                if(row%2==1){    
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                i++;
            }
            System.out.println("");
            row--;   
        }
        sc.close();
    }        
}