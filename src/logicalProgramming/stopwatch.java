package logicalProgramming;
import java.util.concurrent.TimeUnit;
public class stopwatch {
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(start);
		
		long end = System.nanoTime();
		System.out.println(end);
		long elapse = end - start;
		System.out.println("Time elapse is nano second:"+ elapse);
	}

}
