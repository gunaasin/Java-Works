package buildInMethods;

import java.util.Scanner;

public class indexoff {
static int indexOf(String n , char ch , int k){
		int count = 0;
		for (int i =0;i<n.length();i++)
		{
			if(ch==n.charAt(i))
			{
				count++;
				if(count==k)
				{
					return i;
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		int k = scan.nextInt();
		System.out.println(indexOf(s,ch,k));
	}

}
