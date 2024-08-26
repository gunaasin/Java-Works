package buildInMethods;

import java.util.Scanner;

public class trim {
	public static String trimString(String s) {
		int si=0;  // take the starting index as 'si'
		int ei=0;  // take the ending index as 'ei'
		String t="";
		
		
		// first find out out the Starting char
		
		for(int i=0;i<=s.length();i++) {
			if(s.charAt(i)!=' ') //select non ' 'character 
			{
				si=i;
				break;
			}
		}
		
		// then find the last char
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') //select non ' 'character
			{
				ei=i;
				break;
			}	
		}
		
		for(int i =si;i<=ei;i++) { // then concat si to ei
			t=t+s.charAt(i);
			
		}
		
		return t;
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(trimString(s));
	}

}
