import java.lang.*;
import java.util.*;
class InchesToFeet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Inches:");
		float inch = sc.nextFloat();
		System.out.println("Length in Feet is : " + (inch/12));
	}
}