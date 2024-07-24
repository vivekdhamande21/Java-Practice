/*Take a number as an input, print if the number is odd or even*/
import java.util.*;
class OddOrEvens{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		if(num%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
	}
}