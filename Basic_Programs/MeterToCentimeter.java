//Take a number a meters, convert it to centimeters, then print it on the screen?
import java.util.*;
class MeterToCentimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in Meter:");
		int meter = sc.nextInt();
		System.out.println("Length in Centi Meter is : " + (meter * 100));
	}
}