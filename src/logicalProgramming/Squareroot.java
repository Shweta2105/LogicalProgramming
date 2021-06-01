package logicalProgramming;
import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		double n = scan.nextDouble();
		double l = scan.nextDouble();
		
		System.out.println(sqrt(n,l));
		scan.close();
	}

	private static double sqrt(double n, double l) {
		double x = n;
		double root;
		
		int count = 0;
		
		while (true) {
			count++;
			root = 0.5 * (x + (n / x));
			
			if (Math.abs(root - x) < 1)
				break;
			x = root;
			
		}
			
		return root;
	}

}
