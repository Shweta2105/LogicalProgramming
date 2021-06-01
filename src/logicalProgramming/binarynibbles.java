package logicalProgramming;
import java.util.Scanner;

public class binarynibbles {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = scan.nextInt();
		
		int number = toBinary(num);
		System.out.println(+ number ); 
		int x = swapNibbles(num);
		System.out.println( + x);
		

	}
	public static int toBinary(int n)
	  {
		
        if (n > 1) {
            toBinary(n / 2);
        }
        int number = n % 2;
        
        System.out.print(number);
        return number ;
	  }
	static int swapNibbles(int x)
	{
	    
	  int value = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	  
	   return value;
	}

}
