package codes;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the celsius value :");
		int c = scan.nextInt();
		
//		(0°C × 9/5) + 32 = 32°F
		
		float f = (c * 9.0f /5) + 32;
		System.out.println(c + " celsius converted into fahrenheit : " + f);
	
	
	
	    double a = 18.2324232323423432;
//	    float only convert after . 5 digit , double to float
	    float b = (float) a;
        
	    System.out.println(b);
//	     if convert after . only 2 digit ----> System.out.printf("%.5f",b);
	    System.out.printf("%.2f",b);
	    System.out.println();
	    
	    
	    
	    
	    if (c%5==0) {
	    	System.out.println("yes");
	    }
	    else  {
	    	System.out.println("No");
	    }
	    
	    
	    
	    if(c%10==0) {
	    	System.out.println("it also 2 and 5 divisible");
	    }
	    else if (c%2==0) {
	    	System.out.println("its 2 divisible");
	    }
	    else if(c%5==0)  {
	    	System.out.println("ist 5 divisible");
	    }
	    
	    
	    
	    int num = 12345;
	    int num2 = num/1000;
	    System.out.println(num2);
	}

}
