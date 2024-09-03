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
 class Pattern27{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         System.out.println("Enter col");
         int col = sc.nextInt();
         int i=1,j=0;
         int colTemp = col+1;
        while(row>0){ 
            while( i <= col  && i>0){     
                System.out.print(i);
                if (j==1) {
                    i--;
                }
                else{
                    i++;
                }
            }
            System.out.println("");
            row--; 
            if(i==colTemp){
                j=1;
                i--;
            }
            if(i==0){
                j=0;
                i++;
            }    
        }
        sc.close();
    }        
}