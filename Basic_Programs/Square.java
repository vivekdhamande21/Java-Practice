import java.util.*;
class Square{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side:");
		float side = sc.nextFloat();
		System.out.println("Perimeter of Square is : " + (4*side) );
		System.out.println("Area of Square is : " + (side*side) );
	}
}