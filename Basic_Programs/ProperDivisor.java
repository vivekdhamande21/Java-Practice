import java.util.*;
class ProperDivisor{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Number");
		  int number = sc.nextInt();
      int i = 1;
      while(i < number){
        if(number%i == 0){
          System.out.println(i);
        }
        i++;
      }
  }	
}