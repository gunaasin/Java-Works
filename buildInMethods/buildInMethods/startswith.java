package buildInMethods;

import java.util.Scanner;

public class startswith {
	
	public static boolean startWith(String s1,String s2) {
		
		for(int i =0;i<=s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				
			}
		}
		
		
		
		
		
		
		return false;
	}
	
	
	public static void main(String[] srgs) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String s1 = scan.nextLine();
		System.out.println(startWith(s,s1));
	}
}
