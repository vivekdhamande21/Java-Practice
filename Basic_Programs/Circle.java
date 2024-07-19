import java.util.*;
class Circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius:");
		float radius = sc.nextFloat();
		System.out.println("Perimeter of Circle is : " + (2*3.141*radius));
		System.out.println("Area of Circle is : " + (3.141*radius*radius));
	}
}