/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
12345
23451
34512
45123

 */

 import java.util.*;
 class Pattern29{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         System.out.println("Enter col");
         int col = sc.nextInt();
         int i,j=1;
         int temp;
         while(row>0){ 
            i=j;
            temp=1;
            while( temp <= col){
                System.out.print(i);
                i++;
                temp++;
                if(i>col){
                    i=1;
                } 
            }
            System.out.println("");
            row--;
            j++;   
        }
        sc.close();
    }        
}