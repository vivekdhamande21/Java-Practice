import java.util.*;
class LetterOfEnglish{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter");
		char ch = sc.next().charAt(0);
        if(Character.isLetter(ch))
            System.out.println("English");
        else
            System.out.println("Not English");
	}
}