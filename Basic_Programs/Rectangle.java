import java.util.*;
class Rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		float length = sc.nextFloat();
		System.out.println("Enter breadth:");
		float breadth = sc.nextFloat();
		System.out.println("Perimeter of Rectangle is : " + (2*(length + breadth)) );
		System.out.println("Area of Recangle is : " + (length * breadth) );
	}
} 		 