package buildInMethods;

import java.util.Scanner;


public class tochararray {
	public static char[] toCharArray(String s) {
		char[] c = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			c[i] = s.charAt(i);	
		}
		
		return c;
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	
	System.out.println(toCharArray(s));

	}

}
