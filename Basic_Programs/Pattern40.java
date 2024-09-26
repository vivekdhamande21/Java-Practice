/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond
1
22
333
4444
55555
 */

 import java.util.*;
 class Pattern40{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int i;
         int j=1;
         while(row>0){
            i=1;
            while(i<=rowTemp){
                if(i<=j){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println("");
            row--;
            j++;
         }
    
    }  
          
}