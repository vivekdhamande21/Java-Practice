/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

1
131
13531
1357531
135797531

 */

 import java.util.*;
 class Pattern61{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int i;
         int k;
         int j = 1;
         int t = 0;
         while(row>0){
            i=1;
            k=1;
            t=0;
            while(i<=j){
                if( k<j && t==0 ){
                    System.out.print(k);
                    k=k+2;
                }
                else{
                    System.out.print(k);
                    k=k-2;
                    t = 1;
                }
                i++;
            }
            System.out.println("");
            row--;
            j=j+2;
         }    
    }  
          
}