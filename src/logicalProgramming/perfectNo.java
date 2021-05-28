package logicalProgramming;
import java.util.Scanner;

public class perfectNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i = 1; i<num; i++) {
			if(num%i ==0 ) {
				System.out.println("Factors :"+i);
				sum = sum +i;
				
			}
		}
		if(sum == num) {
			System.out.println("Number is perfect  number");
		}
		else {
			System.out.println("Number is not perfect number");
		}
	}

}
