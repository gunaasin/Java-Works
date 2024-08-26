package buildInMethods;

import java.util.Scanner;

public class lastIndexOff {
    static int lastIndexOFF(String n , char ch , int k) {
    	int count = 0;
		for (int i =n.length()-1 ; i>=0 ; i--)
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
		System.out.println(lastIndexOFF(s,ch,k));

	}

}
