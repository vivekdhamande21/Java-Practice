import java.util.*;
class NumberToAlphabets{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Number");
		  int number = sc.nextInt();
      
  void GoToSwitch(int i){
      switch(i){
        case 0 : System.err.println(" zero ");
       break;

        case 1 : System.err.println(" one ");
        break;

        case 2 : System.err.println(" two ");
        break;

        case 3 : System.err.println(" three ");
        break;

        case 4 : System.err.println(" four ");
        break;

        case 5 : System.err.println(" five ");
        break;

        case 6 : System.err.println(" six ");
        break;

        case 7 : System.err.println(" seven ");
        break;

        case 8 : System.err.println(" eight ");
        break;

        case 9 : System.err.println(" nine ");
        break;

        default : System.err.println("Enter valid number");
        break;
      }
    }
	}	
}