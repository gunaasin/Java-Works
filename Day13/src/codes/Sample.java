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
	    float b = (float) a;
        
	    System.out.println(b);
//	     if convert after . only 2 digit ----> System.out.printf("%.5f",b);
	    System.out.printf("%.2f",b);
	}

}
