package buildInMethods;

import java.util.Scanner;

public class equal {
   
	public static boolean equals(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 =scan.nextLine();
		String s2 = scan.nextLine();
		
		System.out.println(equals(s1,s2));

	}

}
