package logicalProgramming;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of n :");
		n = scan.nextInt();
		scan.close();
		System.out.println("Fibonacci series :");
		for(int i =1; i<=n; i++) {
			sum = sum + i;
			System.out.print(sum+" ");
		}
	}

}
