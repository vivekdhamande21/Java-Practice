/*Write a program to take two angles of a triangle as input and find the third angle*/

import java.util.*;
class Triangle{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle : ");
		int angle1 = sc.nextInt();
		System.out.println("Enter second angle : ");
		int angle2 = sc.nextInt();
		System.out.println("Third angle is " + (180 - (angle1 + angle2)));
	}

}