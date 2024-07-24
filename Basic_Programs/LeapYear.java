/*Take the year as an input, print on the screen if it is a Leap year*/
import java.util.*;
class LeapYear{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		if(year%4 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Normal year");
	}
}