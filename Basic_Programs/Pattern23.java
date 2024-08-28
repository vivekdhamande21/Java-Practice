/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
 
   
  ***
 **
*
 **
  ***
   

 
 */

 import java.util.*;
 class Pattern23{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = (row*2)-1;
         int rowTemp2=rowTemp;
         int i,pillar=(row/2 + 1),space=(row*2),j=0,k=0;
           while(rowTemp2>0){ 
             i  = 1;
             while( i <= rowTemp){     
                 if( i < space && i > pillar-j)
                     System.out.print("*");
                 else{
                     System.out.print(" ");
                 }   
                 i++;
             }
             System.out.println("");
             rowTemp2--;
             
             if(j==pillar){
                k=1;
             }
             if(k==1){
                j--;
                space=space+2;
             }
             else{
                j++;
                space=space-2;
             }
             }
         }        
     }