package logicalProgramming;

import java.util.Scanner;

public class vendingMachine {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount :");
		
		int amount = scan.nextInt();
		countChange(amount);
		scan.close();
		
		
	}

	private static void countChange(int amount) {
		int[] currency = new int[] {1000, 500, 100, 50, 10, 5, 2,1}; 
		int[] counter = new int[8];
		
		for(int i=0; i<8; i++) {
			if(amount >= currency[i]) {
				counter[i] = amount / currency[i];
				amount = amount - counter[i] * currency[i];
				
			}
		}
			System.out.println("currency count :: ");
			for(int i=0; i<8; i++) {
				if(counter[i] !=0) {
					System.out.println(currency[i]+" : "+counter[i]);
					
				}
				
			}
	}

}
