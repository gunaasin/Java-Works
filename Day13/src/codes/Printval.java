package codes;

import java.util.Scanner;

public class Printval {
	
static String angryProfesser(int k,int[] a)
	{
		int count = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
			{
				count++;
			}	
		}
		if(count >=k) {
			return "THE CLASS START";
		}else {
			return "THE CLASS STOPED";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int k = scan.nextInt();

	int[] a = new int[n];
	
	for(int i=0;i<a.length;i++)
	{
		a[i] = scan.nextInt();
	}
	
	System.out.println(angryProfesser(k , a));
				
	}

}
