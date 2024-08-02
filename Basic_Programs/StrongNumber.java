import java.util.*;
class StrongNumber{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
        int temp = num;
        int i,sum=0;
        while(num > 0){
            i = num % 10;
            int j = 1;
            while( i > 0 ){
                j = j * i;
                i--;
            }
            sum = sum + j;
            num  = num / 10;
        }
        if(temp == sum)
            System.out.println(temp + " is Strong Number");
        else
            System.out.println( temp + " is Not Strong Number");         
	}	
}