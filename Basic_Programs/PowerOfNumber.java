import java.util.*;
class PowerOfNumber{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
        System.out.println("Enter Power");
        int power = sc.nextInt();
        int product = 1;
        while(power>0){
            product  = product * number;
            power--;
        }
        System.out.println(product);    
    }
}