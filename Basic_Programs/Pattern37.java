/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1234
2344
3444
4444


 */

 import java.util.*;
 class Pattern37{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
        //  System.out.println("Enter col");
        //  int col = sc.nextInt();
         int j=0,k=1;
         int i;
         while(row > 0){ 
            i=1;
            j++;
            while( i <= rowTemp){
                System.out.print(j);
                i++;
                if(j==rowTemp){
                    j=rowTemp;
                }
                else{
                    j++;
                }
            }
            System.out.println("");
            row--;
            j=k;
            k++;
        }
    }        
}