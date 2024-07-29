import java.util.*;
class DigitsCount{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		 // 1. Convert the number to a string
        	String numStr = Integer.toString(number);
		// 2. Create an array with the same length as the string
        	int[] digits = new int[numStr.length()];
		 // 3. Loop through the string and extract each digit
        	for(int i = 0; i < numStr.length(); i++) {
            		digits[i] = Character.getNumericValue(numStr.charAt(i));
        	}
		int length = digits.length;
		int check[] = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < 10; i++){
			int j = 0;
            int count = 0;
			while(j < length){
				if(check[i]==digits[j]){
 					count++;
				}
				j++;
				if(j >= length && count > 0){
					System.out.println(check[i] + " is " + count + " time ");
				}	
			}
		}
	}	
}