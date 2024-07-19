import java.util.*;
class SumOfOdd{
	public static void main(String[] args){
		System.out.println("Chhose n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(n>0){
			if(i%2==1){
				sum = sum + i;
				n--;
			}
			i++;
		}
		System.out.println(sum);
	}
}