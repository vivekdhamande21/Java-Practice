/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

666666
655555
654444
654333
654322
654321


 */

 import java.util.*;
 class Pattern38{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int past = row;
         int i;
         while(row > 0){ 
            i=1;
            past=rowTemp;
            while( i <= rowTemp){
                if(past > row)
                    System.out.print(past);
                else
                    System.out.print(row);
                past--;
                i++;     
            }
            System.out.println("");
            row--;
        }
    }        
}