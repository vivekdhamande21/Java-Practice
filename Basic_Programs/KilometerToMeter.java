import java.util.*;
class KilometerToMeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in Kilo Meter:");
		int kiloMeter = sc.nextInt();
		System.out.println("Length in Meter is : " + (kiloMeter * 1000));
	}
}