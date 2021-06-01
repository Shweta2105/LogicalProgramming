package logicalProgramming;
import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = scan.nextInt();
		
		int bin = toBinary(num);
		
		System.out.println(+bin);
		
	}

	private static int toBinary(int num) {
		
		if(num > 1) {
			toBinary(num/2);
			
		}
		
		int number = num%2;
		String bin = "";
		bin = bin + number;
		System.out.print(bin);
		int b = Integer.parseInt(bin);
		//System.out.print(b);
		
		// TODO Auto-generated method stub
		return b;
	}

}
