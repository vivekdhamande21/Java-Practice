/*write a function in Java to print following pattern
Note: Only number of columns will be the input parameter to the 
function
Mirrored half diamond

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5


 */

 import java.util.*;
 class Pattern39{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter row");
         int row = sc.nextInt();
         int rowTemp = row;
         int temp = rowTemp/2 + 1;
         int a = 0;
         int b = 0;
         int start = 1;
         int end = rowTemp;
         int temp1=temp;
         int temp2=temp;
         boolean k = false;
         int i;
         while(row>0){
            i=1;
            while(i<=rowTemp){
                if(i<start){
                    System.out.print(temp1);
                    temp1--;
                }
                else{
                    if(i>=end){
                        System.out.print(temp2);
                        temp2++;
                    }
                    else{
                        System.out.print(temp-a);
                    }
                }
                i++;
            }
            if( (start < end) && k == false){
                start++;
                end--;
                a++;
                b++;
            }
            else{
                start--;
                end++;
                a--;
                b--;
                k=true;
            }
            System.out.println("");
            row--;
            temp1=temp;
            temp2=temp-b;
         }
    
    }        
}