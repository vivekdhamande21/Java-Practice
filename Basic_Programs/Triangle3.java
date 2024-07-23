/*Write a program to enter base and height of a triangle and find its area*/
import java.util.*;
class Triangle3{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side : ");
		int side = sc.nextInt();
		System.out.println("Area is " + (0.433*side*side));
	}

}