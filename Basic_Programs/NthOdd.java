import java.util.*;
class NthOdd{
	public static void main(String[] args){
		System.out.println("Chhose n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(n>0){
			if(i%2==1){
				n--;				
			}
			i++;
		}
		System.out.println(i-1);
	}
}