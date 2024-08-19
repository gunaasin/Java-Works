package buildInMethods;
import java.util.Scanner;

public class upperCase {
	
	
	static String  toUpperCase(String s)
	{
		String t = "";
		for(int i =0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if (c>='a' && c<='z') 
			{
				t = t + (char)(c-32);
			}
			else 
			{
				t = t + (char)(c);
			}
		}
		return t;	
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		
		System.out.println(toUpperCase(n));
	}

}
