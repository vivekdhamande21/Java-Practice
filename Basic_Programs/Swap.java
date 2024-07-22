import java.util.*;
class Swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your Number 1 and Number 2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
  		System.out.println("Before swaping your Number 1 and Number 2 is : " + num1 + " " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swaping your Number 1 and Number 2 is : " + num1 + " " + num2);
	}
}