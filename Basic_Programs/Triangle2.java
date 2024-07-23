/*Write a program to enter base and height of a triangle and find its area*/
import java.util.*;
class Triangle2{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height : ");
		int height = sc.nextInt();
		System.out.println("Enter base : ");
		int base = sc.nextInt();
		System.out.println("Area is " + ((height*base)/2));
	}

}