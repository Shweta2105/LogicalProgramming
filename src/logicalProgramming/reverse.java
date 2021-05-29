package logicalProgramming;

import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int rev = 0;
		while(num != 0) {
			int temp = num%10;
			rev = rev*10 + temp;
			num /=10;
			
		}
	System.out.println("The number reversed is : "+rev);
	}


}
