/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
 
    +
    +
    +
 +++++++
    +
    +
    +
 
 */

 import java.util.*;
 class Pattern21{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i,j=(row/2 + 1);
           while(row>0){ 
             i  = 1;
             while( i <= rowTemp){     
                 if( (i== (rowTemp/2) + 1) || (row == (rowTemp/2)+1))
                     System.out.print("+");
                 else{
                     System.out.print(" ");
                 }   
                 i++;
             }
             System.out.println("");
             row--;
             }
         }        
     }