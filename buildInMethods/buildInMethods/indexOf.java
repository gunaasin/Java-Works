package buildInMethods;

import java.util.Scanner;

public class indexOf {
	
static int indexOF(String n , char ch){
		
		for (int i =0;i<n.length();i++)
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
		System.out.println(indexOF(s,ch));

	}

}
