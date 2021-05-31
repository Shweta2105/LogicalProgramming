package logicalProgramming;
import java.util.Scanner;



public class temperatureConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the choice :");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("Enter the temperature in celsius");
			double fahren = sc.nextDouble();
			System.out.println("Temperature in degree celsius :"+fahren);
			double result1 = celsius(fahren);
			System.out.println("Fahrenheit teperature :"+ result1);
			break;
		case 2:
			System.out.println("Enter temerautre in fahrenheit : ");
			double celsius = sc.nextDouble();
			double result2 = fahren(celsius);
			System.out.println("Celsius temperature : "+result2);
			break;
		default:
			System.out.println("invalid");
		}
		sc.close();
	}

	public static double fahren(double celsius) {
		// TODO Auto-generated method stub
		return (celsius-32)*5/9;
	}

	public static double celsius(double fahren) {
		// TODO Auto-generated method stub
		return fahren*9/5+32;
	}

}
