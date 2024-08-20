package buildInMethods;

import java.util.Scanner;

public class lastIndex {
static int lastIndexOf(String n , char ch){
		
		for (int i =n.length()-1;i>=0;i--)
		{
			if(ch==n.charAt(i))
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		System.out.println(lastIndexOf(s,ch));
	}

}
