/*Write a program to input month number and print number of days in that month.*/

/*Write a program to input week number and print week day (Week starts on Monday and
ends on Sunday).*/
import java.util.*;
class MonthDay{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of month");
        int day = sc.nextInt();
		switch (day) {
            case 1: 
                System.out.println("31");
                break;
            case 2: 
                System.out.println("28/29");
                break;
            case 3: 
                System.out.println("31");
                break;
            case 4: 
                System.out.println("30");
                break;
            case 5: 
                System.out.println("31");
                break;
            case 6: 
                System.out.println("30");
                break;
            case 7: 
                System.out.println("31");
                break;
            case 8: 
                System.out.println("31");
                break;
            case 9: 
                System.out.println("30");
                break;
            case 10: 
                System.out.println("31");
                break;
            case 11: 
                System.out.println("30");
                break;
            case 12: 
                System.out.println("31");
                break;
            default:
                throw new AssertionError();
        }
	}
}