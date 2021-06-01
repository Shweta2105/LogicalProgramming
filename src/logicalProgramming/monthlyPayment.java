package logicalProgramming;
import java.util.Scanner;

public class monthlyPayment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principal amt, rate of interest and year : ");
		
		double princpal = scan.nextDouble();
		double rate = scan.nextDouble();
		double yr = scan.nextDouble();
		
		scan.close();
		
		double payment = monthPayment(princpal,rate,yr);
		
		System.out.println("calculated payment is = "+payment);
		
		
	}

	private static double monthPayment(double princpal, double rate, double yr) {
		
		double n = 12 * yr;
		double r = rate / (12 * 100);
		
		double pay = (princpal *rate) /(1 - (Math.pow((1+r),(-n))));
		
		return pay;
	}

}
