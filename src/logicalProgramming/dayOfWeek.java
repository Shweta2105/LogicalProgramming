package logicalProgramming;
import java.util.Date;
import java.text.SimpleDateFormat;

public class dayOfWeek {
	public static void main(String[] args)throws Exception {
		int d=Integer.parseInt(args[0]);
		  int m=Integer.parseInt(args[1]);
		  int y=Integer.parseInt(args[2]);
		  if(m <= 12) {
			  System.out.println(m);
			  
		  }
		  if(0 < d && d <= 6) {
			  switch(d) {
			  case 0:
				  System.out.println("Sunday");
				  break;
			  case 1:
				  System.out.println("Monday");
				  break;
			  case 2:
				  System.out.println("Tuesday");
				  break;
			  case 3:
				  System.out.println("Wednesday");
				  break;
			  case 4:
				  System.out.println("Thursday");
				  break;
			  case 5:
				  System.out.println("Friday");
				  break;
			  case 6:
				  System.out.println("Saturday");
				  break;
			  default:
				  System.out.println("Invalid");
			  }
			  System.out.println(d);
		  }
		    
		   
		    System.out.println(y);
		    
		    double y0 = (double)(y -(14 - m)/12);
		    double x = y0 +y0/4 - y0/100 +y0/400;
		    double m0 =(double)( m + 12 *((14-m)/12)-2);
		    double d0 =(double)(d + x +31*m0 /12)%7;
		    
		    System.out.println("y0 = "+y0);
		    System.out.println("x = "+x);
		    System.out.println("m0 ="+m0);
		    System.out.println("d0 ="+d0);
		    
		    		
	  }
}
