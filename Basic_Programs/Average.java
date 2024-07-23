/*Write a program to take marks of five subjects (maximum marks that can be scored are 75) and
calculate total, average and percentage*/

import java.util.*;
class Average{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of all 5 subjects : ");
		System.out.println("Enter sub1 marks:");
		float sub1 = sc.nextInt();
		if(sub1<=75){
			System.out.println("Enter sub2 marks:");
			float sub2 = sc.nextInt();
			if(sub2<=75){
				System.out.println("Enter sub3 marks:");
				float sub3 = sc.nextInt();
				if(sub3<=75){
					System.out.println("Enter sub4 marks:");
					float sub4 = sc.nextInt();
					if(sub4<=75){
						System.out.println("Enter sub5 marks:");
						float sub5 = sc.nextInt();
						if(sub5<=75){
							System.out.println("Percentage is " + (sub1 + sub2 + sub3 + sub4 + sub5)/5);
						}
						else{
							System.out.println("Please Choose valid marks (below 75)");
						}
					}
					else{
						System.out.println("Please Choose valid marks (below 75)");
					}
				}
				else{
					System.out.println("Please Choose valid marks (below 75)");
				}
			}
			else{
				System.out.println("Please Choose valid marks (below 75)");
			}
		}
		else{
			System.out.println("Please Choose valid marks (below 75)");
		}
		
	}

}