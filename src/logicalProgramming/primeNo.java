package logicalProgramming;
import java.util.Scanner;

public class primeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		sc.close();
		int flag = 0;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				flag = 1;
				
			}
		}
		if(flag == 1) {
			System.out.println("Number is not prime");
			
		}
		else {
			System.out.println("Number is prime ");
		}
			
	}

}
